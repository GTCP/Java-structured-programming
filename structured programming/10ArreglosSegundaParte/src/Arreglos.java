import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se tiene un arreglo de enteros de tama�o 20 de secuencias de n�meros entre 1 y 9, separadas por 0. El arreglo esta precargado, y adem�s empieza y termina 
//con uno o m�s separadores 0. Considere para los siguientes ejercicios este tipo de arreglo.
//10.Hacer un programa que dado el arreglo definido y precargado permita obtener a trav�s de m�todos la posici�n de inicio y la posici�n de fin de la secuencia 
//ubicada a partir de una posici�n entera ingresada por el usuario. Finalmente, si existen imprima por pantalla ambas posiciones obtenidas.

public class Arreglos {
	final static int MAX=20;
	
	public static void main (String[] args) {
		 int arr[]= {0,0,1,2,3,4,1,0,1,2,0,0,1,2,0,3,4,0,1,0};
		 int entero=-1,inicio,fin;
		 while(!((entero>=0)&&(entero<MAX))) {
			 entero=obtener_entero_valido();
		 }
		 inicio=obtener_inicio_sec(arr,entero);
		 fin=obtener_fin_sec(arr,inicio);
		 
		 //VERIFICAR CUANDO ES SECUENCIA PARA LUEGO IMPRIMIR
			 System.out.println(inicio);
			 System.out.println(fin);
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

	public static int obtener_inicio_sec(int arr[],int pos) {
		
		while((pos<MAX)&&(arr[pos]==0)) {
			pos++;
		}
		return pos;
	}
	public static int obtener_fin_sec(int arr[],int pos) {
		while((pos<MAX)&&(arr[pos]!=0)) {
			pos++;
		}
		return pos-1;
	}
}
