import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
//precargado, solicite al usuario un numero entero y elimine la primer ocurrencia de numero (un
//número igual) en el arreglo si existe. Para ello tendrá que buscar la posición y si está, realizar un
//corrimiento a izquierda (queda una copia de la última posición del arreglo en la anteúltima
//posición).

public class Arreglos {
	public static int MAX=10;
	
	public static void main (String [] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int entero=0;
		
		entero=obtener_entero_por_teclado();
		
		imprimir_arr(arr);
		System.out.println("");
		eliminar_ocurrencia(arr,entero);//si las hay
		imprimir_arr(arr);
	}
	
	public static int obtener_entero_por_teclado() {
		int numero=0;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar un entero:");
			numero=Integer.valueOf(entrada.readLine());
			
		}
		catch(Exception exc) {
			System.out.println("Error al ingresar entero");
		}
		
		return numero;
	}
	
	public static void imprimir_arr(int arr[]) {
		
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}
	
	                                               
	public static void eliminar_ocurrencia(int arr[],int numero) {
		int posRepetida=0;
			
		do {
			posRepetida=buscar_pos_repetida(arr,numero);
			System.out.println("pos repe;"+posRepetida);
			if(posRepetida>0) {
				eliminar_por_corrimiento(arr,posRepetida);
			}
			else {
				System.out.println("No hay ocurrencias");
			}
		}while(!(posRepetida==MAX));
	}


	public static int buscar_pos_repetida(int arr[],int numero) {
		int pos=0;
		
		while((arr[pos]!=numero)&&(pos<MAX)) {
			pos++;
		}
		
		if(pos!=MAX) {
			return pos;
		}
		else {
			return -1;
		}
	}

	public static void eliminar_por_corrimiento(int arr[],int pos) {
		
		for(int i=pos;i<MAX-1;i++) {
			
			arr[i]=arr[i+1];
			
		}
	}
}

