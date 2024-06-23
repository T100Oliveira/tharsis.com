package project;

import java.util.Scanner;

public class MultiplicaçaoVetores {
	
	public static void main(String[]args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o tamanho dos vetores");
		
		int tamanho = input.nextInt();

		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];
		int[] vetorResultado = new int[tamanho];
		
		System.out.println("digite os elementos do primeiro vetor");
		
		for(int i = 0; i<tamanho;i++) {
			
		vetor1[i] = input.nextInt();	
			
		}
		System.out.println("digite os elementos do segundo vetor");
		
		for(int i = 0 ;i<tamanho;i++) {
			
		vetor2[i] = input.nextInt();	
			
		}
		for(int i = 0;i<tamanho;i++) {
			
		vetorResultado[i] = vetor1[i ]* vetor2[i];	
			
		}
		System.out.println("vetor resultado:");
		
		for(int i=0;i<tamanho;i++) {
			
		System.out.println(vetorResultado[i] + "");
		
		
			
			
		}
		
		
	}

}
