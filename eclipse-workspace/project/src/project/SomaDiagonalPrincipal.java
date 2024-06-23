package project;

import java.util.Scanner;

public class SomaDiagonalPrincipal {
	
	public static void main(String []args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] [] matriz = new int [3] [3];
		
		System.out.println("digite os veto0res da matriz 3x3");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3;j++) {
				System.out.println("digite o valor para a poisição {"+i+"]["+j+"]:");
				matriz[i][j]= input.nextInt();
				
			}
			
			
		}
		int somaDiagonal = 0;
		for(int i = 0; i<3;i++) {
		somaDiagonal += matriz[i]	[i];
			
			
		}
		System.out.println("a soma dos valores da diagonal pricipal e "+somaDiagonal);
	}

}
  