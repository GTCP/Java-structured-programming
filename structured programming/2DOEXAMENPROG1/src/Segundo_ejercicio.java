/*
Se tiene una matriz de enteros de tamanio 4*20 de secuencias de numeros entre 1 y 9 (por cada fila), separadas por 0.
La matriz esta precargada, y ademas cada fila empieza y termina con uno o mas separadores 0. Se pide realizar un programa que:
_para todas las filas inserte al principio de cada secuencia el valor correspondiente a la suma de los valores pares de su contenido
(lo que suman los pares de cada secuencia). Suponer que cada fila de la matriz tiene espacio para agregar esos valores.
*/

/* Utilizar la siguiente estructura de programa para resolver en enunciado, definiendo e implementando todos los metodos necesarios (salvo la carga inicial de las estructuras)*/
public class Segundo_ejercicio {

	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;

public static void main(String[] args) {

int [][] matint;
matint = new int[MAXFILA][MAXCOLUMNA];
cargar_matriz_aleatorio_secuencias_int(matint);

realizar_segundo_ejercicio(matint);

}
public static void realizar_segundo_ejercicio(int [][] matint){
	int inicioSec;//inicio de secuencia.
	int finSec; //fin de secuencia.
	int posColumna=0;//Posicion de la columna.
	int sumaNumerosParesSec=0;//Variable que tiene el valor de la suma de los pares de la secuencia.
	for(int fila=0;fila<MAXFILA;fila++) {
		posColumna=0;
		inicioSec=0;
		finSec=-1;
		while(posColumna<MAXCOLUMNA-1) {
			inicioSec=obtener_inicio_sec_mat(matint,fila,finSec+1);//Busca el inicio de la secuencia.
			if(inicioSec<MAXCOLUMNA) {
				finSec=obtener_fin_sec__mat(matint,fila,inicioSec);//Busca el fin de la secuencia.
				sumaNumerosParesSec=obtener_suma_numeros_pares_sec(matint,fila,inicioSec,finSec);//Calcula la suma del valor de los numeros pares de la secuencia
				//suma va a devolver 0 si no hay valores pares.
				if(sumaNumerosParesSec!=0) {//si suma no devuelve 0 entra.	
					insertar_valor_principio_sec(matint,fila,inicioSec,finSec,sumaNumerosParesSec);//Corre a derecha, luego inserta el valor correspondiente a la suma.
					posColumna=finSec+1; //La posicion se vuelva el fin de la secuencia +1 por el corrimiento hecho al insertar.
					finSec+=1; //El fin de la secuencia pasa hacer el siguiente ya que se movio 1 a la derecha.
				}
				else {
					posColumna=finSec; //Como no se hizo el corrimiento la posicion es fin de la secuencia.
				}
			}
			posColumna=inicioSec;//Significa que termino la columna,corta el while para seguir con la fila siguiente.
		}	
	}
}

	public static void imprimir_mat_entera(int mat[][]) {
		for(int i=0;i<MAXFILA;i++) {
			System.out.println("");
			for(int j=0;j<MAXCOLUMNA;j++) {
				System.out.print("[");
				System.out.print(mat[i][j]);
				System.out.print("]");
			}
		}
	}

	public static int obtener_suma_numeros_pares_sec(int mat[][],int fila, int inicio, int fin){
		final int PAR=2;
		int suma = 0;
		while(inicio <= fin){
			if(mat[fila][inicio]%PAR==0) {
			suma+=mat[fila][inicio];
			}
			inicio++;
		}
		return suma;
	}
	
	public static int obtener_inicio_sec_mat(int mat[][],int fila,int pos) {
		while((pos<MAXCOLUMNA)&&(mat[fila][pos]==0)) {
			pos++;
		}
		return  pos;
	}
	public static int obtener_fin_sec__mat(int mat[][],int fila,int pos) {
		while((pos<MAXCOLUMNA)&&(mat[fila][pos]!=0)) {
			pos++;
		}
		return  pos-1;
	}
	
	public static void insertar_valor_principio_sec(int mat[][],int fila,int inicio,int fin,int valor) {
		corrimiento_derecha(mat,fila,inicio);
		mat[fila][inicio]=valor;
	}
	public static void corrimiento_derecha(int mat[][],int fila,int inicio) {
			for(int i=MAXCOLUMNA-1;i>inicio;i--) {
				mat[fila][i]=mat[fila][i-1];
			}
	}
}
