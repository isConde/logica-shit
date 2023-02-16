package tipos;

import java.util.Scanner;

public class Atribuição {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		float ps, tcc, av1, av2, mediaNecessaria=7;
		
		System.out.println("Informe a nota da prova semestral");
		ps=scanner.nextFloat();
		
		System.out.println("Informe a nota do  TCC");
		tcc=scanner.nextFloat();
		
		System.out.println("Informe a nota da Av1");
		av1=scanner.nextFloat();
		
		System.out.println("Informe a nota da Av2");
		av2=scanner.nextFloat();
		
		float mediaFinal = (float) (ps * 0.5 + tcc * 0.3 + ((av1 + av2)/ 2) * 0.2);
		
		System.out.println("Média Final " + mediaFinal);
		
		if(mediaFinal>= mediaNecessaria){
			
			System.out.println("Aluno Aprovado!");
			
		}else if (mediaFinal>= 5){
			System.out.println("Aluno em Exame!");
		}else {
			System.out.println("Aluno Reprovado!");
		}
		
		scanner.close();
	}

}
