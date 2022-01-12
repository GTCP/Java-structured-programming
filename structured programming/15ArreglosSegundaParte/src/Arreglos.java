import java.io.BufferedReader;
import java.io.InputStreamReader;
//Se tiene un arreglo de enteros de tamaño 20 de secuencias de números entre 1 y 9, separadas por 0. El arreglo esta precargado, y además empieza y termina 
//con uno o más separadores 0. Considere para los siguientes ejercicios este tipo de arreglo.

//Hacer un programa que dado el arreglo definido y precargado elimine del arreglo todas las ocurrencias de una secuencia patrón dada por otro arreglo 
//de iguales características (solo tiene esa secuencia). Al eliminar se pierden los valores haciendo los corrimientos.
public class Arreglos {
	final static int MAX=20;
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,0,1,2,3,1,0,1,2,3,0,4,0,1,2,3,0};
		int aux[]= {1,2,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};	
		int inicio=0;
		int fin=-1;
		int pos=0;
		int inicioaux=0;
		int finaux=-1;
		imprimir_arreglo_entero(arr);
		
		
		inicioaux=obtener_inicio_sec(aux,finaux+1);
		finaux=obtener_fin_sec(aux,inicioaux);
		
		while(pos<MAX-1) {
			inicio=obtener_inicio_sec(arr,fin+1);
			fin=obtener_fin_sec(arr,inicio);
			System.out.println("Inicio:"+inicio);
			System.out.println("fin:"+fin);
			if(es_igual(arr,aux,inicio,fin,inicioaux,finaux)) {
				System.out.println("Entro");
				corrimiento_izquierda(arr,inicio,fin);
				
				pos=inicio;
				fin=inicio-1;
			}
			pos=fin;	
		}
		System.out.println("");
		imprimir_arreglo_entero(arr);
	}
	
	public static boolean es_igual(int arr[],int aux[],int inicio,int fin,int inicioaux,int finaux) {
		int longitudArr=fin-inicio+1;
		System.out.println("LONGITUD AR:"+longitudArr);
		int longitudAux=finaux-inicioaux+1;
		System.out.println("LONGITUD AUX:"+longitudAux);

		
		System.out.println("ES_IGUAL");
		if(longitudArr==longitudAux) {
			System.out.println("MISMA LONGITUD");
			int pos=0;
			while((pos<longitudArr)&&(arr[inicio+pos]==aux[inicioaux+pos])) {
				pos++;
			}
			if(pos==longitudAux) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	public static int obtener_entero_valido() {
		int entero=0;
		boolean salidaDoWhile=false;
	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
		do {
			try {
			System.out.println("Ingresa un numero:");
			entero=Integer.valueOf(entrada.readLine());
			salidaDoWhile=true;
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			}
		}while(!salidaDoWhile);
	
		return entero;
	}
	public static int obtener_inicio_sec(int arr[],int pos) {
		while((pos<MAX)&&(arr[pos]==0)) {
			pos++;
		}
		return  pos;
	}
	public static int obtener_fin_sec(int arr[],int pos) {
		while((pos<MAX)&&(arr[pos]!=0)) {
			pos++;
		}
		return  pos-1;
	}
	public static void corrimiento_izquierda(int arr[],int inicio,int fin) {
		for(int i=0;i<=fin-inicio+1;i++) {
			for(int j=inicio;j<MAX-1;j++) {
				arr[j]=arr[j+1];
			}
		}
	}
	public static void imprimir_arreglo_entero(int arr[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}
}
