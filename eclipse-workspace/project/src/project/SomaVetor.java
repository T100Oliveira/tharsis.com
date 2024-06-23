package project;

public class SomaVetor {
	public static void main(String[]args) {
		
		int[]vetor= {1,2,3,4,5};
		
		int resultado= calculaSomaVetor(vetor,vetor.length-1);
		
		System.out.println("a soma dos elemetos do vetor e :" + resultado);
		}
	public static int calculaSomaVetor(int[] vetor, int indice) {
		if(indice<0) {
			return 0;
		}else {return vetor[indice] + calculaSomaVetor(vetor,indice-1);
		
	}
	

}}
