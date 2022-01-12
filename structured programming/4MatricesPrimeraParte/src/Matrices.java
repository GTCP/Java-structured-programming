import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra precargada, solicite al usuario un numero entero y una posición fila, 
//columna. Con estos datos tendrá que realizar un corrimiento a derecha (se pierde el último valor en dicha fila) 
//y colocar el numero en la matriz en la posición fila, columna indicada.

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
		do {
			System.out.println("ingrese fila :"+MIN+" al "+(MAXFIL-1));
			fila=obtener_entero_valido();
		}while(!((fila>=MIN)&&(fila<MAXCOL)));	
		do {
			System.out.println("ingrese columna :"+MIN+" al "+(MAXCOL-1));
			columna=obtener_entero_valido();
		}while(!((columna>=MIN)&&(columna<MAXCOL)));	
		
		imprimir_mat(mat);
		insertar_entero_matriz(mat,fila,columna,entero);
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

	public static void insertar_entero_matriz(int mat[][],int fila,int columna,int entero) {
		corrimiento_derecha(mat,fila,columna);
		mat[fila][columna]=entero;
	}
}
