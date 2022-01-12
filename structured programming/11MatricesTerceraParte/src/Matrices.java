import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se tiene una matriz de enteros de tama�o 4*20 de secuencias de n�meros entre 1 y 9 (por cada fila), 
//separadas por 0. La matriz esta precargada, y adem�s cada fila empieza y termina con uno o m�s separadores 0.
//Adem�s, se tiene una matriz de caracteres de tama�o 4*20 de secuencias de caracteres letras min�sculas entre �a� y �z� (por cada fila), 
//separadas por � � (espacios). La matriz esta precargada, y adem�s cada fila empieza y termina con uno o m�s separadores � �.
//Considere para los siguientes ejercicios estos tipos de matriz.

public class Matrices {
	final static int MAXFIL=4;
	final static int MAXCOL=20;
	final static int MIN=0;
	public static void main(String [] args) {
		int matEntera[][]= {{0,1,2,3,0,5,6,7,8,0,10,11,12,0,14,15,16,0,18,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,1,2,0,4,5,0,7,0,9,10,11,12,0,14,15,16,0,0,0},{0,1,0,3,4,0,6,7,8,9,10,0,12,13,14,15,0,17,18,0}};
		int matCaracter[][]= {{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','�',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','�',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','�',' ','o','p',' ','r',' '},{' ','a',' ','c',' ','e','f',' ','h','i',' ','k','n','�',' ','o','p',' ','r',' '}};
		int fila=0;
		int pos=0;
		int inicioSec=0;
		int finSec=-1;
		int sumaSec=0;
		int sumaSecMayor=0;
		int inicioSecMayor=0;
		int finSecMayor=0;
		
		while(fila<MAXFIL) {
			
			while(pos<MAXCOL-1) {
				inicioSec=obtener_inicio_sec(matEntera,fila,finSec+1);
				finSec=obtener_fin_sec(matEntera,fila,inicioSec);
				sumaSec=obtener_suma_sec(matEntera,fila,inicioSec,finSec);
				if(sumaSec>sumaSecMayor) {
					inicioSecMayor=inicioSec;
					finSecMayor=finSec;
					sumaSecMayor=sumaSec;
				}	
				pos=finSec;
			}
			System.out.println("Suma de la sec mas grande:"+sumaSecMayor);
			System.out.println("inicio de la sec mas grande:"+inicioSecMayor);
			System.out.println("fin de la sec mas grande:"+finSecMayor);

			pos=0;
			fila++;
			sumaSec=0;
			sumaSecMayor=0;
			finSec=-1;
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

	public static int obtener_suma_sec(int mat[][],int fila, int inicio, int fin){
		int suma = 0;
		while(inicio <= fin){
			suma+=mat[fila][inicio];
			inicio++;
		}
		return suma;
		}
}
