package Ordenamiento;

public class Ordenamiento {
	//Ordenamiento interno Es el ordenamiento de un conjunto de datos contenido enteramente en la memoria principal
	
	//El metodo compareTo devuelve un entero negativo si el objetivo al que s
	
	
	//Algoritmo de comparación burble sort
	
	
	public static void bubbleSort(int[]a) {
		for (int i=0;i<a.length-1;i++) {    //Cantidad de veces que vamos a iterar
			for(int j=0;j<a.length-1-i;j++) //Le vamos restando 
				if(a[j+1]<a[j]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		}
	}
		//General
	public static void bubbleSortGeneral(Comparable[]a) {
		for (int i=0;i<a.length-1;i++) {    //Cantidad de veces que vamos a iterar
			for(int j=0;j<a.length-1-i;j++) //Le vamos restando 
				if(a[j+1].compareTo(a[j])<0) {
					Comparable temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		}
	}
	
	public static void selectionSort(Comparable []a) {
		
		for(int i=0; i<a.length-1;i++) { //Vamos restando de a 1 porque el primer elemento queda ordenado después de la primera iteración del segundo ciclo
			int im=i; //Tomamos como valor más pequeño el primer elemento de la lista
			for(int j=i+1;j<a.length;j++) //Nuestro segundo ciclo empieza en la segunda posiión del arreglo a comparar hasta encontrar el menor
				if(a[j].compareTo(a[im])<0)
				im=j; //Si lo encuentra tomamos ese valor
			Comparable temp=a[i]; //Intercambiamos las posiciones
			a[i]=a[im];
			a[im]=temp;
		}
	}
	
	//Inserción directa
	public static void insertSort(Comparable[]a) {
		for(int i=1; i<a.length;i++) {
			Comparable temp=a[i]; //El que quiero insertar
		int j=i;
		while(j>0 && temp.compareTo(a[j-1])<0) {
			a[j]=a[j-1];
			j--;
		}
		a[j]=temp;
	}
}
	
	public static void main(String[]args) {
		int[] arr= {3,6,1,2,7,8,9,0,5,4};
		Integer[] lista2= {9,2,6,3,7,4};
		String[] lista3= {"Maria","Carlos","Jose","Mauricio","Jero"};
		
		String[] listaN= {"Angel","Ana","Able","Alberto"};
		
		
		bubbleSort(arr);
		for (int i=0;i<arr.length;i++)
			System.out.print((arr[i])+" ");
		System.out.println();
		
		bubbleSortGeneral(lista3);
		printLista(lista3);
		
		System.out.println();
		selectionSort(lista3);
		printLista(lista3);
		
		System.out.println();
		insertSort(listaN);
		printLista(listaN);
		
	}
	
	public static void printLista(Comparable[] lista) {
		if(lista!=null)
			for(Comparable p:lista)
				System.out.print(p+" ");
		System.out.println();
	}
}
