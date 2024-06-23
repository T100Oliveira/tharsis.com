package project;

import java.util.Scanner;

public class Potencia {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("digite o numero da base");
		int base = input.nextInt();
		System.out.println("digite o numero do expoente");
		int expoente = input.nextInt();
		int resultado = calcularPotencia(base,expoente);
		System.out.println("resultado: " + resultado);
	}
	public static int calcularPotencia(int base,int expoente) {
	if(expoente == 0) {
		return 1;
	} else {return base *calcularPotencia( base,expoente-1);         }
	   

}}
