import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


public class OrdenarMatrizEnteraAscendentemente {
	final static int MAXFIL=5;
	final static int MAXCOL=5;
	public static void main(String [] args) {
		int matriz [][]=new int [MAXFIL][MAXCOL];
		
		cargarMatriz(matriz);
		System.out.println("");
		System.out.println("");

		ordenarMatriz(matriz);
		System.out.println("");
		for(int i=MAXFIL-1;i>=0;i--) {
			System.out.println("");


			for(int j=MAXCOL-1;j>=0;j--) {
				System.out.print("[");
				System.out.print(matriz[i][j]);
				System.out.print("]");

			}
		}
	}
	
	public static void cargarMatriz(int matriz[][]) {
		
		for(int i=MAXFIL-1;i>=0;i--) {
			System.out.println("");


			for(int j=MAXCOL-1;j>=0;j--) {
				matriz[i][j]=0+i;
				System.out.print("[");
				System.out.print(matriz[i][j]);
				System.out.print("]");

			}
		}
	}
	
	public static void ordenarMatriz(int matriz[][]) {
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++) {
				for(int x=0;x<MAXFIL;x++) {
					for(int y=0;y<MAXCOL;y++) {
						if(matriz[i][j]>matriz[x][y]) {
							int temp=matriz[i][j];
							matriz[i][j]=matriz[x][y];
							matriz[x][y]=temp;
						}
					}
				}
			}
		}
	}		
}

