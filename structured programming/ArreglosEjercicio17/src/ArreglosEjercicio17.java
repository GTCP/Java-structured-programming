import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//17.Considerando un arreglo A que tiene un orden ascendente según la cantidad de elementos que poseen las secuencias, insertar en A manteniendo su orden una secuencia dada en un arreglo P.
public class ArreglosEjercicio17 {
	final static int MAX=20;
	final static int MAXA=2;
		
		public static void main( String[] args) {
			int arr[]= {1,0,0,0,4,6,0,0,4,10,12,0,4,6,3,0,4,6,7,0};
			int aux[]= {0,0};

			int pos=0;
			int inicioactual=0;
			int finactual=-1;
			int longitudactual=0;
			int longitudanterior=longitud(aux,0,MAX-1);
			
			imprimir_arr(arr);
			

			while(pos<MAX) {
				inicioactual=encontrar_inicio_sec(arr,finactual+1);
				finactual=encontrar_fin_sec(arr,inicioactual);
					
				longitudactual=finactual-inicioactual+1;
				
				if(longitudactual>=longitudanterior) {
					//HACER ESPACIO
					//COPIAR ANTES DE LA SECUENCIA ENCONTRADA
				}
				else {
					pos=finactual;
				}
	
				}
			System.out.println("");
			
			imprimir_arr(arr);

			}

				
		public static int copiar(int arr[],int aux[],int inicio,int fin,int longitud,int posaux) {
			
				if(posaux!=MAX-1) {
					System.out.println("COPIANDO");
					int i=0;
					for(i=0;i<longitud;i++) {
					
						aux[posaux+i]=arr[inicio+i];
						imprimir_arr(aux);
						System.out.println("");
						
					}
					if(aux[posaux+longitud]!=MAX-1) {
						aux[posaux+longitud+1]=0;
						return posaux+longitud+1;
					}
					else {
						if(posaux==MAX-1) {
							return posaux;
						}
						else {
							return posaux+longitud;
						}
					}
				}
				
				
				return posaux;
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
			
			while((pos<MAX-1)&&(arr[pos]==0)) {
				pos++;
			}
			System.out.println("INICIO"+pos);
			
			return pos;
		}
		
		public static int encontrar_fin_sec(int arr[],int pos) {
			
			while((pos<MAX-1) && ( !( (arr[pos]!=0)&&(arr[pos+1]==0) )  ) ) {
				pos++; 
			}
			System.out.println("FIN"+(pos));

			return pos;
		}
	}

