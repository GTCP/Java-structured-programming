import java.io.BufferedReader;
import java.io.InputStreamReader;
//No hay que aplicar un método de ordenamiento cuando indica que la matriz se encuentra ordenada.
//Hacer un programa que dado una matriz ordenada creciente por filas de enteros de tamaño 4*5 que se encuentra precargada, 
//solicite al usuario un numero entero y una fila, y elimine la primer ocurrencia de numero en la fila indicada (un número igual) si existe.
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
		eliminar_ocurrencia(mat,fila,entero);
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
		
}
