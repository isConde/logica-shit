package Exercícios;

import java.util.Scanner;

public class elogiador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá, qual o seu nome: ");
		
		String nome = scanner.nextLine();
		
		Scanner opção = new Scanner(System.in);
		System.out.println("Agora, escolha entre 1 e 3.");
		
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		
		case 1: 
			System.out.println (nome + " você é um profissional sempre atualizado!");
			break;
		
		case 2:
			System.out.println (nome + " você tem as unhas lindas!");
			break;
		
		case 3:
			System.out.println (nome + " você é muito simpática!");
			break;
		}
				
	}
	
	
}

