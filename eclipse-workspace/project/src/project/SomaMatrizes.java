package project;

import java.util.Scanner;

public class SomaMatrizes {
	public static void main(String[]args) {
		
	int[] [] matriz1 = new int	[2] [2];
	
	int [] [] matriz2 = new int[2] [2];
	
	int [] [] resultado = new int [2] [2];
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("digite os valores da primeira matriz:");	
		for(int i =0; i<2; i++) {
			for( int j = 0; j<2; j++) {
				matriz1 [i][j] = scanner.nextInt();
				
				
			}
			
			
			
		}
		System.out.println("digite os numeros da segunda matriz");
		
		for(int i = 0; i<2; i++) {
	    	for(int j =0; j <2; j++) {
	             matriz2 [i][j] = scanner.nextInt();
		}	
			
		}
		for(int i = 0; i<2;i++) {
			for(int j = 0; j<2; j++) {
				
		resultado [i] [j] = matriz1 [i][j] + matriz2 [i][j];
		
			}
			
		}
		System.out.println("a matriz soma e");
		
		for(int i = 0; i<2;i++) {
			for( int j  =0 ; j<2; j++) {
				
				
				System.out.println(resultado [i][j]+"");
			}
			
			System.out.println("");
		}
	}

}
