import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo ordenado creciente de enteros de tamaño 10 que se encuentra precargado, solicite al usuario un numero
//entero y lo inserte en el arreglo manteniendo su orden. Para ello tendrá que realizar un corrimiento a derecha 
//(se pierde el último valor del arreglo) y colocar el numero en el arreglo en la posición indicada.
public class Arreglos {
	final static int MAX=10;
	
	public static void main (String [] args) {
		int arr[]=new int [MAX];
		int entero;
		int pos;
		
		cargar_arr_enteros(arr);
		imprimir_arr_entero(arr);
		entero=obtener_entero_valido();
		pos=buscar_pos_arreglo_ord_crec(arr,entero);
		if(pos==MAX) {
			pos=MAX-1;
		}
		insertar_entero_en_pos(arr,entero,pos);
		imprimir_arr_entero(arr);
		
	}
	
	public static int obtener_entero_valido() {
		int numero=0;
		boolean salidaDoWhile=false;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar entero");
				numero=Integer.valueOf(entrada.readLine());
				salidaDoWhile=true;
			}
			catch(Exception exc) {
				System.out.println(exc);
				salidaDoWhile=false;
			}
			
		}while(!salidaDoWhile);
		
		return  numero;
	}
	
	public static void cargar_arr_enteros(int arr[]) {
		for(int i=0;i<MAX;i++) {
			arr[i]=i;
		}
	}
	
	public static void imprimir_arr_entero(int arr[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}
	
	public static int buscar_pos_arreglo_ord_crec(int[] arr,int numero) {
		int pos = 0;
		
		while((pos<MAX)&&(arr[pos]<numero)){
			pos++;
		}
		
		return pos;
	}
	
	public static void insertar_entero_en_pos(int arr[],int entero,int pos) {
		
		corrimiento_derecha(arr,pos);
		arr[pos]=entero;
	}
	
	public static void corrimiento_derecha(int arr[],int pos) {
		
		for(int i=MAX-1;i>pos;i--) {
			arr[i]=arr[i-1];
		}
	}
}                     
