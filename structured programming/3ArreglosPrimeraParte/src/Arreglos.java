import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
//precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
//menor posición del arreglo.

public class Arreglos {
	final static int MAX=10;
	
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int posIngresada=0;
		
		imprimir_arr(arr);
		System.out.println("");


		do {
			posIngresada=obtener_entero_por_teclado();
		}while(!((posIngresada>=0)&&(posIngresada<=9)));
		
		corrimiento(arr,posIngresada);
		
		System.out.println("");
		imprimir_arr(arr);
	}
	
	public static int obtener_entero_por_teclado() {
		int numero=0;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar un entero del 0 al "+(MAX-1)+":");
			numero=Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
			System.out.println("Error al ingresar");
		}
		
		return numero;
	}

	
	public static void corrimiento(int arr[],int fin) {
		for(int i=0;i<fin;i++) {	
			arr[i]=arr[i+1];
		}
	}

	public static void imprimir_arr(int arr[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");;
			
		}
	}
}
