package project;

import java.util.Scanner;

public class IndiceVetor {public static void main(String []args) {
	
Scanner input = new Scanner(System.in);

System.out.println("digite o tamanho do vetor");

int tamanho = input.nextInt();

int[] vetor = new int[tamanho];

System.out.println("digite os elementos do vetor");
for(int i = 0; i<tamanho;i++) {
	vetor[i] = input.nextInt();
}


 int soma = 0;
 
 for(int i = 0; i<tamanho;i++) {
	 
	soma = (vetor[i]+soma);																																																																																																												
	 
	 
 }
 if(soma>=0) {}System.out.println("a soma e de " + soma);

}

}