package desafio.quatro;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por Favor informe sua idade: ");
		int idade = sc.nextInt();
		
		
		if (idade >= 18 && idade <= 67) {
			System.out.println("Você é Doador de Sangue pode Doar Sangue");
		}else if (idade < 18 || idade > 67) {
			if(idade < 18) System.out.printf("Você não pode Doar Sangue idade abaixo de 18 anos e sua idade é: %d ", idade);
			if(idade > 67) System.out.printf("Você não pode Doar Sangue idade acima de 68 anos e sua idade é: %d ", idade);			
		}
		else {
			System.out.println("Fim do Programa!.");
		}
		
		sc.close();
	}

}
