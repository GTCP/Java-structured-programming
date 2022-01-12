import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Hacer un programa que elimine los valores pares en un arreglo de tamaño MAX=10.
public class ArreglosEjercicio8 {
	final static int MAX=20;
	public static void main(String[] args) {
		int arr[]= {1,18,2,16,15,0,13,12,11,10,9,8,7,6,3,4,2,1,1,0};
		int inicio=0;
		int fin=-1;
		
		imprimir_arr(arr);
		
		inicio=encontrar_inicio_sec(arr,fin+1);
		fin=encontrar_fin_sec(arr,inicio);
		System.out.println("");
		System.out.println(inicio);
		System.out.println(fin);

	
	}
	public static int encontrar_inicio_sec(int arr[],int pos) {
		
		while((pos<MAX-1)&&(arr[pos]==0)) {
			pos++;
		}
		
		return pos;
	}
	
	public static int encontrar_fin_sec(int arr[],int pos) {
		
		while((pos<MAX-1)&&(!((arr[pos]!=0)&&(arr[pos+1]==0)))) {
			pos++;
		}
		
		return pos;
	}
	
	public static void desplazamiento_eliminacion(int arr[],int pos) {
		
		for(int i=pos;i<MAX-1;i++) {
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