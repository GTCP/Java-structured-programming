import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Arreglos {

	public static final int MAXCOLUMNA = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_numero = 0.4;
	public static void main(String[] args) {
		int [] arrint;                  
		arrint = new int[MAXCOLUMNA];                  
		cargar_arreglo_aleatorio_secuencias_int(arrint);
		imprimir_arreglo_secuencias_int(arrint);
	}

	
//---------------------------IMPRIMIR ARREGLO ALEATORIA ENTERA----------------------------
		
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("");
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print("[");
			System.out.print(arr[pos]);
			System.out.print("]");

		}
	}	
//---------------------------------CARGAR ARREGLOS ENTERA ALEATORIA SEC--------------------		
	
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
