import java.util.Random;

public class Arreglos {
	final static int MAX=10;
	final static int MAXVALOR = 10;
	final static int MINVALOR = 1;
	
	public static void cargar_arreglo_aleatorio_char(char[] arr){
		Random r = new Random();
		for(int pos = 0; pos < MAX; pos++){
			arr[pos]=(char)(r.nextInt(26) + 'a');
		}
	}
	
	public static void cargar_arreglo_aleatorio_int(int[] arr){
		Random r = new Random();
		for(int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	
	public static void cargar_arreglo_aleatorio_double(double[] arr){
		Random r = new Random();
		for(int pos = 0; pos < MAX; pos++){
			arr[pos]=((MAXVALOR-MINVALOR+1)*r.nextDouble() + MINVALOR*1.0);
		}
	}
}
