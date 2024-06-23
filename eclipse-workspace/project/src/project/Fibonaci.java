package project;

import java.util.Scanner;

public class Fibonaci {
	
	public static void main(String[]args) {
   Scanner input = new Scanner(System.in);
   System.out.println("digite o numero que vc deseja a fibonaci");
   int limite = input.nextInt();
   System.out.println("sequencia de fibonaci ate "+limite+"=");
		for (int i = 0;i<limite;i++) {
			System.out.println(calcularFibonaci (i)+"");}}
		
		public static int calcularFibonaci(int numero) {
			
			if(numero<=1) {
			  return numero;
			  
				
			}else { return calcularFibonaci(numero-1) + calcularFibonaci(numero-2);}
		
	}
		
}
