package project;

import java.util.Scanner;




public class ContagemnNumero {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o tamanho do vetor");
		
		int tamanho = input.nextInt();
		
		int[] vetor = new int[tamanho];
		
		
		System.out.println("digite os elementos do vetor");
		
		for(int i= 0; i<tamanho; i++) {
			
			vetor[i] = input.nextInt();
		}
		
		System.out.println("digite o numero  a ser buscado");
		
		int numeroBuscado = input.nextInt();
		
		int contagem = 0;
		for(int i = 0; i< tamanho; i++) {
			
		if(vetor[i] == numeroBuscado) {
			
			contagem ++;
			
		}
			
		}System.out.println("o numero " + numeroBuscado + " aparece " + contagem  + " vezes ");
		
	}

}
