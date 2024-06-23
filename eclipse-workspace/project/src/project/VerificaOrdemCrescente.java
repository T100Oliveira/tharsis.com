package project;

import java.util.Scanner;

public class VerificaOrdemCrescente {
	
	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);	
		
	System.out.println("digite o tamanho do vetor:");	
		
	int tamanho = input.nextInt();
	
	int[] vetor = new int[tamanho];
		
	System.out.println("digite os elementos do vetor");	
	
	for(int i =0;i<tamanho;i++) {
		
		vetor[i] = input.nextInt();
		
	}
	
	boolean estaEmOrdemCrescenmte = true;
	for(int i = 0;i<tamanho-1;i++) {
		
		
		if(vetor[i]>vetor[i+1]) {
			
			estaEmOrdemCrescenmte = false;
			break;
		}
	}
	if(estaEmOrdemCrescenmte) {
		
	System.out.println("o vetor esta em ordem crescente");	
		
	}else {System.out.println("o vetor nao esta em ordem crescente");	
		
	}
	}
	}


