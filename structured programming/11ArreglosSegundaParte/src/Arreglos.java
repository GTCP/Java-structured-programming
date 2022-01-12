import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se tiene un arreglo de enteros de tamaño 20 de secuencias de números entre 1 y 9, separadas por 0. El arreglo esta precargado, 
//y además empieza y termina con uno o más separadores 0. Considere para los siguientes ejercicios este tipo de arreglo.

//Hacer un programa que dado el arreglo definido y precargado permita encontrar la posición de inicio y fin de la secuencia cuya suma de valores sea mayor.
public class Arreglos {
	final static int MAX=20;
	public static void main(String [] args) {
		int arr[]= {0,1,4,0,0,2,1,0,1,10,1,0,2,4,0,2,0,70,1,0};
		int sumaSecNew=0;
		int pos=0;
		int inicioSecNew=0;
		int finSecNew=-1;
		
		int inicioSecAnt=0;
		int finSecAnt=0;
		int sumaSecAnt=0;
		
		while(pos<MAX-1) {
			inicioSecNew=obtener_inicio_sec(arr,finSecNew+1);
			finSecNew=obtener_fin_sec(arr,inicioSecNew);
			sumaSecNew=suma_total_sec(arr,inicioSecNew,finSecNew);
			System.out.println(pos);
			if(sumaSecNew>sumaSecAnt) {
				sumaSecAnt=sumaSecNew;
				inicioSecAnt=inicioSecNew;
				finSecAnt=finSecNew;
			}
			pos=finSecNew;
		}
		System.out.println("Pos del inicio de la secuencia cuya suma total es mas grande: "+inicioSecAnt);
		System.out.println("Pos del fin de la secuencia cuya suma total es mas grande: "+finSecAnt);
		System.out.println("SumaTotal: "+sumaSecAnt);


	}
	
	public static int suma_total_sec(int arr[],int inicio,int fin) {
		int sumaTotal=0;
		for(int i=inicio;i<=fin;i++) {
			sumaTotal+=arr[i];
		}
		return sumaTotal;
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
