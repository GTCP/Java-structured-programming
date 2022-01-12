import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
//precargado, obtenga la cantidad de números pares que tiene y la imprima.

public class Arreglos {
	final static int MAX=10;
	final static int PAR=2;
	
	public static void main( String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		
		obtener_imprimir_cantidad_numeros_pares(arr);
	}
	
	public static void imprimir_arr(int arr[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}
	public static void obtener_imprimir_cantidad_numeros_pares(int arr[]) {
		int cantNumPares=0;
		for(int i=0;i<MAX;i++) {
			if(arr[i]%PAR==0) {
				cantNumPares++;
			}
		}
		System.out.println("El arreglo tiene "+cantNumPares+" numeros pares(el 0 cuenta como par).");
	}
}
