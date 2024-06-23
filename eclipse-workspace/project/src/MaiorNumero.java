import java.util.Scanner;

public class MaiorNumero {
	
	
	public static void main(String[]args) {
		
	Scanner scanner= new Scanner(System.in);
		
	System.out.println("verifica qul dos tres numeros e maior");	
	
	
	
		System.out.println("digite o primeiro numero");
		int numero1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero");
		int numero2 = scanner.nextInt();
		
		
		System.out.println("digite o terceiro numero");
		int numero3 = scanner.nextInt();
		
	
	if(numero1<=numero2 && numero1<=numero3) {
		
	System.out.println(numero1+" ");	
       if(numero2<=numero3) {
    	   System.out.println(numero2+""+numero3);
       }else {System.out.println(numero3+""+numero2);}}
       else if(numero2<=numero1 && numero2<=numero3) {
    	   System.out.println(numero2 + "");
       }
	     if(numero1<=numero3) {System.out.println(numero2+""+numero3);
	     }else  {System.out.println(numero3+""+numero1);
	     }
	if(numero1<=numero2) {System.out.println(numero1+""+numero2);
	
	}else {System.out.println(numero2+""+numero1);
	
	
	}
	
	
	
	
	
	
	}
	
	
	
	
	
	
}