import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class MatricesEjercicio5 {
	final static int MAXFIL=3;
	final static int MAXCOL=2;
	
	public static void main(String[] args) {
			int Mat[][]= {{4,2},{1,5},{4,1}};
			
			imprimir_matriz(Mat);
			ordenar_matriz_por_filas(Mat);
			System.out.println("");
			imprimir_matriz(Mat);
	}
	
	public static void ordenar_matriz_por_filas(int Mat[][]) {
		
		for(int x=0;x<MAXFIL;x++) {
			System.out.println("ENTRO PRIMER FOR");
			for(int i=1;i<MAXCOL;i++) {
				System.out.println("ENTRO SEGUNDO FOR");
				for(int j=0;j<MAXCOL-1;j++) {
					System.out.println("ENTRO tercer FOR");
					if(Mat[x][j]>Mat[x][j+1]) {
						System.out.println("ENTRO EN EL IF");
						int aux=Mat[x][j];
						Mat[x][j]=Mat[x][j+1];
						Mat[x][j+1]=aux;
					}
				}
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
