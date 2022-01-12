import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Matriz {
	final static int MAXFILA=5;
	final static int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
	char[][] mat;
	mat= new char[MAXFILA][MAXCOLUMNA];
	cargar_matriz_aleatorio_char(mat);
	imprimir_arreglo_char(mat);
	}

	public static void cargar_arreglo_aleatorio_char(int[] mat){
		Random r = new Random();
			for(int pos = 0; pos < MAXCOLUMNA; pos++){
			mat[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
	}
	
	public static void imprimir_arreglo_char(char[][] mat){
		for(int i=0;i<MAXFILA;i++) {
			System.out.println("");
			for(int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print("[");
			System.out.print(mat[i][pos]);
			System.out.print("]");

			}
		}
	}

public static void cargar_matriz_aleatorio_char(char [][] mat){
	for (int fila = 0; fila < MAXFILA; fila++){
		cargar_arreglo_aleatorio_char(mat[fila]);
	}
	System.out.println("");
}		



	public static void cargar_arreglo_aleatorio_char(char[] arr){
		Random r = new Random();
		for(int pos = 0; pos < MAXCOLUMNA; pos++){
			arr[pos]=(char)(r.nextInt(26) + 'a');
		}
	}

}