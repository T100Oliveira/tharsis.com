package project;

import java.util.Scanner;

public class MatrizDiagonal {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int tamanho = 4;
		int [][] matriz = new int[tamanho][tamanho];
		
		
		for(int i =0;i<tamanho;i++) {
			for(int j =0;j<tamanho;j++) {System.out.println("digite o tamanho da posiçao["+i+"]"+"["+j+"]");
			
			matriz[i][j] = scanner.nextInt();
			
			
		}
		
	}
boolean eDiagonal = true;
for(int i = 0; i<tamanho; i++) {
	for(int j=0; j<tamanho;j++) {
		
	if(i!=j && matriz[i][j] !=0)	{
		
		eDiagonal = false;
		break;
	
	}
	if(!eDiagonal)	{break;}
	}	
	if(eDiagonal) {	
 System.out.println("a matriz e diagonal");		
		
		
	}else {System.out.println("a matriz nao e diagonal"
			);}
}
}}
