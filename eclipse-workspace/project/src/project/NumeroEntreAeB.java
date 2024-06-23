package project;

import java.util.Scanner;

public class NumeroEntreAeB {

	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);
		
	System.out.println("digite o valor de a");	
		
	int a = input.nextInt();
	
	System.out.println("digite o valor de b");
	
  int b = input.nextInt();
		
		
		System.out.println("os numeros entre "  + a +   " e "  + b +  " sao ");
		
	if(a<b)	{
		for(int i = a+1;i< b; i++) {
			System.out.println(i+"");
			
			
		}	
		}else {
			for( int i = b; i<a;i++) {System.out.println(i+"");}
		}
	}
		
		
		
	}

