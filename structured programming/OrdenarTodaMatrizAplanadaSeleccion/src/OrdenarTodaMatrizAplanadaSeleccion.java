import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class OrdenarTodaMatrizAplanadaSeleccion {
	final static int MAXFIL=5;
	final static int MAXCOL=5;
	
	public static void main ( String[] args) {
		int Mat[][]={{4,4,2,1,0},{2,1,5,7,2},{0,1,5,7,2},{1,5,7,3,1},{1,5,2,1,6}};
		
		imprimir_matriz(Mat);
		ordenamiento_todamatrizaplanada_seleccion(Mat);
		System.out.println("");
		imprimir_matriz(Mat);
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

	public static void ordenamiento_todamatrizaplanada_seleccion(int Mat[][]) {
		int menor,temp,pos_menor_i,pos_menor_j;
		
		int nElem=MAXFIL*MAXCOL;
		
		for(int x=0;x<nElem;x++) {
			
			int i=x/MAXCOL;
			int j=x%MAXCOL;
			menor=Mat[i][j];
			pos_menor_i=i;
			pos_menor_j=j;
			
			for(int y=x+1;y<nElem;y++) {
				
				int iY=y/MAXCOL;
				int jY=y%MAXCOL;
				
				if(Mat[iY][jY]<menor) {
					menor=Mat[iY][jY];
					pos_menor_i=iY;
					pos_menor_j=jY;
					
				}
			}
			if(menor<Mat[i][j]) {
				temp=Mat[i][j];
				Mat[i][j]=menor;
				Mat[pos_menor_i][pos_menor_j]=temp;
			}
		}
	}
}