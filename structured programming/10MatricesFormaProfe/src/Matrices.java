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
		int matEntera[][]= {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,1,2,3,0,5,6,7,8,0,10,11,12,0,14,15,16,0,18,0},{0,1,2,0,4,5,0,7,0,9,10,11,12,0,14,15,16,0,0,0},{0,1,0,3,4,0,6,7,8,9,10,0,12,13,14,15,0,17,18,0}};
		int matCaracter[][]= {{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '}};
		int fila;
		int pos;
		int inicioSec=0;
		int finSec=-1;
		
		System.out.println("Ingrese un valor del"+MIN+"al "+(MAXFIL-1));
		fila=obtener_entero_valido();
		System.out.println("Ingrese un valor del"+MIN+"inclusive al "+(MAXCOL-1));

		pos=obtener_entero_valido();

		if ((fila>=0)&&(fila<MAXFIL)&&(pos>=0)&&(pos<MAXCOL)){
			inicioSec=obtener_pos_sec(matEntera,fila,pos);
			System.out.println("INICIO 2222:::: "+inicioSec);
			if (inicioSec<MAXCOL){
				finSec= obtener_fin_sec(matEntera,fila,inicioSec);
			}
		}	
		System.out.println("INICIO :"+inicioSec);
		System.out.println("FIN :"+finSec);
	}
	
	public static int obtener_pos_sec(int mat[][],int fila,int pos){
		int inicio_sec;
		int fin_sec=pos;

		if ((mat[fila][pos]!=0)&&(mat[fila][pos-1]!=0)){//verifica que este a mitad de secuencia o al final.
			fin_sec=obtener_fin_sec(mat,fila,pos);
			inicio_sec=obtener_inicio_sec(mat,fila,fin_sec+1);
		}
		else {//entra si esta al inicio o en pos=0
			inicio_sec=obtener_inicio_sec(mat,fila,fin_sec);
		}
		
		return inicio_sec;
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
