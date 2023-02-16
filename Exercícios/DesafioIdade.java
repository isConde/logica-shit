package Exercícios;

import java.util.Scanner;

public class DesafioIdade {

	public static void main(String[] args) {
		
		int anoNascimento;
		int subtracao;
		
		Scanner leitor = new Scanner(System.in);
				System.out.println("Olá! Por favor, insira o seu ano de nascimento: ");
		anoNascimento = leitor.nextInt();
				
		subtracao = 2023 - anoNascimento;
		
				System.out.println("Sua idade é " + subtracao);
		leitor.close();
		

	}

}
