package Ordenamiento;

public class Persona implements Comparable <Persona> {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	@Override
	public int compareTo(Persona p) {
		//return this.getNombre().compareTo(p.getNombre()); Para ordenar por Nombre
		//return this.getEdad()-p.getEdad(); //Para ordenar por Edad
		int difN=this.getNombre().compareTo(p.getNombre());
		int difE=this.getEdad()-(p.getEdad());
		return (difE==0)?difN:difE; //Edades iguales ordena por nombre
		//return (difN==0)?difE:difN; // Nombres iguales ordena por Edades
	}

	
	public static void printLista(Comparable[] lista) {
		if(lista!=null)
			for(Comparable p:lista)
				System.out.print(p+" ");
		System.out.println();
	}
	
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
	
	public static void main(String[]args) {
		Persona p1= new Persona("Marcela",21);
		Persona p2= new Persona("Marcela",24);
		Persona p3= new Persona("Marcela",20);
		Persona p4= new Persona("Andrés",26);
		Persona p5= new Persona("Carlos",38);
		Persona p6= new Persona("Ana",21);
		Persona p7= new Persona("Nadia",21);
		
		Persona[] listaP= {p1,p2,p3,p4,p5,p6,p7};
		printLista(listaP);
		System.out.println("BubbleSort");
		bubbleSortGeneral(listaP);
		printLista(listaP);
	}
	
	

}
