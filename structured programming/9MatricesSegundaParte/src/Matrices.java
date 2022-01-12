import java.io.BufferedReader;
import java.io.InputStreamReader;
//No hay que aplicar un método de ordenamiento cuando indica que la matriz se encuentra ordenada.
//Hacer un programa que dado una matriz de enteros de tamaño 4*5 que se encuentra precargada, 
//solicite al usuario el ingreso de una fila y dos números enteros (columnas de la matriz), 
//y ordene de forma creciente la matriz en la fila indicada entre las dos posiciones columnas ingresadas.

public class Matrices {
	final static int MAXFIL=4;
	final static int MAXCOL=5;
	final static int MIN=0;
	public static void main(String [] args) {
		int mat[][]= {{4,2,2,7,4},{5,4,2,3,4},{7,1,2,5,4},{2,1,0,3,1}};
		int fila;
		int primerEntero;
		int segundoEntero;
		do {
			System.out.println("fila a ordenar");
			fila=obtener_entero_valido();
		}while(!((fila>=MIN)&&(fila<MAXFIL)));
		do {
			System.out.println("comumna minima a ordenar");
			primerEntero=obtener_entero_valido();
		}while(!((primerEntero>=MIN)&&(fila<MAXCOL)));
		do {
			System.out.println("comumna maxima a ordenar");
			segundoEntero=obtener_entero_valido();
		}while(!((segundoEntero>=MIN)&&(fila<MAXCOL)));
		imprimir_mat(mat);
		
		ordenar_burbujeo_por_fila_dada(mat,fila,primerEntero,segundoEntero+1);
		System.out.println("");
		imprimir_mat(mat);
	}
	public static void eliminar_ocurrencia(int mat[][],int fila,int ocurrencia){
		int posOcurencia=encontrar_pos_ocurrencia(mat,fila,ocurrencia);
		System.out.println(posOcurencia);
		if(posOcurencia!=MAXCOL-1) {
			corrimiento_izquierda(mat,fila,posOcurencia);	
		}
		else  {
			mat[fila][MAXCOL-1]=0;
		}
	}
	public static int encontrar_pos_ocurrencia(int mat[][],int fila,int ocurrencia) {
		int pos=0;
		while((pos<MAXCOL)&&!(mat[fila][pos]==ocurrencia)) {
			pos++;
		}
		return pos;	
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
	public static void corrimiento_izquierda(int mat[][],int fila,int inicio) {
		for(int i=inicio;i<MAXCOL-1;i++) {
			mat[fila][i]=mat[fila][i+1];
		}
	}
	public static void ordenar_burbujeo_por_fila_dada(int mat[][],int fila,int primerEntero,int segundoEntero) {
			int temp;
			for(int i = primerEntero+1;i < segundoEntero;i++){
				for(int j = primerEntero ; j < segundoEntero-1; j++){
					if(mat[fila][j] > mat[fila][j+1]){
						temp= mat[fila][j];
						mat[fila][j] = mat[fila][j+1];
						mat[fila][j+1] = temp;
					}
				}
			}
	}
}
