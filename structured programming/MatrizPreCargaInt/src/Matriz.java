////PRECARGAR UNA MATRIZ INT
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Matriz {
	final static int MAXFILA=5;
	final static int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
	int[][] mat;
	mat= new int[MAXFILA][MAXCOLUMNA];
	cargar_matriz_aleatorio_int(mat);
	imprimir_arreglo_int(mat);
	
	}

	public static void cargar_arreglo_aleatorio_int(int[] mat){
		Random r = new Random();
			for(int pos = 0; pos < MAXCOLUMNA; pos++){
			mat[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
	}
	
	public static void imprimir_arreglo_int(int[][] mat){
		for(int i=0;i<MAXFILA;i++) {
			System.out.println("");
			for(int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print("[");
			System.out.print(mat[i][pos]);
			System.out.print("]");

			}
		}
	}


public static void cargar_matriz_aleatorio_int(int [][] mat){
	for (int fila = 0; fila < MAXFILA; fila++){
		cargar_arreglo_aleatorio_int(mat[fila]);
	}
	System.out.println("");
}		


}