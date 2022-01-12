import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Matrices {
	final static int MAXFIL=5;
	final static int MAXCOL=10;
	final static int MIN=0;
	public static void main(String [] args) {
		int mat[][]= {{2,1,2,3,4,5,6,2,8,9},{2,1,2,3,4,5,6,2,8,9},{2,1,2,3,4,5,6,2,8,9},{2,1,2,3,4,5,6,2,8,9},{2,1,2,3,4,5,6,2,8,9}};
		int entero;
		int fila;
		int columna;
		
		entero=obtener_entero_valido();
		imprimir_mat(mat);
	//	eliminar_todas_ocurrencias_matriz_while(mat,entero);
		eliminar_todas_ocurrencias_matriz_for(mat,entero);
		System.out.println("");
		imprimir_mat(mat);
		
	}
	public static void imprimir_mat(int mat[][]) {

		for(int i=0;i<MAXFIL;i++) {
			System.out.println();
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(mat[i][j]);
				System.out.print("]");
			}
		}
	}

	public static int obtener_entero_valido() {
		int entero=0;
		boolean salidaDoWhile=false;
	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
		do {
			try {
			System.out.println("Ingresa un numero:");
			entero=Integer.valueOf(entrada.readLine());
			salidaDoWhile=true;
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			}
		}while(!salidaDoWhile);
	
		return entero;
	}
	
	public static void eliminar_todas_ocurrencias_matriz_while(int mat[][],int entero) {
		int fila=0;
		int columna=0;
		while((fila<MAXFIL)) {
			while((fila<MAXFIL)&&(columna<MAXCOL)) {
				if(mat[fila][columna]==entero) {
					System.out.println("OCURRENCIA");
					corrimiento_izquierda(mat,fila,columna);
				}
				columna++;
			}
			fila++;
			columna=0;
		}
	}
	
	public static void eliminar_todas_ocurrencias_matriz_for(int mat[][],int entero) {
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++) {
				if(mat[i][j]==entero) {
					corrimiento_izquierda(mat,i,j);
				}
			}
		}
		
	}
	
	public static void corrimiento_izquierda(int mat[][],int fila,int inicio) {
		for(int i=inicio;i<MAXCOL-1;i++) {
			System.out.println(inicio);
			mat[fila][i]=mat[fila][i+1];
		}
		
	}
}
