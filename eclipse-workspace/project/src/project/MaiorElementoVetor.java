package project;

import java.util.Scanner;

public class MaiorElementoVetor {
	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);	
		
	
	
	System.out.println("digite o tamanho do vetor");
	int quantidade =  input.nextInt();
	int[] vetor= new int[quantidade];
System.out.println("digite os elementos do  vetor");

for(int i =0; i< quantidade; i++) {
	
	System.out.println("elementos"+(i+1)+":");
	
	vetor [i] = input.nextInt();
}
int maior = vetor[0];

for(int i =1; i< quantidade; i++) {
	
	if(vetor[i] > maior) {
		maior = vetor[i];
	}
	
}
System.out.println("o maior elementos do vetor e "+maior);



}
}