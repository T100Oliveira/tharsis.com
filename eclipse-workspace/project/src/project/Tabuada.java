package project;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um numero");
		int numero = scanner.nextInt();
		
		
		System.out.println("tabuada do " + numero );
		for(int i =1; i<=10;i++) {
			
			int resultado = numero*i;
			System.out.println(numero+"x"+i+"="+ resultado);
			
			
		}
	}

}
