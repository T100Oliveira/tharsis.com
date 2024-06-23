package project;

import java.util.Random;

public class MatrizTrasposta {
public static void main(String[]args) {
	
	
	int[] [] matriz = new int [4] [4];
	
	Random random = new Random();
	for(int i = 0; i<4;i++) {
		for(int j = 0; j<4;j++) {
			
		matriz[i] [j] = random.nextInt(10);
			
			
		}	
		}
		System.out.println("Matriz original:");
		
		for(int i = 0; i<4;i++) {
			for(int j = 0; j<4;j++) {
				
				System.out.println(matriz [i][j]+"");
			}
			System.out.println();
			
		}
	int [] [] matrizTransposta = new int[4] [4];
	for (int i =0; i<4; i++) {
		for(int j=0; j<4; j++) {
			
			matrizTransposta [j][i] = matriz[i][j];
		}
		
	}
		
	}
	
	
	
}

