import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class OrdenarTodaMatrizInsercion {
	final static int MAXFIL=5;
	final static int MAXCOL=5;
	
	public static void main ( String[] args) {
		int Mat[][]={{4,4,2,1,0},{2,1,5,7,2},{0,1,5,7,2},{1,5,7,3,1},{1,5,2,1,6}};
		
		imprimir_matriz(Mat);
		ordenamiento_todamatriz_insercion(Mat);
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

	public static void ordenamiento_todamatriz_insercion(int Mat[][]) {
		int menor,temp,pos_menor_i,pos_menor_j;
		
		for(int i=0;i<MAXFIL;i++) {
			
			for(int j=0;j<MAXCOL;j++) {
				
				menor=Mat[i][j];
				pos_menor_i=i;
				pos_menor_j=j;
				
				for(int x=i; x<MAXFIL;x++) {
					
					int y;
					
					if(x==i) {
						y=j+1;	
					}
					else {
						y=0;
					}
					
					while(y<MAXCOL) {
						
						if(Mat[x][y]<menor) {
							
							menor=Mat[x][y];
							pos_menor_i=x;
							pos_menor_j=y;
						}
						y++;
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
}
