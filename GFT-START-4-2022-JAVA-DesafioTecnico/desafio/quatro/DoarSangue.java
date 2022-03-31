package desafio.quatro;

/*
 A idade permitida para doar sangue � entre 18 e 67 anos. Fa�a um
aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar
sangue ou n�o. Use alguns dos operadores l�gicos OU (||) e E (&&). 
 */
import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Codigo Simples com a Idade se pode doar sangue ou n�o
		System.out.print("Por Favor informe sua idade: ");
		int idade = sc.nextInt();
		
		//Minha condi��o foi conforme o Anunciado, fazendo as duas condi��os que tem propriedades diferente de EE e OU
		if (idade >= 18 && idade <= 67) {
			System.out.println("Voc� � Doador de Sangue pode Doar Sangue");
		}else if (idade < 18 || idade > 67) {
			if(idade < 18) System.out.printf("Voc� n�o pode Doar Sangue idade abaixo de 18 anos e sua idade �: %d ", idade);
			if(idade > 67) System.out.printf("Voc� n�o pode Doar Sangue idade acima de 68 anos e sua idade �: %d ", idade);			
		}
		else {
			System.out.println("Fim do Programa!.");
		}
		
		sc.close();
	}

}
