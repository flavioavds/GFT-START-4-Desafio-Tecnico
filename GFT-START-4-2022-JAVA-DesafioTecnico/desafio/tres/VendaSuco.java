package desafio.tres;

import java.util.Scanner;

public class VendaSuco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual suco voc� Deseja? Digite L para lim�o ou T para Tamarino: ");
		char suco = sc.next().toUpperCase().charAt(0);
		
		if(suco == 'L') {
			System.out.print("Informe a quantidade de Litro: ");
			int litro = sc.nextInt();
			System.out.print("Informe o valor do Suco: ");
			double valor = sc.nextDouble();
			//Se � em at� 2 Litros o enunciado n�o fala se � no intervalo de de acima de 2 a 5 se tem desconto
			if(litro <= 2) {
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
			// O Problema diz At� 2 litros  e depois de 5 ent�o h� um intervalo
			if(litro <= 2) {
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
