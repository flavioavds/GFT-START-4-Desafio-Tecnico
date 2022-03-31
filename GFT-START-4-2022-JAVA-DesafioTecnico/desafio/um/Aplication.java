package desafio.um;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
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
		
		System.out.print("Informe a Data que deseja calcular (dd/MM/yyyy): ");
		Date dataCalcular = sdf.parse(sc.next());
		
		//NA HORA DO NERVOSISMO EU ESQUECI DE FAZER A CONVERSAO
		LocalDate conversao1 = dataDeNascimento.toInstant().atZone( ZoneId.systemDefault() ).toLocalDate();
		LocalDate conversao2 = dataCalcular.toInstant().atZone( ZoneId.systemDefault() ).toLocalDate();

        Period period = Period.between(conversao1, conversao2);

        int anos = Math.abs(period.getYears());
        int meses = Math.abs(period.getMonths());
        int dias = Math.abs(period.getDays());
        System.out.println("A Diferença entre datas é: "+ anos +" ano(s), "+ meses +" mes(es), "+ dias +" dias");
        
        System.out.println("Diferença entre minha Data atual: ");
        
        System.out.println();
        //Data Atual6552
        Date date = new Date();
        LocalDate date2 = date.toInstant().atZone( ZoneId.systemDefault() ).toLocalDate();
        period = Period.between(conversao1, date2);
        anos = Math.abs(period.getYears());
        meses = Math.abs(period.getMonths());
        dias = Math.abs(period.getDays());

        System.out.println("A Diferença entre datas é: "+ anos +" ano(s), "+ meses +" mes(es), "+ dias +" dias");
		
		
		
		sc.close();
	}
	
}
