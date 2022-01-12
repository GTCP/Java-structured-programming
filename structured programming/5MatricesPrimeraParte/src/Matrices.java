import java.io.BufferedReader;
import java.io.InputStreamReader;
//Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra precargada, solicite al usuario un numero entero y elimine la primer 
//ocurrencia de numero en la matriz (un número igual) si existe. Para ello tendrá que buscar la posición y si está, 
//realizar un corrimiento a izquierda y no continuar buscando.
public class Matrices {
	final static int MAXFIL=5;
	final static int MAXCOL=10;
	final static int MIN=0;
	public static void main(String [] args) {
		int mat[][]= {{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9}};
		int entero;
		int fila;
		int columna;
		
		entero=obtener_entero_valido();
		imprimir_mat(mat);
		eliminar_ocurrencia_matriz(mat,entero);
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

	public static void corrimiento_derecha(int mat[][],int fila,int fin) {	
		for(int i=MAXCOL-1;i>fin-1;i--) {
			mat[fila][i]=mat[fila][i-1];
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

	public static void eliminar_ocurrencia_matriz(int mat[][],int entero) {
		boolean ocurrencia=false;
		int fila=0;
		int columna=0;
		while((fila<MAXFIL)&&(!ocurrencia)) {
			while((fila<MAXFIL)&&(columna<MAXCOL)&&(!ocurrencia)) {
				if(mat[fila][columna]==entero) {
					ocurrencia=true;
					System.out.println("OCURRENCIA");
					corrimiento_izquierda(mat,fila,columna);
				}
				columna++;
			}
			fila++;
			columna=0;
		}
	}
	
	public static void corrimiento_izquierda(int mat[][],int fila,int inicio) {
		for(int i=inicio;i<MAXCOL-1;i++) {
			System.out.println(inicio);
			mat[fila][i]=mat[fila][i+1];
		}
		
	}
}
