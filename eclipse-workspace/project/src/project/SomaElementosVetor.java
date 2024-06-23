package project;

import java.util.Scanner;

public class SomaElementosVetor {
	
	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);	
		
	
	
	System.out.println("digite o tamanho do vetor");
	int n =  input.nextInt();
	int[] vetor= new int[n];
	
	
	
	System.out.println("digite os elemntos do vetor");
	
	for(int i = 0; i<n;i++) {
		vetor[i] = input.nextInt();
		
		
	}
	int soma = 0;
	for(int i = 0 ; i<n; i++) {
		
		soma += vetor[i];
		
	}
	System.out.println("a soma dos elememntos e   "+soma);
	}

}
