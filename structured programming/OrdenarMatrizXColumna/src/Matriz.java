//ORDENAR MATRIZ POR COLUMNAS

public class Matriz {
	final static int MAXFILA=5;
	final static int MAXCOL=5;
	
	public static  void main(String [] args) {
		int mat[][]={{5,5,5,5,5},{4,4,4,4,4},{3,3,3,3,3},{2,2,2,2,2},{1,1,1,1,1}};
		imprimir_mat(mat);
		for(int i=0;i<MAXCOL;i++) {
		ordenar_matriz_columna_seleccion(mat,i);
		}
		System.out.println("");
		imprimir_mat(mat);
	}
	public static void ordenar_matriz_columna_seleccion(int[][] mat, int columna) {
		int pos_menor, tmp;
		for(int i = 0; i < MAXFILA; i++) {
			pos_menor= i;
			for(int j = i + 1; j < MAXFILA; j++){
				if(mat[j][columna] < mat[pos_menor][columna]) {
					pos_menor= j;
				}
			}
			if(pos_menor!= i){
				tmp= mat[i][columna];
				mat[i][columna] = mat[pos_menor][columna];
				mat[pos_menor][columna] = tmp;
			}
		}
	}
	
	public static void imprimir_mat(int mat[][]) {

		for(int i=0;i<MAXFILA;i++) {
			System.out.println();
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(mat[i][j]);
				System.out.print("]");
			}
		}
	}
}
