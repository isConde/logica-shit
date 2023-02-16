package tipos;

import java.util.Scanner;

public class App {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		
		String nome = scanner.nextLine();
		
		System.out.println("Boa noite " + nome);
		
		scanner.close();
		
	}

}
