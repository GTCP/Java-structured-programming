import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Hacer un programa que elimine los valores pares en un arreglo de tamaño MAX=10.
public class ArreglosEjercicio7 {
	final static int MAX=10;
	public static void main(String[] args) {
		int arr[]= {12,11,10,9,8,7,6,5,4,3};

		
		imprimir_arr(arr);
		

		System.out.println("");
		invertir_arreglo(arr);
		
		imprimir_arr(arr);

	}

	
	
	public static void invertir_arreglo(int arr[]) {
		
		for(int i=0;i<MAX/2;i++) {
			int aux=arr[i];
			arr[i]=arr[MAX-1-i];
			arr[MAX-1-i]=aux;
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