import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

//PRECARGAR UNA MATRIZ INT SEC
public class Matriz {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_numero = 0.4;
	public static void main(String[] args) {
		int [][] matint;                  
		matint = new int[MAXFILA][MAXCOLUMNA];                  
		cargar_matriz_aleatorio_secuencias_int(matint);
		imprimir_matriz_int(matint);
	}

	
//---------------------------IMPRIMIR MATRIZ ALEATORIA ENTERA----------------------------
	public static void imprimir_matriz_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			imprimir_arreglo_secuencias_int(mat[fila]);
			System.out.println("");
		}
	}	
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("|");
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print(arr[pos]+"|");
		}
	}	
//---------------------------------CARGAR MATRIZ ENTERA ALEATORIA SEC--------------------
	
	public static void cargar_matriz_aleatorio_secuencias_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			cargar_arreglo_aleatorio_secuencias_int(mat[fila]);
		}
		System.out.println("");
	}		
	
	public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAXCOLUMNA-1] = 0;
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR); 
			}
			else{
				arr[pos]=0;				
			}
		}
	}
}
