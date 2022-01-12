import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class ArreglosEjercicio18 {
	final static int MAX=20;
	public static void main ( String[] args) {
		int arr[]=new int[MAX];
		
		cargar_arreglo_random(arr);
		imprimir_arreglo(arr);
		ordenamiento_burbujeo(arr);
		System.out.println("");
		imprimir_arreglo(arr);
	}
	
	public static void cargar_arreglo_random(int arr[]) {
		
		for(int i=0;i<MAX;i++) {
			arr[i]=(int) Math.floor(Math.random() * 101);
		}
	}
	
	public static void imprimir_arreglo(int arr[]) {
		
		for(int i=0;i<MAX;i++) {
			
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}

	public static void ordenamiento_burbujeo(int arr[]) {
		
		for(int i=1;i<MAX-1;i++) {
			for(int j=0;j<MAX-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
				int aux=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=aux;
				}
			}
		}
	}
}
