package project;

import java.util.Scanner;

public class SegundoMaiorElementorVetor {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o tamanho do vetor");
		
		int tamanho = input.nextInt();
		
		int[] vetor = new int[tamanho];
		
		System.out.println("digite os elementos do vetor");
		
		
		for(int i = 0; i<tamanho;i++) {
			
			
			vetor[i] = input.nextInt();
		}
		
	 int maior = Integer.MIN_VALUE;
	 int segundoMaior = Integer.MIN_VALUE;
	

  for(int i = 0; i<tamanho;i++)	{
	  if(vetor[i]>maior) {
		  segundoMaior = maior;
		  maior = vetor[i];
	  }else if ( vetor[i] >segundoMaior && vetor[i] != maior ){
		  
	  segundoMaior = vetor[i]; }
	  
	  
	  }
	  if(segundoMaior != Integer.MIN_VALUE) {System.out.println("o segundo maior elemento e "+ segundoMaior);}
	  
	  else {System.out.println("nao tem segundo maior elemento");
	  
  
	  }
	  }
}