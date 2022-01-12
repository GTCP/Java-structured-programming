import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra precargada, 
//invierta el orden del contenido por fila. Este intercambio no se debe realizar de manera explícita, 
//hay que hacer un método que incluya una iteración de intercambio.

public class Matrices {
	final static int MAXFIL=5;
	final static int MAXCOL=10;
	public static void main( String [] args)  {
		
		int mat[][]= {{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9}};
		imprimir_mat(mat);
		System.out.println("");
		contar_pares_matriz(mat);
	}
	public static void imprimir_mat(int mat[][]) {
		for(int i=0;i<MAXFIL;i++) {
			System.out.println();
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(mat[i][j]);
				System.out.print("]");
			}
		}
	}

	public static void contar_pares_matriz(int mat[][]) {
		final int PAR=2;
		int contador=0;
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++) {
				if(mat[i][j]%PAR==0) {
					contador++;
				}
			}
		}
		System.out.println("Cantidad de numeros pares en la matriz : "+contador);
	}
}