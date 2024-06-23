package project;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[]args) {
		
	Scanner scanner = new Scanner(System.in);	
		
		
		System.out.println("digite o seu peso:");
		
		double peso = scanner.nextDouble();
		
		System.out.println("digite a sua altura:");
		
		double altura = scanner.nextDouble();
		double imc =peso/(altura*altura);
		
		String categoria;
		
		
		if(imc <18.5) {
			
		categoria = "abaixo do peso";	
		}else if(imc <25) {categoria = ": peso normal";
		}else if(imc <30) {categoria = ": sobrepeso";
		}else if(imc <35) {categoria = ": obesidade";
		}else { categoria = ": obesidade grave";}
		
		System.out.println("seu imc e: "+ imc);
		System.out.println("Categoria" + categoria);
	}
	
	
	
}
