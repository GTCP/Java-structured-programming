import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class SegundoParcial2019 {
	
	//dada una matriz de caracteres de MXN compuesta de secuencias de caracteres separadas por espacios,hacer un programa completo para borrar la secuencia central de cada fila(secuencia correspondiente a la mitad de la cantidad de secuencias que tiene la fila sin importar si la cantidad es par o impar), para borrar realizar los desplazamientos necesarios y no utilizar estructuras auxiliares. suponer que la matriz se encuentra cargada y que cada fila comienza y termina con caracteres espacios.
	public static void main (String [] args) {
		final int MAXFIL=2;
		final int MAXCOL=6;
		char [][]matriz={ {' ','1',' ','1','2',' '},{' ',' ','2',' ','4',' '} };
		int cantidad_sec=0;
		int secuencia=0;
		int inicio_sec=0;
		int fin_sec=0;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
	//	for(int i=0;i<MAXFIL;i++) {
//			for(int j=0;j<MAXCOL;j++) {
					
				//	try {
						//System.out.println("Ingresar un caracter:");
					//	matriz[i][j]=(char)(entrada.readLine().charAt(0));
				//	}
			//		catch(Exception exc) {
		//				System.out.println(exc);
	//				}
//
		//		System.out.println(matriz[i][j]);
	//		}
//		}//fin carga matriz
		//IMPRIMIR MATRIZ
		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");

				System.out.print(matriz[i][j]);
				System.out.print("]");

			}
		}
		//-----------------------------------------
		for(int i=0;i<MAXFIL;i++) {
		
			//contar secuencias
			for(int j=0;j<MAXCOL-1;j++) {
				if((matriz[i][j]==' ')&&(matriz[i][j+1]!=' ')) {
					cantidad_sec++;
				}
			}
			secuencia=cantidad_sec/2;

			cantidad_sec=0;
			System.out.println("");

			//encontrar inicio sec
			for(int s=0;s<MAXCOL-1;s++) {
				if((matriz[i][s]==' ')&&(matriz[i][s+1]!=' ')) {
					secuencia--;

					if(secuencia==0) {
						inicio_sec=s+1;
					}
				}
				
			}
			for(int p=inicio_sec;p<MAXCOL-1;p++){
				if((matriz[i][p]!=' ')&&(matriz[i][p+1]==' ')) {
					fin_sec=matriz[i][p];
				}
				
			}
			for(int o=inicio_sec;o<MAXCOL-1;o++) {
				matriz[i][o]=matriz[i][o+1];
			}
			
		}
	
		//IMPRIMIR MATRIZ
		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");

				System.out.print(matriz[i][j]);
				System.out.print("]");

			}
		}
	}		
}

