package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExibirNumeroVetor {
 
public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.println("digite o tamanho do vetor");
	double tamanho = input.nextDouble();
	
	double[] vetor =   new double[(int) tamanho];
	
	double  soma = 0;
	
	double soma2 = 0;
	
	
	double soma3 =0;
	
     double soma4 = 0;
	
	System.out.println("digite as idades dos alunos");
	
	for(double i = 0; i<tamanho; i++) {
		
		vetor[(int) i] = input.nextInt();
		


	
	}
System.out.println("digite o tamanho do segundo vetor");
	
	double tamanho2 = input.nextInt();
	
	double[]vetor2 = new double[(int) tamanho2];
	
	
	System.out.println("digite a quantidade de alunos   de cada idade tem na sala");
	
	for(double i= 0; i<tamanho2; i++) {
		
		vetor2[(int) i] = input.nextInt();
	

 

 
 
  


 
	 soma =  (vetor[(int)i] * vetor2[(int)i]);
     soma2 = (soma+soma2);
    soma3 = (vetor[(int)i]+soma3);
    
   soma4 = (soma2/soma3);
	}
	
	 System.out.println("o resultado e  " +  soma4);
 }
	  
}
	


	

