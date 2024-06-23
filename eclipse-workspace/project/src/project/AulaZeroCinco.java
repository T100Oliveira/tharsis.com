package project;

import java.util.Scanner;

public class AulaZeroCinco {
	
	public static void main(String[]args) {
		
	int [] []matriz = new int[5][5];
	
	int maiorValor = Integer.MIN_VALUE;
		
	int linhaMaiorValor = 0;
	
	int colunaMaiorValor = 0;
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("preeencha os valores da matriz");
		
		
	for(int i = 0; i<5 ;i++)	{
		for(int j =0; j<5; j++) {
			
		matriz [i][j] = scanner.nextInt();
		
			
		
		if(matriz[i][j]>maiorValor) {
			
		maiorValor= matriz[i][j];
		linhaMaiorValor = i;
		colunaMaiorValor = j;
		}
		}}
		System.out.println("o maior vaor da matriz e "+ maiorValor);
		
		System.out.println("ele esta naposicao["+linhaMaiorValor+"]["+colunaMaiorValor+"]");
	
		
}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				

	
}
