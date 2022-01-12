import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class OrdenarTodaLaMatriz {
	final static int MAXFIL=4;
	final static int MAXCOL=2;
		public static void main ( String[] args) {
			
			int Mat[][]= {{4,3},{9,8},{1,6},{6,5}};
			
			
			int entero=pedir_entero();
			imprimir_matriz(Mat);
			resolver(Mat,entero);
			imprimir_matriz(Mat);
		}
		
		public static  int pedir_entero() {
			String Raro="";
			int numero=0;
			char s=' ';
			boolean validador=false;
			
			BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
			do {
				try {
					System.out.println("Ingresar entero:");
					numero=new Integer(entrada.readLine());
					validador=true;
				}
				catch(Exception exc) {
					System.out.println(exc);
					validador=false;
					numero=0;
				}
			}while(!validador);
			
			return numero;
		}
		
		public static void imprimir_matriz(int Mat[][]) {
			for(int i=0;i<MAXFIL;i++) {
				System.out.println();

				for(int j=0;j<MAXCOL;j++) {
					System.out.print("[");
					System.out.print(Mat[i][j]);
					System.out.print("]");

				}
			}
			System.out.println();
		}

		public static void resolver(int Mat[][],int entero) {
			int f=0;
			int c=0;
			int fsig=0;
			int csig=0;
			
			
				for(int j=(MAXFIL*MAXCOL)-2;j>5+1;j--) {
					f=(int)(j/MAXCOL);
					c=j%MAXCOL;
					fsig=(int)((j+1)/MAXCOL);
					csig=(j+1)%MAXCOL;
					
					Mat[f][c]=Mat[fsig][csig-1];
				}
			
			
		}
		
		
		
}

