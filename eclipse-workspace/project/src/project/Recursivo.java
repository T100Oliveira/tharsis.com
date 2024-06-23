package project;

public class Recursivo {
	public static void main(String[]args) {
		
	String palavra = "hoje";
	boolean resultado = verificaPalindromo(palavra);
	System.out.println("a palavra " + palavra + " e um palindromo " +resultado);
		
		
	}
public static boolean verificaPalindromo( String palavra) {
	
	if(palavra.length()<=1) {
		return true;
	}else {
		char primeiro = palavra.charAt(0);
		char ultimo = palavra.charAt(palavra.length()-1);
	
	if( primeiro == ultimo) {
		
		String subPalavra = palavra.substring(1,palavra.length()-1);
		return verificaPalindromo(subPalavra);
		
	}else {return false;}
}
}
}