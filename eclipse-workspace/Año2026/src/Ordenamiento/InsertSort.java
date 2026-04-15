package Ordenamiento;

public class InsertSort {
	//Inserción directa
	public static void insertSort(Comparable[]a) {
		for(int i=1; i<a.length;i++) {
			Comparable temp=a[i];
		int j=i;
		while(j>0 && temp.compareTo(a[j-1])<0) {
			a[j]=a[j-1];
			j--;
		}
		a[j]=temp;
	}
}
	
}
