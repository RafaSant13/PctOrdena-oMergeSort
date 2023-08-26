package br.edu.fateczl.ordenacao.mergesort.view;

import br.edu.fateczl.ordenacao.mergesort.*;

public class Principal {

	public static void main(String[] args) {
int[] vetor = {100, 99, 85, 61, 44, 33, 17};
		
		br.edu.fateczl.ordenacao.mergesort.MergeSort sort = new MergeSort();
		int tamanho = vetor.length;
		int []vetor1 = sort.mergeSort(vetor, 0, tamanho-1);
		for (int i : vetor1) {
			System.out.print(i + " ");
		}
		System.out.println("Vetor ordenado");

	}

}


