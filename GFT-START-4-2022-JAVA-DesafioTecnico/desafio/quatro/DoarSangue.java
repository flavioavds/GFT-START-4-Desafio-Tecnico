package desafio.quatro;

/*
 A idade permitida para doar sangue é entre 18 e 67 anos. Faça um
aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar
sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&). 
 */
import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Codigo Simples com a Idade se pode doar sangue ou não
		System.out.print("Por Favor informe sua idade: ");
		int idade = sc.nextInt();
		
		//Minha condição foi conforme o Anunciado, fazendo as duas condiçãos que tem propriedades diferente de EE e OU
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
