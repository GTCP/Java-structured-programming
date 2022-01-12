import java.io.BufferedReader;
import java.io.InputStreamReader;
////Se tiene un arreglo de enteros de tamaño 20 de secuencias de números entre 1 y 9, separadas por 0. El arreglo esta precargado, y además empieza y termina 
//con uno o más separadores 0. Considere para los siguientes ejercicios este tipo de arreglo.
//Hacer un programa que dado el arreglo definido y precargado elimine todas las secuencias que tienen orden descendente entre sus elementos.
public class Arreglos {
	final static int MAX=20;
	public static void main(String[] args) {
		int arr[]= {0,2,1,0,0,1,2,3,1,0,3,2,1,0,4,0,1,2,3,0};
		int inicio=0;
		int fin=-1;
		int pos=0;	
		imprimir_arreglo_entero(arr);
		while(pos<MAX-1) {
			inicio=obtener_inicio_sec(arr,fin+1);
			fin=obtener_fin_sec(arr,inicio);
			if(es_descendente(arr,inicio,fin)) {
				corrimiento_izquierda(arr,inicio,fin);	
				pos=inicio;
				fin=inicio-1;
			}
			pos=fin;	
		}
		System.out.println("");
		imprimir_arreglo_entero(arr);
}
	public static boolean es_descendente(int arr[],int inicio,int fin) {
		int i=0;
		int longitud=fin-inicio+1;
		while((i<longitud)&&(arr[inicio+i]>arr[inicio+i+1])) {
			i++;
		}
		if(i==longitud) {
			return true;
		}
		return false;	
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