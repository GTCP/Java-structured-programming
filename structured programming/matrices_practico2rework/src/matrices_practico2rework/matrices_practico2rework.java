package matrices_practico2rework;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class matrices_practico2rework {
	final static int FILA= 5;
	final static int COLUMNA= 6;
	public static void main ( String[] args) {
		int arreglo[]=new int [COLUMNA];
		int mat[][]=new int[FILA][COLUMNA];
		inicializar_arreglo(arreglo);
		inicializar_matriz(mat);
		int numero_fila=ingresar_entero();
		corrimiento_matriz(mat,numero_fila);
		insertar_fila(arreglo,numero_fila,mat);
		imprimir_matriz(mat);
	}
	public static void inicializar_matriz(int mat[][]) {
		for(int i=0;i<FILA;i++) {
			for(int j=0;j<COLUMNA;j++) {
				mat[i][j]=(i+j)*2;
			}
		}
	}
	public static void inicializar_arreglo (int arreglo[]) {
		for(int i=0;i<COLUMNA;i++) {
			arreglo[i]=(i*2)*2;
		}
	}
	public static int ingresar_entero() {
		boolean validador=true;
		int numero=0;
		while (validador) {
			BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
			Locale.setDefault(new Locale("Es","Us"));
			try {
				System.out.println("Ingrese la posicion donde desea insertar");
				numero=new Integer (entrada.readLine());
				if((numero>=0)&&(numero<FILA)) {
					validador=false;
				}
			}
			catch(Exception exc) {
				System.out.println(exc);
				validador=false;
			}
		}
		return numero;
	}
	public static void imprimir_matriz(int mat[][]) {
		for(int i=0;i<FILA;i++) {

			for(int j=0;j<COLUMNA;j++) {
				System.out.print(" "+mat[i][j]);
			}
		System.out.println("");

		}
	}
	public static void insertar_fila(int arreglo[],int numero_fila,int mat[][]) {
		for(int i=0;i<COLUMNA;i++) {
			mat[numero_fila][i]=arreglo[i];
		}
	}
	public static void corrimiento_matriz(int mat[][],int numero_fila) {
		for(int i=FILA-1;i>numero_fila;i--) {
			for(int j=0;j<COLUMNA;j++) {
				mat[i][j]=mat[i-1][j];
			}
		}
	}
}
