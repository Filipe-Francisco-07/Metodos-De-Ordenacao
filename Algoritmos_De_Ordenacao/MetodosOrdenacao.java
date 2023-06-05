package Algoritmos_De_Ordenacao;

public class MetodosOrdenacao {

	public int[] bubbleSort(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length -i-1; j++) {
				if(array[j] > array [j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}	
		}
		return array;
	}
	public int[] selectionSort(int array[]) {
		int min,temp;
		for(int i = 0; i<array.length-1;i++) {
			min = i;
			for(int j = i+1; j<array.length;j++) {
				if(array[j]< array[min]) {
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;
	}
	
	public int[] insertionSort(int array[]) {
		int pivo,j;
		for(int i = 0; i<array.length;i++) {
			pivo = array[i];
			j=i-1;
			while(j>= 0 && array[j] > pivo) {
				array[j+1] = array[j];
				j=j-1;
			}
			array[j+1] = pivo;
		}
		return array;
	}
	
	public boolean verificarOrdenacao(int array[]) {
		boolean f = true;
		for (int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length -i-1; j++) {
				if(array[j] > array [j+1]) {
					return false;
				}
			}	
		}
		return f;
	}
	
	public int[] BubbleSort2(int array[]) {
		int temp = 0;
		boolean pronto = true;
		for (int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length -i-1; j++) {
				if(array[j] > array [j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			for (int k = 0; k < array.length; k++){
				for(int l = 0; l < array.length -k-1; l++) {
					if(array[l] > array [l+1]) {
						pronto = false;
						break;
				}
				if(pronto) return array;		
			}
		}	
	}
		return array;
	}
	
	public int[] insertionSort2(int array[],int pos1,int pos2) {
			int pivo,j;
			for(int i = pos1; i<pos2;i++) {
				pivo = array[i];
				j=i-1;
				while(j>= 0 && array[j] > pivo) {
					array[j+1] = array[j];
					j=j-1;
				}
				array[j+1] = pivo;
			}
			return array;
		}
	
}
