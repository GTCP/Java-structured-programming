import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class MatricesEjercicio2 {
	final static int MAXFIL=4;
	final static int MAXCOL=2;
	
	public static void main ( String[] args) {
		int Mat[][]= {{1,1},{2,2},{3,3},{4,4}};
		int fila[]= {0,0};
		
		int pos=0;
		
		imprimir_matriz(Mat);
		corrimiento(Mat,pos);
		insertar_fila(Mat,pos,fila);
		System.out.println("");
		imprimir_matriz(Mat);

		
	}
	
	public static void corrimiento(int Mat[][],int pos) {
		for(int i=MAXFIL-1;i>pos;i--) {
			for(int j=0;j<MAXCOL;j++) {
				
				if(i!=0) {
					System.out.println("entro");
					Mat[i][j]=Mat[i-1][j];
					
				
				}
			}
		}
	}
	
	public static void insertar_fila(int Mat[][],int pos,int fila[]) {
		
		for(int i=0;i<MAXCOL;i++) {
			Mat[pos][i]=fila[i];
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
