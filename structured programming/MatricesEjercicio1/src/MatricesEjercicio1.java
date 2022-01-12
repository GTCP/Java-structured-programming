import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


//OBTENER LA SUMA DE UNA DIAGONAL
// INVIERTA EL CONTENIDO ENTRE LAS POSICIONES INICIO Y FIN DE UNA FILA DADA.
public class MatricesEjercicio1 {
	final static int MAXFIL=2;
	final static int MAXCOL=2;
	public static void main (String[] args) {
		int Mat[][]= {{1,2},{3,4}};
		
		imprimir_matriz(Mat);
		int sumaDiagonal=suma_diagonal(Mat);
		int sumaDiagonalInversa=suma_diagonal_desde_atras_abajo(Mat);

		invertir_inicio_fin(Mat);
		System.out.println("");
		imprimir_matriz(Mat);
		System.out.println("");

		System.out.println(sumaDiagonal);
		System.out.println("");

		System.out.println(sumaDiagonalInversa);


	}
	
	public static int suma_diagonal(int Mat[][]) {
		int suma=0;
		for(int i=0;i<MAXCOL;i++) {
			for(int j=0;j<MAXFIL;j++) {
				if(i==j) {
				suma+=Mat[i][j];
				}
			}
		}
		return suma;
	}
	
	public static void invertir_inicio_fin(int Mat[][]) {
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<1;j++) {
				int aux=Mat[i][j];
				Mat[i][j]=Mat[i][MAXCOL-1-j];
				Mat[i][MAXCOL-1-j]=aux;
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
	
	public static int suma_diagonal_desde_atras_abajo(int Mat[][]) {
		int sumaDiagonal=0;
		for(int i=0;i<MAXCOL;i++) {
			for(int j=0;j<MAXFIL;j++) {
				if(i+j==MAXFIL-1) {
					sumaDiagonal+=Mat[i][j];
				}
			}
		}
		return sumaDiagonal;
		
	}
}
