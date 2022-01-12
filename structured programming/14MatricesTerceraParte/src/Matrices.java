import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se tiene una matriz de enteros de tamaño 4*20 de secuencias de números entre 1 y 9 (por cada fila), 
//separadas por 0. La matriz esta precargada, y además cada fila empieza y termina con uno o más separadores 0.
//Además, se tiene una matriz de caracteres de tamaño 4*20 de secuencias de caracteres letras minúsculas entre ‘a’ y ‘z’ (por cada fila), 
//separadas por ‘ ’ (espacios). La matriz esta precargada, y además cada fila empieza y termina con uno o más separadores ‘ ’.
//Considere para los siguientes ejercicios estos tipos de matriz.

//Hacer un programa que dada la matriz de secuencias de enteros definida y precargada, y un número entero ingresado por el usuario, elimine de cada fila las secuencias de tamaño igual al número
//ingresado.
public class Matrices {
	final static int MAXFIL=4;
	final static int MAXCOL=20;
	final static int MIN=0;
	public static void main(String [] args) {
		int matEntera[][]= {{0,1,2,3,0,5,6,7,8,0,10,11,12,0,14,15,16,0,18,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,1,2,0,4,5,0,7,0,9,10,11,12,0,14,15,16,0,0,0},{0,1,0,3,4,0,6,7,8,9,10,0,12,13,14,15,0,17,18,0}};
		char matCaracter[][]= {{' ','a','b','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a','b','c',' ','e','f',' ','h','i',' ','k','n','ñ',' ','o','p',' ','r',' '},{' ','a','b','c',' ','e','f',' ','h','i',' ','a','b','c',' ','o','p',' ','r',' '},{' ','a','b','c',' ','e',' ',' ','a','b','c',' ','n','ñ','p','o','p',' ','r',' '}};
		char aux[]= {' ','a','b','c',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		int inicio=0;
		int fila=0;
		int fin=-1;
		int pos=0;
		int inicioaux=0;
		int finaux=-1;
		imprimir_mat(matCaracter);
		
		//	while(fila<MAXFIL) {
		inicioaux=obtener_inicio_sec_arr(aux,finaux+1);
		finaux=obtener_fin_sec_arr(aux,inicioaux);
		System.out.println("INICIO AUX:"+inicioaux);
		System.out.println("FINAL AUX:"+finaux);

		while(fila<MAXFIL) {
			while(pos<MAXCOL-1) {
				inicio=obtener_inicio_sec_mat(matCaracter,fila,fin+1);
				fin=obtener_fin_sec__mat(matCaracter,fila,inicio);
				System.out.println("Inicio:"+inicio);
				System.out.println("fin:"+fin);
				if(es_igual(matCaracter,aux,inicio,fin,inicioaux,finaux,fila)) {
		
					System.out.println("Entro");
					corrimiento_izquierda(matCaracter,fila,inicio,fin);
					
					pos=inicio;
					fin=inicio-1;
				}
				pos=fin;	
			}
			System.out.println("");
			imprimir_mat(matCaracter);
			 inicio=0;
			 fin=-1;
			 pos=0;
			 fila++;
		}
	}	
	public static int obtener_inicio_sec_mat(char mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]==' ')) {
			pos++;
		}
		return  pos;
	}
	public static int obtener_fin_sec__mat(char mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]!=' ')) {
			pos++;
		}
		return  pos-1;
	}
	public static int obtener_inicio_sec_arr(char arr[],int pos) {
		while((pos<MAXCOL)&&(arr[pos]==' ')) {
			pos++;
		}
		return  pos;
	}
	public static int obtener_fin_sec_arr(char arr[],int pos) {
		while((pos<MAXCOL)&&(arr[pos]!=' ')) {
			pos++;
		}
		return  pos-1;
	}
	

			
	public static void corrimiento_izquierda(char mat[][],int fila,int inicio,int fin) {
		for(int i=0;i<=fin-inicio+1;i++) {
			for(int j=inicio;j<MAXCOL-1;j++) {
				mat[fila][j]=mat[fila][j+1];
			}
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
		while((pos<MAXCOL)&&(mat[fila][pos]==' ')) {
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
	
	public static int obtener_fin_sec(char mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]!=' ')){
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
	public static void imprimir_mat(char mat[][]) {
		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(mat[i][j]);
				System.out.print("]");
			}
		}
	}
	

	public static int obtener_suma_sec(char mat[][],int fila, int inicio, int fin){
		int suma = 0;
		while(inicio <= fin){
			suma++;
			inicio++;
		}
		return suma;
	}
	public static boolean es_igual(char mat[][],char aux[],int inicio,int fin,int inicioaux,int finaux,int fila) {
		int longitudMat=fin-inicio+1;
		System.out.println("LONGITUD AR:"+longitudMat);
		int longitudAux=finaux-inicioaux+1;
		System.out.println("LONGITUD AUX:"+longitudAux);

		
		System.out.println("ES_IGUAL");
		if(longitudMat==longitudAux) {
			System.out.println("MISMA LONGITUD");
			int pos=0;
			while((pos<longitudMat)&&(mat[fila][inicio+pos]==aux[inicioaux+pos])) {
				pos++;
			}
			if(pos==longitudAux) {
				
				System.out.println("TRUE");
				return true;
			}
			else {
				return false;
			}
		}
		return false;

}
}