import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado, solicite al usuario el ingreso de dos números enteros 
//(posiciones del arreglo) y ordene de forma creciente el arreglo entre dos posiciones correspondientes a los números ingresados.
public class Arreglos {
	final static int MAX=10;
	final static int MAXVALOR = 10;
	final static int MINVALOR = 1;
	final static int LIMITEAINGRESAR=9;
	
	public static void main (String [] args) {
		int arr[]=new int [MAX];
		int pos1=-1;
		int pos2=-1;
		
		cargar_arr_aleatorio_int(arr);
		imprimir_arr_entero(arr);
		System.out.println("");
		while(!((pos1>=0)&&(pos1<MAX))) {
		pos1=obtener_entero_valido();
		}
		while(!((pos2>pos1)&&(pos2<MAX))){
		pos2=obtener_entero_valido();
		}
		//ordenar_arr_asc(arr,pos1,pos2);
		ordenar_arreglo_burbujeo(arr,pos1,pos2);
		imprimir_arr_entero(arr);
	}
	
	public static void imprimir_arr_entero(int arr[]) {
		
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}

	public static int obtener_entero_valido() {
		int numero=0;
		boolean salidaDoWhile=false;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar entero:");
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

	
	
	public static void cargar_arr_aleatorio_int(int arr[]){
		Random r = new Random();
		for(int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}	

	public static void ordenar_arr_asc(int arr[],int inicio,int fin) {
			int pos_menor, tmp;
			for(int i=inicio; i < fin; i++) {
				pos_menor= i;
				for(int j = i + 1; j < MAX; j++){
					if(arr[j] < arr[pos_menor]) {
						pos_menor= j;
					}
				}
				if(pos_menor!= i){
					tmp= arr[i];
					arr[i] = arr[pos_menor];
					arr[pos_menor] = tmp;
				}
		    }
	}
	
	public static void ordenar_arreglo_burbujeo(int[] arr,int inicio,int fin){
		int temp;
		for(int i = inicio+1;i < fin+1;i++){
			for(int j = inicio ; j < fin; j++){
				if(arr[j] > arr[j+1]){
					temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
		
}
