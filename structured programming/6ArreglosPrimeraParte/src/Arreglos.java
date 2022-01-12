import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
//precargado, solicite al usuario un numero entero y elimine todas las ocurrencia de numero en el
//arreglo si existe. Mientras exista (en cada iteración tiene que buscar la posición dentro del
//arreglo) tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán tantas
//copias de la última posición del arreglo como cantidad de ocurrencias del número).

/* public static void eliminar_ocurrencias(int arr[],int numero) {

int pos= obtener_pos_arreglo(arr,numero,0);

while(pos<MAX) {

      corrimiento_izquierda(arr,pos);

      arr[MAX-1]=0;  

pos= obtener_pos_arreglo(arr,numero,pos);

}

} */
public class Arreglos {
	final static int MAX=10;
	
	public static void main(String[]args) {
		int arr[]= {0,1,2,3,4,2,6,7,2,2};
		int numero=0;
		
		imprimir_arr(arr);
		numero=obtener_entero_valido();
		eliminar_ocurrencias(arr,numero);
		imprimir_arr(arr);

	}
	
	public static int obtener_pos_arreglo(int[] arr, int numero,int pos){
			while((pos< MAX) && (arr[pos] != numero)){
			pos++;
			}
		return pos;
	}
	
	public static void eliminar_ocurrencias(int arr[],int numero) {
		int pos=0;
		
		while(pos<MAX) {
		pos=obtener_pos_arreglo(arr,numero,pos);
			
			if(arr[MAX-1]==numero) {
				arr[MAX-1]=0;
			}
			corrimiento_izquierda(arr,pos);
		}
		System.out.println("SALI DE ELIMINAR");
	}
	
	public static void imprimir_arr(int arr[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}

	public static int obtener_entero_valido() {
		int entero=0;
		boolean salidaDoWhile=false;
	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
		do {
			try {
			System.out.println("Ingresa un numero:");
			entero=Integer.valueOf(entrada.readLine());
			salidaDoWhile=true;
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			salidaDoWhile=false;
			}
		}while(!salidaDoWhile);
	
		return entero;
	}
	
	public static void corrimiento_izquierda(int arr[],int pos) {
		
		
		for(int i=pos;i<MAX-1;i++) {
			arr[i]=arr[i+1];
		} 
	}
}

/* public static void eliminar_ocurrencias(int arr[],int numero) {

             int pos= obtener_pos_arreglo(arr,numero,0);

             while(pos<MAX) {

                   corrimiento_izquierda(arr,pos);

                   arr[MAX-1]=0;  

pos= obtener_pos_arreglo(arr,numero,pos);

             }

       } */
