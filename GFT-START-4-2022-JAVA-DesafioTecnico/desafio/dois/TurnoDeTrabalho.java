package desafio.dois;

/*
. Faça um programa que pergunte em que turno você Trabalha.
Peça para digitar: (vale 3 pontos)
M-matutino
V-vespertino
N-noturno.
Imprima a mensagem “Bom dia!” ou “Boa Tarde” ou “Boa Noite” ou “Valor
inválido”, conforme o caso.

*/

import java.util.Scanner;

public class TurnoDeTrabalho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por Favor digite o seu turno: ");
		
		//Minha entrada e fiz colocando o codigo do Caracteres para mesmo se a pessoa digitar minusculo tornar maiuscula
		char turno = sc.next().toUpperCase().charAt(0);
		
		if(turno == 'M') {
			System.out.println("Bom dia!");				
		}
		else if (turno == 'V') {
			System.out.println("Boa Tarde!");
		}
		else if (turno == 'N') {
			System.out.println("Boa Noite");
		}
		else {
			System.out.println("Valor Inválido");
		}
	
		sc.close();
	}

}
