import java.io.BufferedReader;
import java.io.InputStreamReader;

//DEVOLVER INICIO Y FIN DE LAS SECUENCIA MAS GRANDE DE TODA LA MATRICES(GRANDE SIGNIFICA QUE MAS SUME ENTRE SI)
public class Matrices {
	final static int MAXFIL=5;
	final static int MAXCOL=20;
	final static int MIN=0;

	public static void main(String [] args) {
		int mat[][]= {{0,1,0,3,4,0,6,7,8,0,10,11,0,13,14,0,16,17,0,0},{0,1,2,0,4,5,6,0,8,9,10,11,0,13,14,15,16,0,18,0},{0,1,2,3,0,5,6,7,8,9,10,11,12,13,0,15,16,17,0,0},{0,1,2,0,4,5,6,7,0,0,10,11,12,0,14,15,0,17,18,0},{0,1,2,3,0,5,6,7,8,0,10,11,12,0,14,15,16,0,18,0}};
		int inicioActual;
		int finActual;
		int sumaActual;
		int inicioMayor=0;
		int finMayor=0;
		int sumaMayor=0;
		int filaMayor=0;
		int columna;
		
		
		for(int filaActual=0;filaActual<MAXFIL;filaActual++) {
			inicioActual=0;
			finActual=-1;
			sumaActual=0;
			columna=0;
			while(columna<MAXCOL-1) {
				inicioActual=obtener_inicio_sec_mat(mat,filaActual,finActual+1);
				finActual=obtener_fin_sec__mat(mat,filaActual,inicioActual);
				sumaActual=obtener_suma_enteros_sec(mat,filaActual,inicioActual,finActual);
				System.out.println("SumaActual: "+sumaActual);
				
				if(sumaActual>sumaMayor) {
					sumaMayor=sumaActual;
					inicioMayor=inicioActual;
					finMayor=finActual;
					filaMayor=filaActual;
				}
				columna=finActual;
			}
		}
		System.out.println("Sec mas grande de la matriz: "+sumaMayor);
		System.out.println("Sec mas grande de la matriz FILA: "+filaMayor);
		System.out.println("Sec mas grande de la matriz INICIO: "+inicioMayor);
		System.out.println("Sec mas grande de la matriz FIN: "+finMayor);
	}
	
	public static int obtener_inicio_sec_mat(int mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]==0)) {
			pos++;
		}
		return  pos;
	}
	public static int obtener_fin_sec__mat(int mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]!=0)) {
			pos++;
		}
		return  pos-1;
	}

	public static int obtener_suma_enteros_sec(int mat[][],int fila, int inicio, int fin){
		int suma = 0;
		while(inicio <= fin){
			suma+=mat[fila][inicio];
			inicio++;
		}
		return suma;
	}
}