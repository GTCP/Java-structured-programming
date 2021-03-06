import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Dada una matriz MatA de NxM de secuencias de caracteres separadas por uno o mas espacios '', realizar un programa que ordene ascendendentemente toda la matriz de secuencias considerando la cantidad de caracteres numeros que posee cada secuencia. En el caso de requerir corrimientos suponer que siempre hay espacio.
//OBSERVACIONES GENERALES:
//- MatA esta cargada inicialmente.
//No se pueden utilizar estructuras auxiliares.
// Puede haber uno o mas caracteres espacio al principio y al final de la fila.
// Realizar el programa completo bien modularizado.
public class FinalLibre2019SINDESPLAZAMIENTO {
	final static int MAXFIL=5;
	final static int MAXCOL=10;
	
	public static void main (String [] args) {
		char MatA[][]= {{' ','2','1',' ',' ',' ',' ','A','3',' '},{' ','R','F',' ',' ',' ',' ','F','1',' '},{' ','1','2',' ',' ',' ',' ','2','R',' '},{' ','1','p',' ',' ',' ',' ','1','2',' '},{' ','t','1',' ',' ',' ',' ','1','2',' '}};
	
		imprimir_matriz(MatA);
		
		System.out.println("");
		
		for(int x=1;x<MAXCOL;x++) {
			int inicioanterior=0;
			int finanterior=0;
			int filaanterior=0;
			int digitoanterior=0;
			for(int i=0;i<MAXFIL;i++) {
				int j=0;
				int inicioactual=0;
				int finactual=-1;
				int digitoactual=0;
				int filaactual=i;

				while(j<MAXCOL-1) {
					
					inicioactual=encontrar_inicio_sec(MatA,filaactual,finactual+1);
					System.out.println("");

					System.out.println("InicioActual="+inicioactual);

					finactual=encontrar_fin_sec(MatA,filaactual,inicioactual);

					System.out.println("FinActual="+finactual);
					System.out.println("FilaActual="+filaactual);
					digitoactual=contador_digito(MatA,filaactual,inicioactual,finactual);
					System.out.println("");
					System.out.println("DigitoActual="+digitoactual);
					System.out.println("");

					if((inicioactual!=MAXCOL-1)&&(!(finactual==inicioactual-1))) {
						System.out.println("ENTRE EN EL IF");
						int longanterior=(finanterior-inicioanterior)+1; //variable que contiene cuanto mide la secuencia anterior
						int longactual=(finactual-inicioactual)+1; //variable que contiene cuanto mide la secuencia actual
						int dif=0;
						
						if(digitoactual>digitoanterior) {
							
							inicioanterior=inicioactual;
							finanterior=finactual;
							digitoanterior=digitoactual;
							j=finactual;
							filaanterior=filaactual;
						}
						else  {
								
							cambio_sec(MatA,filaanterior,inicioanterior,finanterior,filaactual,inicioactual,finactual,longanterior,longactual,dif);
							if(longanterior==longactual) {
								dif=0;
							}
							else if(longanterior<longactual) {
								dif=(longactual-longanterior);
								
								if(dif<0) {
								dif=Math.abs(dif);
								}
							}
							else if(longanterior>longactual) {
								 dif=(longanterior-longactual);
									
								if(dif<0) {
								dif=Math.abs(dif);
								}
							}
							
							inicioanterior=inicioactual-dif;
							finanterior=finactual;
							j=finactual;
							filaanterior=filaactual;
						}
					}
						else {
							j=MAXCOL-1;
						}
				}
				System.out.println("TERMINO WHILE");
			}
		}
			System.out.println("TERMINO FOR");
			System.out.println("TERMINO FOR");
			System.out.println("TERMINO FOR");
			System.out.println("TERMINO FOR");
			System.out.println("TERMINO FOR");
			System.out.println("TERMINO FOR");
			System.out.println("TERMINO FOR");
				
		
		System.out.println("");
		imprimir_matriz(MatA);
	
	}
	
	public static void desplazamiento_derecha(char MatA[][],int inicio,int fin,int fila) {
			for(int i=fin;i>=inicio;i--) {
				MatA[fila][i]=MatA[fila][i-1];
			}
	}
	public static void desplazamiento_izquierda(char MatA[][],int inicio,int fin,int fila) {
		
	}
	
	
	public static void cambio_sec(char [][]MatA,int filaanterior,int inicioanterior,int finanterior,int filaactual,int inicioactual,int finactual,int longanterior,int longactual,int dif) {
		
		
		if(longanterior==longactual) {
			for(int i=0;i<longanterior;i++) {
				char aux=MatA[filaanterior][inicioanterior+i];
				MatA[filaanterior][inicioanterior+i]=MatA[filaactual][inicioactual+i];
				MatA[filaactual][inicioactual+i]=aux;
			}
			imprimir_matriz(MatA);
	}
		else if(longanterior<longactual) {
	
		
		for(int i=0;i<longactual;i++) {
				char aux=MatA[filaactual][finactual-i];
				MatA[filaactual][finactual-i]=MatA[filaanterior][finanterior-i];
				MatA[filaanterior][finanterior+dif-i]=aux;
			}
			MatA[filaactual][finactual]=' ';
			imprimir_matriz(MatA);
		}
	
		else if(longanterior>longactual) {
		
			
			for(int i=0;i<longanterior;i++) {
				char aux=MatA[filaanterior][inicioanterior+i];
				MatA[filaanterior][inicioanterior+1]=MatA[filaactual][inicioactual+i];
				MatA[filaactual][inicioactual+i-dif]=aux;
			}
			MatA[filaanterior][finanterior]=' ';
			imprimir_matriz(MatA);
		}
	}
	
	public static int encontrar_fin_sec(char MatA[][],int fila,int inicio) {
		boolean encontre=false;
		
		int j=inicio;
		
		while((j<MAXCOL)&&(!encontre)) {
			if(MatA[fila][j] != ' ') {
				j++; 
			}
			else {
				encontre=true;

			}
		}
		
		
		return j-1;
		
	}
	
	public static int contador_digito(char MatA[][],int fila,int inicio,int fin) {
		int contador=0;
		for(int i=inicio;i<=fin;i++) {
			if(es_digito(MatA[fila][i])) {
				contador++;
			}
		}
		return contador;
	}
	
	public static boolean es_digito(char c) {
		switch(c) {
		case '0': case '1':case '2':case '3':case '4': case '5':case '6':case '7': case '8': case '9': return true;
		default : return false;
		}
	}
	
	
	public static int encontrar_inicio_sec(char MatA[][],int fila,int fin) {
		boolean encontre=false;
		
		int j=fin;
		
		while((j<MAXCOL-1)&&(!encontre)) {
			
			if(MatA[fila][j]==' ') {
				j++;
				
			}
			
			else {
				
				encontre=true;
			}
		}
		
		return j;
		
	}
	
	public static void imprimir_matriz(char MatA[][]) {
		
		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");

			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(MatA[i][j]);
				System.out.print("]");

			}
		}
	}
}
