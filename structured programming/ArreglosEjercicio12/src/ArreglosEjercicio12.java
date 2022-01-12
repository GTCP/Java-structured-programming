import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Hacer un programa que elimine de un arreglo todas las ocurrencias de una secuencia patrón dada por otro arreglo.
public class ArreglosEjercicio12 {
	final static int MAX=20;
	final static int MAXA=3;
		
		public static void main( String[] args) {
			int arr[]= {1,2,0,2,4,6,0,0,0,10,0,2,4,6,0,2,4,6,0,0};
			int aux[]= {2,4,6};
			int pos=0;
			int inicioactual=0;
			int finactual=-1;
			int longitud=0;
			imprimir_arr(arr);

			
			while(pos<MAX-1) {
				inicioactual=encontrar_inicio_sec(arr,finactual+1);
				finactual=encontrar_fin_sec(arr,inicioactual);
				
					longitud=finactual-inicioactual+1;
					if(es_igual(arr,aux,inicioactual,finactual,longitud)) {
						System.out.println("entra el if");

						eliminar_sec(arr,longitud,inicioactual,finactual);

						pos=finactual-longitud+1;
						
					}
					else {
						
						pos=finactual;
						
					}
			
			

			}
			
			imprimir_arr(arr);


			
		}
		
		public static boolean es_igual(int arr[],int aux[],int inicio,int fin,int longitud) {
			int i=0;
			
			if(longitud==MAXA) {
				System.out.println("ES IGUAL ENTRO");
				
				while(i!=MAXA) {
					
					if(arr[inicio+i]==aux[i]) {
						i++;
					}
					else {
						return false;
					}
					
				}
				
				return true;
			
			}
			
			else { 
				return false;
			}
			
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

