package project;

import java.util.Scanner;

public class VerificaMaioridade {
	
public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("digite a idade da primeira pessoa");
		int idade1 = scanner.nextInt();
		
		System.out.println("digite a idade da primeira pessoa");
		int idade2 = scanner.nextInt();
		
		
		System.out.println("digite a idade da primeira pessoa");
		int idade3 = scanner.nextInt();
		
		
		int contadorMaioridade = 0;
		
	   if(idade1>=18)	{
		   contadorMaioridade++;
	   }

	   if(idade2>=18)	{
		   contadorMaioridade++;
	   }
	   
	   if(idade3>=18)	{
		   contadorMaioridade++;
	   }
	   
	   System.out.println("quantidade de pessoas maiores de idade:"+ contadorMaioridade);
}}
