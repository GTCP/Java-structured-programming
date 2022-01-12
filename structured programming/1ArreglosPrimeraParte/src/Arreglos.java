import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo de enteros de tama�o 10 que se encuentra
//precargado, invierta el orden del contenido (por ejemplo: el que est� en 0 se intercambia con
//el que est� en 9, el que est� en 1 con el que est� en 8...). Este intercambio no se debe realizar
//de manera expl�cita, hay que hacer un m�todo que incluya una iteraci�n de intercambio.


//declarar arreglo precargado
//function invertir
public class Arreglos {
	final static int MAX=10;
	
	public static void main (String [] args) {
		int enteroarr[]= {0,1,2,3,4,5,6,7,8,9};	
		imprimir_arr(enteroarr);
		invertir_arr(enteroarr);
		System.out.println("");
		imprimir_arr(enteroarr);
	}
	
	public static void invertir_arr(int arr[]) {
		int aux=0;
		for(int i=1;i<=MAX/2;i++) {
			System.out.println(i);
			aux=arr[i];
			arr[i]=arr[MAX-i];
			arr[MAX-i]=aux;
		}
	}
	
	public static void imprimir_arr(int arr[]) {
		
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}
}
