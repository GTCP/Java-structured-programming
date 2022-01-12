public class Matriz {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static void main(String[] args) {
		int [][] matint;                  
		matint = new int[MAXFILA][MAXCOLUMNA];                  
		//cargar_matriz_aleatorio_secuencias_int(matint);
		//imprimir_matriz_int(matint);
		imprimir_suma_secuencias_matriz(matint);
	}

	public static void imprimir_suma_secuencias_matriz(int[][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.println("Para la fila "+fila);
			imprimir_suma_cada_secuencia(mat[fila]);
		}
	}	
	
	public static void imprimir_suma_cada_secuencia(int[] arr){
		int inicio,fin,suma;
		inicio = 0;
		fin = -1;
		while ((inicio < MAXCOLUMNA)){
			inicio = obtener_inicio_secuencia(arr,fin+1);
			if (inicio < MAXCOLUMNA){
				fin = obtener_fin_secuencia(arr,inicio);
				 suma = obtener_suma_secuencia(arr,inicio,fin);
				 System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
			}
		}
	}

	public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
		int suma = 0;
		while (inicio <= fin){
			suma+=arr[inicio];
			inicio++;
		}
		return suma;
	}	

	
	public static int obtener_inicio_secuencia(int arr[],int pos) {
		while((pos<MAXCOLUMNA)&&(arr[pos]==0)) {
			pos++;
		}
		return pos;
	}
	public static int obtener_fin_secuencia(int arr[],int pos) {
		while((pos<MAXCOLUMNA)&&(arr[pos]!=0)) {
			pos++;
		}
		return pos-1;
	}
}



