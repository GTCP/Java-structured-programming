import java.util.Random;

public class Arreglos {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int[] arrint;
		arrint= new int[MAX];
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
	}



//carga de arreglo de intcon valores de MINVALOR a MAXVALOR
public static void cargar_arreglo_aleatorio_int(int[] arr){
	Random r = new Random();
	for(int pos = 0; pos < MAX; pos++){
		arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
	}
}

	public static void imprimir_arreglo_int(int[] arr){
		for(int pos = 0; pos < MAX; pos++){
			System.out.print("[");
			System.out.print(arr[pos]);
			System.out.print("]");

		}
	}
}