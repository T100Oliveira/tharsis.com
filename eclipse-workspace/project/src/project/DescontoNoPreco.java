package project;

import java.util.Scanner;

public class DescontoNoPreco {
public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o valor");
		double preço = scanner.nextDouble();
		
	
		
	 double desconto = 0;
	 double resultado = 0;
	 System.out.println("digite quantos % sera o desconto");
	 desconto = scanner.nextDouble();
		
		
		
	
		
		desconto = preço/100*desconto;
		
	 resultado = (preço-desconto);
		
		
	if	( preço > 0) {
		
		System.out.println("o preço com desconto ficara "  + resultado );
		System.out.println("o desconto e de "+desconto);
	}else {System.out.println(" preço invalido");}
	

}
}