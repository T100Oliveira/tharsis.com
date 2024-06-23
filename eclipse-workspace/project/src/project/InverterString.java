package project;

import java.util.Scanner;

public class InverterString { 
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("escreva um texto:");		
	String texto = input.next();

	String textoInvertido = inverteString(texto);

	System.out.println("texto original:"+texto);
	System.out.println("texto invertido:"+textoInvertido);
		
	}
	public static String inverteString(String texto) {
		if(texto.isEmpty()) {
		return texto;	
			
		}else {
			char primeiroChar = texto.charAt(0);
			String restoString = texto.substring(1);
			return inverteString(restoString)+primeiroChar;
		}
		
	}
	
}
