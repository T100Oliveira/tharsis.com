package project;

public class SomaDigitos {
	public static void main(String[]args) {
		
		
		int numeros = 123456789;
		int soma = calculaSomaDosDigitos(numeros);
		System.out.println("a soma dos digitos "+ numeros + " e " + soma);
	}
	public  static int calculaSomaDosDigitos(int numeros) {
		
		if(numeros<10) {
			return numeros;
		}else { return numeros%10 + calculaSomaDosDigitos (numeros/10);}
		
	}

}
