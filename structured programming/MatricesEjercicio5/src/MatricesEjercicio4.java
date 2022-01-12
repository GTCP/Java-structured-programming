import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class MatricesEjercicio4 {
	final static int MAXFIL=3;
	final static int MAXCOL=2;
	
	public static void main( String[] args) {
		int Mat[][]= {{1,1},{2,2},{3,3}};
		int arr[]= {0,2}; 
		int valorfila=obtener_valor_fila(arr);
		
		System.out.println("VALOR FILA="+valorfila);
		int pos=encontrar_lugar(Mat,valorfila);
		
		imprimir_matriz(Mat);
		corrimiento(Mat,pos);
		
		System.out.println("");
		imprimir_matriz(Mat);

		
		copiar_fila(Mat,arr,pos);
		System.out.println("");
		imprimir_matriz(Mat);
	}
	
	public static int encontrar_lugar(int Mat[][],int valorfilaanterior) {
		int pos=0;
		int valorfilaactual=0;
		boolean posicionvalida=false;
		
		while((pos<MAXFIL)&&(!posicionvalida)) {
			for(int j=0;j<MAXCOL;j++) {
				valorfilaactual+=Mat[pos][j];
			}
			if(valorfilaactual>=valorfilaanterior) {
				posicionvalida=true;
				System.out.println("POS:"+pos);
			}
			else {
				valorfilaactual=0;
				pos++;
			}
		}
		return pos;
	}
	
	public static void corrimiento(int Mat[][],int pos) {
		
		for(int i=MAXFIL-1;i>pos;i--) {
			for(int j=0;j<MAXCOL;j++) {
				
				Mat[i][j]=Mat[i-1][j];
			}
		}
	}
	
	public static void copiar_fila(int Mat[][],int arr[],int pos) {
		for(int i=0;i<MAXCOL;i++) {
			Mat[pos][i]=arr[i];
		}
	} 
	
	
	public static int obtener_valor_fila(int arr[]) {
		int valor=0;
		for(int i=0;i<MAXCOL;i++) {
			valor+=arr[i];
		}
		return valor;
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
