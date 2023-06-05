package Algoritmos_De_Ordenacao;


public class OrdenacaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MetodosOrdenacao ordenar = new MetodosOrdenacao();
		
		int array [] = new int [10];
		array[0] = 12;
		array[1] = 1555;
		array[2] = 134;
		array[3] = 11;
		array[4] = 21;
		array[5] = 10;
		array[6] = 1;
		array[7] = 12;
		array[8] = 144;
		array[9] = 2;
	
		System.out.println("BubbleSort: ");
		ordenar.bubbleSort(array);
		for(int num:array) {
			System.out.println(num);
		}
		
		System.out.println("SelectionSort: ");
		ordenar.selectionSort(array);
		for(int num:array) {
			System.out.println(num);
		}
		
		System.out.println("InsertionSort: ");
		ordenar.insertionSort(array);
		for(int num:array) {
			System.out.println(num);
		}
	}

}
