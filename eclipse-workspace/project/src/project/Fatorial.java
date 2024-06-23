package project;

public class Fatorial {
	
	public static void main(String[]args) {

		int numero = 7;
		long resultado = calcularFatorial(numero);
		System.out.println("o fatorial de " + numero + " e " + resultado);

	}
	
public static long calcularFatorial(int numero) {
	if(numero == 0) {
		return 1;
	}else { return numero + calcularFatorial(numero-1);
	
	
	}


}


}