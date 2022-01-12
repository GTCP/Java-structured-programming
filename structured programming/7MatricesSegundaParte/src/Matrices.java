import java.io.BufferedReader;
import java.io.InputStreamReader;

//No hay que aplicar un método de ordenamiento cuando indica que la matriz se encuentra ordenada.
//Hacer un programa que dado una matriz ordenada creciente por filas de enteros de tamaño 4*5 que se encuentra precargada, 
//solicite al usuario un numero entero y una fila, y luego inserte el numero en la matriz en la fila indicada manteniendo su orden.

public class Matrices {
	final static int MAXFIL=4;
	final static int MAXCOL=5;
	final static int MIN=0;
	public static void main(String [] args) {
		int mat[][]= {{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4}};
		int fila;
		int entero=obtener_entero_valido();
		
		do {
		fila=obtener_entero_valido();
		}while(!((fila>=MIN)&&(fila<MAXFIL)));
		imprimir_mat(mat);
		insertar_ord_por_fila(mat,fila,entero);
		System.out.println("");
		imprimir_mat(mat);
	}
	
	public static void insertar_ord_por_fila(int mat[][],int fila,int entero) {
		int posAColocar=encontrar_pos_ord(mat,fila,entero);
		if(posAColocar==MAXCOL) {
			posAColocar=MAXCOL-1;
		}
		corrimiento_derecha(mat,fila,posAColocar);
		mat[fila][posAColocar]=entero;
	}
	
	public static int encontrar_pos_ord(int mat[][],int fila,int entero) {
		int pos=0;
		
		while((pos<MAXCOL)&&!(mat[fila][pos]==entero)) {
			pos++;
		}
		
		return pos;
	}
	
	public static void corrimiento_derecha(int mat[][],int fila,int fin) {
		for(int i=MAXCOL-1;i>fin;i--) {
			mat[fila][i]=mat[fila][i-1];
		}
	}
	
	public static void imprimir_mat(int mat[][]) {
		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");
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
}
