import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se tiene una matriz de enteros de tamaño 4*20 de secuencias de números entre 1 y 9 (por cada fila), 
//separadas por 0. La matriz esta precargada, y además cada fila empieza y termina con uno o más separadores 0.
//Además, se tiene una matriz de caracteres de tamaño 4*20 de secuencias de caracteres letras minúsculas entre ‘a’ y ‘z’ (por cada fila), 
//separadas por ‘ ’ (espacios). La matriz esta precargada, y además cada fila empieza y termina con uno o más separadores ‘ ’.
//Considere para los siguientes ejercicios estos tipos de matriz.

//Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada, permita encontrar por cada fila la posición de inicio y fin de la anteúltima secuencia 
//(considerar comenzar a buscarla a partir de la ultima posición de la fila).

public class Matrices {
	final static int MAXFIL=4;
	final static int MAXCOL=20;
	final static int MIN=0;
	public static void main(String [] args) {
		int matEntera[][]= {{0,1,2,3,0,5,6,7,8,0,10,11,12,0,14,15,16,0,18,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,1,2,0,4,5,0,7,0,9,10,11,12,0,14,15,16,0,0,0},{0,1,0,3,4,0,6,7,8,9,10,0,12,13,14,15,0,17,18,0}};
		char matCaracter[][]= {{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','ñ','p','o','p',' ','r',' '}};
		int fila=0;
		int inicioSec=MAXCOL;
		int pos=0;
		int finSec;
		int contador=0;
		
			
			while(fila<MAXFIL) {
				inicioSec=MAXCOL;
				finSec=-1;
				pos=MAXCOL;

				while(pos>0){
					finSec=obtener_fin_sec_atras_adelante(matCaracter,fila,inicioSec-1);
					inicioSec=obtener_inicio_sec_atras_adelante(matCaracter,fila,finSec); 
					
					if(matCaracter[fila][finSec]!=0) {
						contador++;
					}
					
					if(contador==2) {
						System.out.println("INICIO FIN ANTE ULTIMA SEC");
						System.out.println("inicio:"+inicioSec);
						System.out.println("fin:"+finSec);
						pos=0;
						
					}
				}
				contador=0;
				fila++;
			}
			
				
				
	}
		
		public static int obtener_inicio_sec_atras_adelante(char mat[][],int fila,int pos) {
			while((pos>0)&&(mat[fila][pos]!= ' ')) {
				pos--;
			}
			return pos+1;
		}
		
		public static int obtener_fin_sec_atras_adelante(char mat[][],int fila,int pos) {
			
			while((pos>0)&&(mat[fila][pos]==' ')) {
				pos--;
			}
			return pos ;
		}
	
	
	public static int obtener_inicio_sec(char mat[][],int fila,int pos) {
		while((pos>0)&&(mat[fila][pos]!=' ')) {
			pos--;
		}
		return pos+1;
	}
	public static int buscar_pos_vacio(int mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]!=0)) {
			pos++;
		}
		return pos;
	}
	
	public static int obtener_fin_sec(char mat[][],int fila,int pos) {
		while((pos>0)&&(mat[fila][pos]==' ')){
			pos--;
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
	

	public static int obtener_suma_sec(int mat[][],int fila, int inicio, int fin){
		int suma = 0;
		while(inicio <= fin){
			suma+=mat[fila][inicio];
			inicio++;
		}
		return suma;
		}
}
