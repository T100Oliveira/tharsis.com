package project;

import java.util.Scanner;

public class MaiorProjeto { 


	public static void main(String[]args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite os numeros de linhas da matriz");
	   
		int linhas = scanner.nextInt();
		
	
		System.out.println("digite os numeros de colunas");
		
		int colunas = scanner.nextInt();
		
		int[][] campoMinado = new int[linhas][colunas];
		
		System.out.println("digite a matriz indicando os locais das minas");
		System.out.println("0 para o campo neutro e 1 para a mina");
		
	
		for(int i =0; i<linhas;i++) {
		for(int j=0; j<colunas;j++) {
			campoMinado[i] [j] = scanner.nextInt();
			}
		}
		int[] [] resultado = new int [linhas][colunas];
			
			for(int i = 0;i<linhas;i++) {
				for(int j = 0; j< colunas ;j++) {
					
				if(campoMinado[i][j] == 1) {
			
				incrementaVizinhos (resultado,i,j);				
				
			}
	}
}
			System.out.println("matriz com a contagem das minas das casasa vizinhas");
				for(int i = 0;i<linhas;i++) {
					for(int j =0; j< colunas; j++) {
						System.out.println(resultado [i] [ j]+ "");
						
					}
					System.out.println();
				}
				
					scanner.close();
				}
	public static void incrementaVizinhos(int[][] matriz, int linha,int coluna) {
		
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		for(int i = linha-1;i<=linha+1;i++) {
			for(int j = coluna-1;j<=coluna+1;j++) {
				
			if(i >=0 && i<linhas &&j >= 0 && j<colunas && !(i ==linha && j ==coluna )) {
				
				matriz[i][j]++;
			}	
				
			}
			
			
		}
		
		
		
		
		
		
	}
				
				}		
				
					
				
				

			
			
		
		
	





