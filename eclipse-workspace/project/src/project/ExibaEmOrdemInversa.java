package project;

import java.util.Scanner;

public class ExibaEmOrdemInversa {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);	
			
		System.out.println("digite o tamanho do vetor:");	
     int tamanho = input.nextInt();
     
     int[] vetor = new int[tamanho];
     System.out.println("digite os elementos do vetor");
     
     for(int i =0;i<tamanho;i++) {
    	 
    vetor[i] = input.nextInt();	 
    	 
    	 
     }
     System.out.println("elemenmtos do vetor em ordem inversa");
     for(int i = tamanho-1;i>=0;i--) {System.out.println(vetor[i]+"");
}
}}