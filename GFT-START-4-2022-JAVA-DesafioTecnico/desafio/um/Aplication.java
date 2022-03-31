package desafio.um;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import desafio.um.entities.Pessoa;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe seu Nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe sua Data de Nascimento (dd/MM/yyyy): ");
		Date dataDeNascimento = sdf.parse(sc.nextLine());
		System.out.print("Informe a sua Altura: ");
		Double altura = sc.nextDouble();
		Pessoa pessoa = new Pessoa(nome, dataDeNascimento, altura);
		
		System.out.println(pessoa);
		System.out.println("Idade: " + dataDeNascimento);
		
		
		sc.close();
	}

}
