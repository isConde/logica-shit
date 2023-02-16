package Exercícios;

import java.util.Scanner;

public class ong {

	public static void main(String[] args) {

		int idade;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Olá! Por favor, insira sua idade: ");
		idade = leitor.nextInt();

		if (idade < 16) {
			System.out.println("Idade não permitida para votar, e você não pode embarcar!");

		} else if (idade <= 17 && idade >= 65) {
			System.out.println("Seu voto é opcional, e você pode embarcar!");

		} else if (idade >= 18 && idade <= 64) {
			System.out.println("Seu voto é obrigatório, e você pode embarcar!");
		}

		leitor.close();
	}
}