package project;

public class VerificarPrimo {
	
	public static void main(String[]args) {
		
	int numero = 16;
	if(verificaPrimo(numero)) {
		System.out.println(numero+"e um numero primo");
	}else {
		System.out.println(numero + " nao e um numero primo");
	}
	}
public static boolean verificaPrimo (int numero) {
if(numero<=1) {
	return false;
}
return verificaPrimoRecursivo(numero,2);

}

public static boolean verificaPrimoRecursivo(int numero,int divisor) {
	
	if(divisor == numero) {
		
		return true;
	}if(numero % divisor ==0) 
	{
		
		return false;
	}
	return verificaPrimoRecursivo(numero,divisor+1);
}
}