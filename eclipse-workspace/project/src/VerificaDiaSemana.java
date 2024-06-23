import java.util.Scanner;

public class VerificaDiaSemana {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);	
	
	System.out.println("digite um nome de um dia da semana");
			
    String diaSemana = scanner.nextLine();
    
    if(diaSemana.equalsIgnoreCase("segunda") ||
       diaSemana.equalsIgnoreCase("terca") ||	
       diaSemana.equalsIgnoreCase("quarta") ||
       diaSemana.equalsIgnoreCase("quinta") ||	
       diaSemana.equalsIgnoreCase("sexta") 	)
    		
    {System.out.println(diaSemana + " e um dia util da semana");
    	
    	
    	
    	
    }else if( diaSemana.equalsIgnoreCase("sabado")|| diaSemana.equalsIgnoreCase("domingo"))
    		
    {System.out.println(diaSemana  + " e um dia de fim de semana");	
    		
    }else {System.out.println("dia invalido");	}
    
    scanner.close();
}}
