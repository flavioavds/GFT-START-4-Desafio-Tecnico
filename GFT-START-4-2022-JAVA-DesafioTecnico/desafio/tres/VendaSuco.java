package desafio.tres;

import java.util.Scanner;

public class VendaSuco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual suco você Deseja? Digite L para limão ou T para Tamarino: ");
		char suco = sc.next().toUpperCase().charAt(0);
		
		if(suco == 'L') {
			System.out.print("Informe a quantidade de Litro: ");
			int litro = sc.nextInt();
			System.out.print("Informe o valor do Suco: ");
			double valor = sc.nextDouble();
			if(litro >= 2 && litro < 5) {
				double soma = (valor * litro) - ((valor * litro) * (3/100f));
				System.out.printf("Valor a pagar: R$ %.2f%n",soma);				
			}else if (litro >=5) {
					double soma = (valor * litro) - ((valor * litro) * (5/100f));
					System.out.printf("Valor a pagar: R$ %.2f%n",soma);
			}else {
				double soma = valor * litro;
				System.out.printf("Valor a pagar: R$ %.2f%n",soma);
			}
		}else if(suco == 'T') {
			System.out.print("Informe a quantidade de Litro: ");
			int litro = sc.nextInt();
			System.out.print("Informe o valor do Suco: ");
			double valor = sc.nextDouble();
			if(litro >= 2 && litro < 5) {
				double soma = (valor * litro) - ((valor * litro) * (4/100f));
				System.out.printf("Valor a pagar: R$ %.2f%n",soma);				
			}else if (litro >=5) {
					double soma = (valor * litro) - ((valor * litro) * (6/100f));
					System.out.printf("Valor a pagar: R$ %.2f%n",soma);
			}else {
				double soma = valor * litro;
				System.out.printf("Valor a pagar: R$ %.2f%n",soma);
			}
		}else {
			System.out.println("Valor Invalido!");
		}
		
		
		sc.close();
	}

}
