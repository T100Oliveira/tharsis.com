package project;

import java.util.Scanner;

public class VerificaParesVetor {
	
	
	public static void main(String []args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("digite o tamanho do vetor");
	
	int tamanho = input.nextInt();
	
	int[] vetor = new int[tamanho];
	
	System.out.println("digite os elementos do vetor");
	for(int i = 0; i<tamanho;i++) {
		vetor[i] = input.nextInt();
	}
		boolean todosPares  = true;
	
	for (int i = 0;i<tamanho;i++) {
		
	if(vetor[i] % 2!=0) {
		
		
		todosPares = false;
		break;
	}
	}
	if(todosPares) {
		
	System.out.println("todos os elementos sao pares");
	}else {System.out.println("existem elementos impares no vetor");}
		
		
		
		
	}
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

