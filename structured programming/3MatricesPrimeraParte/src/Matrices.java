import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra precargada, solicite al usuario una posición fila, 
//columna y realice un corrimiento a izquierda.

public class Matrices {
	final static int MAXFIL=5;
	final static int MAXCOL=10;
	final static int MIN=0;
	
	public static void main(String[] args) {
		int mat[][]= {{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9}};
		int fila=0;
		int columna=0;
		
		do {
			System.out.println(MIN+" al "+(MAXFIL-1));
			fila=obtener_entero_valido();
		}while(!((fila>=MIN)&&(fila<MAXFIL)));
		do {
			System.out.println(MIN+" al "+(MAXCOL-1));
			columna=obtener_entero_valido();
		}while(!((columna>=MIN)&&(columna<MAXCOL)));	
		imprimir_mat(mat);
		corrimiento_izquierda(mat,fila,columna);
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

	public static void corrimiento_izquierda(int mat[][],int fila,int inicio) {
		
		for(int i=inicio;i<MAXCOL-1;i++) {
			mat[fila][i]=mat[fila][i+1];
		}
	}
}
