package br.edu.fateczl.ordenacao.mergesort;

public class MergeSort {

	public MergeSort() {
		super();
	}
	
	public int[] mergeSort(int[] vetor, int inicio, int fim) {
		
		if (inicio < fim) {
			int meio = (inicio + fim)/2;
			mergeSort(vetor, inicio, meio);//Subvetor esquerda
			mergeSort(vetor, meio+1, fim);//Subvetor direita
			intercala(vetor, inicio, meio, fim);
		}
		return vetor;
	}

	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int tamanho = vetor.length;
		int []vetorA = new int [tamanho];
		for (int i = inicio; i<=fim;i++) {
			vetorA[i] = vetor[i];
		}
		int ponteiroEsquerda = inicio;
		int ponteiroDireita= meio+1;
		for (int cont = inicio; cont <= fim; cont++) {
			if (ponteiroEsquerda>meio) {
				vetor[cont] = vetorA [ponteiroDireita];
				ponteiroDireita++;
			}
			else if (ponteiroDireita > fim) {
				vetor[cont] = vetorA [ponteiroEsquerda];
				ponteiroEsquerda++;
			}
			else if (vetorA[ponteiroEsquerda]<vetorA[ponteiroDireita]) {
				vetor[cont] = vetorA [ponteiroEsquerda];
				ponteiroEsquerda++;
			}
			else {
				vetor[cont] = vetorA [ponteiroDireita];
				ponteiroDireita++;
			}
		}
		
	}
	
	

}
