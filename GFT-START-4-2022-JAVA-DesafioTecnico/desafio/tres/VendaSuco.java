package desafio.tres;

/*
 Algumas crianças super inteligentes estão vendendo sucos com a seguinte
tabela de descontos: (vale 3 pontos)
Suco de Limão:
• Até 2 litros : desconto de 3% por litro
• Acima de 5 litros: Desconto de 5% por litro.
Suco de Tamarindo:
• Até 2 litros : desconto de 4% por litro
• Acima de 5 litros: Desconto de 6% por litro.
Escreva um algoritmo que leia o número de litros vendidos, o tipo de suco
(codificado da seguinte forma: L-limão. T-tamarindo), calcule e imprima o
valor a ser pago pelo cliente.
 */

import java.util.Scanner;

public class VendaSuco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Realizei meu codigo com a chamada de um caracter valido para Limão que é L e Tamarino que é T
		System.out.print("Qual suco você Deseja? Digite L para limão ou T para Tamarino: ");
		char suco = sc.next().toUpperCase().charAt(0);
		int litro;
		double valor;
		double soma;
		
		
		//Realizei minha condição
		if(suco == 'L') {
			System.out.print("Informe a quantidade de Litro: ");
			litro = sc.nextInt();
			System.out.print("Informe o valor do Suco: ");
			valor = sc.nextDouble();
			//o enunciado da questão diz que a condição é até dois litros tem desconto de 4%, isso quer dizer que o intervalo de 
			// acima de 2 e menor que 5 o valor é pago normal entre o litro e o valor
			if(litro <= 2) {
				soma = (valor * litro) - ((valor * litro) * (3/100f));
				System.out.printf("Valor a pagar: R$ %.2f%n",soma);				
			}else if (litro >=5) {
					soma = (valor * litro) - ((valor * litro) * (5/100f));
					System.out.printf("Valor a pagar: R$ %.2f%n",soma);
			}else {
				soma = valor * litro;
				System.out.printf("Valor a pagar: R$ %.2f%n",soma);
			}
		}else if(suco == 'T') {
			System.out.print("Informe a quantidade de Litro: ");
			litro = sc.nextInt();
			System.out.print("Informe o valor do Suco: ");
			valor = sc.nextDouble();
			//o enunciado da questão diz que a condição é até dois litros tem desconto de 3%, isso quer dizer que o intervalo de 
			// acima de 2 e menor que 5 o valor é pago normal entre o litro e o valor
			if(litro <= 2) {
				soma = (valor * litro) - ((valor * litro) * (4/100f));
				System.out.printf("Valor a pagar: R$ %.2f%n",soma);				
			}else if (litro >=5) {
					soma = (valor * litro) - ((valor * litro) * (6/100f));
					System.out.printf("Valor a pagar: R$ %.2f%n",soma);
			}else {
				soma = valor * litro;
				System.out.printf("Valor a pagar: R$ %.2f%n",soma);
			}
		}else {
			System.out.println("Valor Invalido!");
		}
		
		
		sc.close();
	}

}
