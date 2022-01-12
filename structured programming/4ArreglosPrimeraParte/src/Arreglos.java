import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
//precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo (posición
//0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo) y
//colocar el numero en el arreglo en la posición indicada.

public class Arreglos {
	final static int MAX=10;
	
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int entero=0;
		
		
		imprimir_arr(arr);
		System.out.println("");
		
		entero=obtener_entero_por_teclado();
		
		insertar_entero_en_arreglo(arr,entero,0);
		
		imprimir_arr(arr);
		
	}
		
	public static int obtener_entero_por_teclado() {
		int numero=0;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar entero:");
			numero=Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
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

	public static void insertar_entero_en_arreglo(int arr[],int entero,int pos) {
		
		corrimiento_derecha(arr,pos);
		arr[pos]=entero;//inserto en posicion dada por parametro en este caso es 0
	}
	
	public static void corrimiento_derecha(int arr[],int pos) {
		
		for(int i=MAX-1;i>pos;i--) {
			arr[i]=arr[i-1];
		}
	}
}
