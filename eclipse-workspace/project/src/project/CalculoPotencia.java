package project;

import java.util.Scanner;

public class CalculoPotencia {
	
	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);
		
    System.out.println("digite o numero base");
		
	long base = input.nextLong();	
		
	System.out.println("digite o expoente");
		
    long expoente = input.nextLong();
    
    long resultado = 1;
    
    for(long i = 1; i<=expoente; i++) {
    	
    	resultado *= base;
    	
    	
    	
    	
    }
		
	System.out.println(base + " elevado " + expoente + " e " + resultado);	
	}
	
	
	
	
	
	
	

}
