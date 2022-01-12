import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Hacer un programa que dado un número N ingresado por el usuario, elimine las secuencias de tamaño N de números distintos de cero.
public class ArreglosEjercicio11 {
	final static int MAX=20;
	
	public static void main( String[] args) {
		int arr[]= {1,2,0,4,5,6,7,0,0,10,0,2,3,3,5,6,7,4,0,0};
		int pos=0;
		int inicioactual=0;
		int finactual=-1;
	
		int numero=0;
		int longitud=0;
		numero=pedir_entero();
		imprimir_arr(arr);

		while(pos<MAX-1) {
			inicioactual=encontrar_inicio_sec(arr,finactual+1);
			finactual=encontrar_fin_sec(arr,inicioactual);
			
			longitud=longitud(arr,inicioactual,finactual);
			
			
			if(numero==longitud) {
				eliminar_sec(arr,longitud,inicioactual,finactual);
				
				pos=finactual-longitud+1;
				System.out.println("POS MOD:"+pos);
			}
			
			pos=finactual;
			
		
		

		}
		
		imprimir_arr(arr);


		
	}
	
	public static void eliminar_sec(int arr[],int longitud,int inicio,int fin) {
		for(int i=0;i<longitud;i++) {
			for(int j=inicio;j<MAX-1;j++) {
				arr[j]=arr[j+1];
				
				if(j==MAX-2) {
				arr[MAX-1]=0;
				}
			}
		}
		
	}
	

	public static int longitud(int arr[],int inicio,int fin) {
		int contador=0;
		for(int i=inicio;i<=fin;i++) {
			contador++;
		}
		return contador;
	}
	
	public static void imprimir_arr (int arr[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
		
	}
	
	
	public static int pedir_entero() {
		int numero=0;
		boolean validador=true;
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try {
				System.out.println("Ingresar entero:");
				numero=new Integer(entrada.readLine());
				validador=false;
			}
			catch(Exception exc) {
				System.out.println(exc);
				validador=true;
				numero=0;
			}
			
		}while(validador);
		
		return numero;
	}
	

	
	public static int encontrar_inicio_sec(int arr[],int pos) {
		
		while((pos<MAX)&&(arr[pos]==0)) {
			pos++;
		}
		System.out.println("INICIO"+pos);
		
		return pos;
	}
	
	public static int encontrar_fin_sec(int arr[],int pos) {
		
		while((pos<MAX-1) && ( !( (arr[pos]!=0)&&(arr[pos+1]==0) )  ) ) {
			pos++; 
		}
		System.out.println("FIN"+pos);

		return pos;
	}
}