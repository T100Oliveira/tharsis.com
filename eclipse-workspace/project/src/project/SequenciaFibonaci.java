package project;

import java.util.Scanner;

public class SequenciaFibonaci {
	
	
   public static void main(String[]args) {
	   
	   Scanner input = new Scanner(System.in);
	 
	 int numero = input.nextInt();
	 
	 int primeiroTermo = 0;
	int segundoTermo = 1;
	System.out.println("sequencia de fibonaci ate"+numero+":");
	
	while(primeiroTermo<=numero) {
	System.out.println(primeiroTermo+"");	
		
		int proximoTermo = primeiroTermo+segundoTermo;
		primeiroTermo = segundoTermo;
		segundoTermo =  proximoTermo;
		
		
		
	}
	
   }}