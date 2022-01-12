import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//2.Implementar un método que realice un corrimiento a derecha en un arreglo ordenado de tamaño MAX=10 a partir de una posición.
public class ArreglosEjercicio2 {
	final static int MAX=10;
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,7,9,20,32,153};
		
		
		imprimir_arr(arr);
		
		corrimiento_derecha(arr,2);
		System.out.println("");
		imprimir_arr(arr);
		
		
	//	corrimiento_izquierda(arr,9);
	//	System.out.println("");
	//	imprimir_arr(arr);

	}
	
	
	public static void corrimiento_derecha(int arr[],int pos) {
		
		for(int i=MAX-1;i>pos;i--) {
			arr[i]=arr[i-1];
		}
	}
	
	public static void corrimiento_izquierda(int arr[],int pos) {
			
			for(int i=0;i<pos;i++) {
				arr[i]=arr[i+1];
			}
		}
	
	public static void cargar_arr(int arr[]) {
		for(int i=0;i<MAX;i++) {
			arr[i]=ingresar_entero_por_teclado();
		}
	}
	
	public static void imprimir_arr(int arr[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");

			System.out.print(arr[i]);
			
			System.out.print("]");

		}
	}
	public static int ingresar_entero_por_teclado() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		do {
			try {
				System.out.println("Ingresar entero:");
				numero=new Integer(entrada.readLine());
				validador=false;
			}catch(Exception exc) {
				System.out.println(exc);
				validador=true;
				numero=0;
			}
			
		}while(validador);
		
		return numero;
	}
	
}