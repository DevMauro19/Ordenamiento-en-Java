package Ordenamiento;

public class SelectSort {
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

}
