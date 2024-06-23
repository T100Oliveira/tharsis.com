package project;


	

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class aula22 {
	 
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		List <Integer> resultadosCombinados = new ArrayList<>();
		
		System.out.println("digite o tamanho do vetor");
		
		int tamanho = input.nextInt();
		
		int[] vetor = new int[tamanho];
		
		int resultado= 0;
		
		int soma = 0;
		
		 int 	 soma2 = 0;  
		int soma3 = 0;
		System.out.println("digite as idades dos alunos");
		
		for(int i= 0; i<tamanho; i++) {
			
			vetor[i] = input.nextInt();
		
		}
	System.out.println("digite o tamanho do segundo vetor");
		
		int tamanho2 = input.nextInt();
		
		int[]vetor2 = new int[tamanho2];
	
		
		System.out.println("digite a quantidade de alunos de cada idade tem na sala");
		
		for(int i= 0; i<tamanho2; i++) {
			
			vetor2[i] = input.nextInt();
		
	 
	  } 

	  for(int i = 0; i<tamanho; i++) {
		  
		
		
		soma = (vetor[i]  * vetor2[i]);
	  
	  
	
		  


		 soma2 = (soma+soma2);
		 
		  
	 soma3 = (soma2/10);
	 
	 soma3 = (soma3/tamanho);


	

	  
	  	 
	 
	  
	 
	  

	 
	 
	System.out.println("o resultado e " + soma3);
	 

		  
	}}
	  
		  
	  }
		




