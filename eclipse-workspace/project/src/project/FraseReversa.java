package project;

import java.util.Scanner;

public class FraseReversa {
public static void main(String[]args) {   
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("digite uma frase");
	
	String frase = input.nextLine();
	
	String fraseReversa = new StringBuilder(frase).reverse().toString();
	
	System.out.println("a frase de tras para frente e "+fraseReversa);
	
}
}
