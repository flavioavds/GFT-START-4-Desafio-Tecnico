package desafio.dois;

import java.util.Scanner;

public class TurnoDeTrabalho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por Favor digite o seu turno: ");
		
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
