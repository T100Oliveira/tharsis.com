package project;

import java.util.Random;

public class SomaLinhasColunas {
	
	public static void main(String[]args) {
		
	int[][] matriz = new int[4][4];
	Random random = new Random();
		
	for(int i = 0; i<4; i++) {
		for(int j = 0; j<4; j++) {
			matriz [i][j] = random.nextInt(100);
		}}
		System.out.println("matriz");	
		for(int i = 0; i<4;i++) {
			for(int  j =0;j<4;j++) {
				
				
				
				
				System.out.println(matriz[i][j]+"");
			}
			
		}
		System.out.println("soma das linhas");
		
		for(int i =0;i<4;i++) {
			int somaLinha = 0;
			for(int j=0; j<4;j++) {
			somaLinha+= matriz[i][j];
	
				
				
				
			}
			System.out.println("linha"+(i+1)+":"+somaLinha);
			
		}
		System.out.println("soma das colunas");
		for(int j =0; j<4;j++) {
			
			int somaColuna =0;
			for(int i =0;i<4;i++) {
				
				somaColuna = matriz[i][j];
				
				
			}
			System.out.println("coluna"+(j+1)+":"+somaColuna);
		}
		}
		

		
		
	}

