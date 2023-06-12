package Algoritmos_De_Ordenacao;

public class bucketSort {

	public static void bucketSorting(int []array) {
		if(array.length <= 1) {
			return;
		}
		
		//creating buckets
		ListaEncadeada[] buckets = new ListaEncadeada[array.length];
		
		//biggest value
		int maiorValor= array[0];
		for(int i: array) {
			if(i > maiorValor)
				maiorValor = i;
		}
		
		//distribution of elements 
		for(int i=0;i<array.length;i++) {
			int indiceBucket = (array[i]*array.length/(maiorValor+1));
			if(buckets[indiceBucket] == null) {
				buckets[indiceBucket] = new ListaEncadeada();
				buckets[indiceBucket].inserirOrdenado(array[i]);
			}else
				buckets[indiceBucket].inserirOrdenado(array[i]);
		}
		
		int index = 0;
		for(int i=0; i<array.length;i++) {
			if(buckets[i] != null) {
				Nodo aux = buckets[i].getInicio();
				while(aux != null) {
					array[index++] = aux.getDado();
					aux = aux.getProx();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10,20,30,2,4,654,23,123,54,675,34,5};
		
		System.out.println("Sem ordenar: ");
		for(int i : array) {
			System.out.println(i);
		}
		
		bucketSorting(array);
		System.out.println("\nOrdenando: ");
		for(int i : array) {
			System.out.println(i);
		}
	}
}
