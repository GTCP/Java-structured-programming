import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//En el caso de hacer corrimientos pueden quedar elementos repetidos
//1.Hacer un programa que inicialice y luego cargue un arreglo (sin orden) de tamaño MAX=10 con números enteros ingresados por teclado. Finalmente imprima el arreglo por pantalla.
public class ArreglosEjercicio1 {
	final static int MAX=10;
	public static void main(String[] args) {
		int arr[]=new int[MAX];
		
		cargar_arr(arr);
		imprimir_arr(arr);
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
