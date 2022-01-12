import java.io.BufferedReader;
import java.io.InputStreamReader;
//Se tiene una matriz de enteros de tamaño 4*20 de secuencias de números entre 1 y 9 (por cada fila), 
//separadas por 0. La matriz esta precargada, y además cada fila empieza y termina con uno o más separadores 0.
//Además, se tiene una matriz de caracteres de tamaño 4*20 de secuencias de caracteres letras minúsculas entre ‘a’ y ‘z’ (por cada fila), 
//separadas por ‘ ’ (espacios). La matriz esta precargada, y además cada fila empieza y termina con uno o más separadores ‘ ’.
//Considere para los siguientes ejercicios estos tipos de matriz.

//Hacer un programa que dada la matriz de secuencias de enteros definida y precargada, permita obtener a través de métodos la posición de inicio 
//y la posición de fin de la secuencia ubicada a partir de una posición entera y una fila, ambas ingresadas por el usuario. 
//Finalmente, si existen imprima por pantalla ambas posiciones obtenidas.

public class Matrices {
	final static int MAXFIL=4;
	final static int MAXCOL=20;
	final static int MIN=0;
	public static void main(String [] args) {
		int matEntera[][]= {{0,1,2,3,0,5,6,7,0,9,10,0,12,13,14,0,16,17,0,0},{0,1,2,3,0,5,6,7,8,0,10,11,12,0,14,15,16,0,18,0},{0,1,2,0,4,5,0,7,0,9,10,11,12,0,14,15,16,0,0,0},{0,1,0,3,4,0,6,7,8,9,10,0,12,13,14,15,0,17,18,0}};
		int matCaracter[][]= {{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '}};
		int fila;
		int pos;
		int inicioSec=0;
		int finSec=-1;
		
		do {
			System.out.println("numero de columna de "+MIN+" inclusive a "+MAXFIL);
			fila=obtener_entero_valido();
		}while(!((fila>=MIN)&&(fila<MAXFIL)));
		do {
			System.out.println("numero de fila de "+MIN+" inclusive a "+MAXCOL);
			pos=obtener_entero_valido();
		}while(!((pos>=MIN)&&(pos<MAXCOL)));
		
		
		if((pos>0)&&(matEntera[fila][pos]!=0)&&(matEntera[fila][pos-1]!=0)) {
			pos=buscar_pos_vacio(matEntera,fila,pos);
		}
		if(pos!=MAXCOL) {
			inicioSec=obtener_inicio_sec(matEntera,fila,pos+1);
			finSec=obtener_fin_sec(matEntera,fila,inicioSec);
			System.out.println("INICIO :"+inicioSec+" valor: "+matEntera[fila][inicioSec]);
			System.out.println("FIN :"+finSec+" valor: "+matEntera[fila][finSec]);

		}
	}
	
	public static int obtener_inicio_sec(int mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]==0)) {
			pos++;
		}
		return pos;
	}
	public static int buscar_pos_vacio(int mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]!=0)) {
			pos++;
		}
		return pos;
	}
	
	public static int obtener_fin_sec(int mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]!=0)){
			pos++;
		}
		return pos-1;
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

	public static void imprimir_matriz(int mat[][]) {
		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(mat[i][j]);
				System.out.print("]");
			}
		}
	}
}


