import java.io.BufferedReader;
import java.io.InputStreamReader;
//Se tiene un arreglo de enteros de tamaño 20 de secuencias de números entre 1 y 9, separadas por 0. El arreglo esta precargado, y además empieza y termina 
//con uno o más separadores 0. Considere para los siguientes ejercicios este tipo de arreglo.

//Hacer un programa que dado el arreglo definido y precargado, y un número entero ingresado por el usuario, elimine las secuencias de tamaño igual al 
//número ingresado.
public class Arreglos {
	final static int MAX=20;
	
	public static void main(String[] args) {
		int arr[]= {0,0,10,5,0,4,2,0,1,4,1,0,6,0,4,2,0,4,2,0};
		int entero;
		int inicio=0;
		int fin=-1;
		int pos=0;
		int sumaSec=0;
		entero=obtener_entero_valido();
		imprimir_arreglo_entero(arr);
		while(pos<MAX-1) {
			inicio=obtener_inicio_sec(arr,fin+1);
			fin=obtener_fin_sec(arr,inicio);
			sumaSec=obtener_suma_sec(arr,inicio,fin);		
			if(sumaSec==entero) {
				corrimiento_izquierda(arr,inicio,fin);
				pos=inicio;
				fin=inicio-1;
			}
			else {
				pos=fin;	
			}
		}
		System.out.println("");
		imprimir_arreglo_entero(arr);
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
	public static int obtener_suma_sec(int arr[],int inicio,int fin) {
		int suma=0;
		for(int i=inicio;i<=fin;i++) {
				suma+=arr[i];
			
		}
		return suma;
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