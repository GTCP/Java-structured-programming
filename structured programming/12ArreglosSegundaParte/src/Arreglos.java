import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se tiene un arreglo de enteros de tamaño 20 de secuencias de números entre 1 y 9, separadas por 0. El arreglo esta precargado, y además empieza y 
//termina con uno o más separadores 0. Considere para los siguientes ejercicios este tipo de arreglo.

//Hacer un programa que dado el arreglo definido y precargado permita encontrar la posición de inicio y fin de la anteúltima secuencia 
//(considerar comenzar a buscarla a partir de la ultima posición del arreglo).
public class Arreglos {
	final static int MAX=20;
	public static void main(String [] args) {
		int arr[]={0,2,2,0,0,2,0,0,2,3,2,0,1,1,0,2,2,3,1,0};
		
		int inicio=MAX;
		int fin=-1;
		int pos=inicio;
		int contador=0;
		
		while(pos>0){
			fin=obtener_fin_sec_atras_adelante(arr,inicio-1);
			inicio=obtener_inicio_sec_atras_adelante(arr,fin); 
			contador++;
			
			if(contador!=0) {
				pos=0;
			}
		}
		if(arr[inicio]!=0) {
		System.out.println("inicio:"+inicio);
		System.out.println("fin:"+fin);
		}
	}
	
	public static int obtener_inicio_sec_atras_adelante(int arr[],int pos) {
		while((pos>0)&&(arr[pos]!=0)) {
			pos--;
		}
		return pos+1;
	}
	
	public static int obtener_fin_sec_atras_adelante(int arr[],int pos) {
		
		while((pos>0)&&(arr[pos]==0)) {
			pos--;
		}
		return pos ;
	}
}

