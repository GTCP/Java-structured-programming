import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
//PRECARGAR UNA ARREGLO CHAR SEC

public class Arreglos {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_letra = 0.4;
	public static void main(String[] args) {
		char [] arrchar;      
		arrchar = new char[MAXCOLUMNA];                  
		cargar_arreglo_aleatorio_secuencias_char(arrchar);
		imprimir_arreglo_char(arrchar);
}

//-------------IMPRESION MATRIZ---------------------------------------
	

	
	public static void imprimir_arreglo_char(char [] arr){
		System.out.print("");
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print("[");
			System.out.print(arr[pos]);
			System.out.print("]");

		}
	}
	
//---------------------CARGA MATRIZ ALEATORIA SEC-----------------------------------------
		
	
	public static void cargar_arreglo_aleatorio_secuencias_char(char [] arr){
		Random r = new Random();
		arr[0] = ' ';
		arr[MAXCOLUMNA-1] = ' ';
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>probabilidad_letra){
				arr[pos]=(char)(r.nextInt(26) + 'a');
			}
			else{
				arr[pos]=' ';				
			}
		}
	}

}