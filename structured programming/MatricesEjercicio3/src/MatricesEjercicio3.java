import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class MatricesEjercicio3 {
	final static int MAXFIL=3;
	final static int MAXCOL=2;
	
	public static void main(String [] args) {
		int Mat[][]= {{1,1},{2,2},{3,3}};
		
		int fila=0;
		imprimir_matriz(Mat);
		eliminar_fila(Mat,fila);
		corrimiento(Mat,fila);
		System.out.println("");
		imprimir_matriz(Mat);
	}
	
	public static void eliminar_fila(int Mat[][],int fila) {
		
		for(int j=0;j<MAXCOL;j++) {
			System.out.println("ENTRO A ELIMINAR");
			Mat[fila][j]=0;
		}
	}
	
	public static void corrimiento(int Mat[][],int fila) {
		
		for(int i=0;i<MAXFIL-1;i++) {
			for(int j=0;j<MAXCOL;j++) {
				Mat[i][j]=Mat[i+1][j];
			}
		}
		
	}
	

	public static void imprimir_matriz(int Mat[][]) {

		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");

			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(Mat[i][j]);
				System.out.print("]");

			}
		}
	}
}


