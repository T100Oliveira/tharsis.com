package project;

import java.util.Scanner;

public class SomeVetores {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("digite o tamanho dos vetores");
	int tamanho = input.nextInt();
	
	
	int[] vetor1 = new int[tamanho];
	int[] vetor2  = new int[tamanho]; 
	int[] vetorSoma = new int[tamanho];
	
	
	
	System.out.println("digite os elementyos do primeiro vetor:");
	
	for(int i = 0; i< tamanho;i++) {
		
	vetor1[i] = input.nextInt();
		
		
	}
	
	System.out.println("digite os elementos do segundo vetor");
	
	for(int i = 0; i<tamanho; i++) {
		
		vetor2[i] = input.nextInt();
		
	}
	
	
	for(int i = 0;i<tamanho;i++) {
		
		vetorSoma[i] = vetor1[i] + vetor2[i] ; 
		
		
	}
	
	
	
	
	System.out.println("a sdoma dos elementos correspondente dos vetores e:");
	
	for(int i = 0 ;i < tamanho;i++) {
		
		System.out.println(vetorSoma[i]+"");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
