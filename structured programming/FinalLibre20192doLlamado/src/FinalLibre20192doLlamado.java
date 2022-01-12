
public class FinalLibre20192doLlamado {
	final static int MAXFIL=2;
	final static int MAXCOL=10;
	
	public static void main ( String [] args) {
		char matA[][]= {{'1',' ',' ',' ',' ',' ','3','2',' ','1'},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
		
		
		imprimir_matriz(matA);
		ordenar_asc_toda_matriz(matA);
		imprimir_matriz(matA);
	}
	
	public static void imprimir_matriz(char matA[][]) {
	
		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(matA[i][j]);
				System.out.print("]");
			}
		}
	}

	public static void ordenar_asc_toda_matriz(char matA[][]) {
		int inicioAnteriorSec=0;
		int finAnteriorSec=0;
		int filaAnteriorSec=0;
	
		int cantNumerosActualSec=0;
		int cantNumerosAnteriorSec=0;
		
		
		for(int x=0;x<MAXFIL*MAXCOL;x++) {
		
		for(int i=0;i<MAXFIL;i++) {
			int inicioActualSec=0;
			int finActualSec=-1;
			int filaActualSec=i;
			int pos=0;
			
			while(pos<MAXCOL-1) {
				inicioActualSec=encontrar_inicio(matA,filaActualSec,finActualSec+1);
				finActualSec=encontrar_fin(matA,filaActualSec,inicioActualSec);
				cantNumerosActualSec= cantidad_numeros_sec(matA,filaActualSec,inicioActualSec,finActualSec);
//REVISAR CONTADOR QUE LA PRIMERA VEZ ANDA BIEN 				
				if((inicioActualSec!=finActualSec)&(inicioActualSec!=' ')){	
					System.out.println("inicio actual no es igual al fin y tampoco vacio");
				if(cantNumerosAnteriorSec>cantNumerosActualSec) {
					System.out.println("entro el if la secuencia anterior es mayor a la actual");

					int longitudAnteriorSec=(finAnteriorSec-inicioAnteriorSec)+1;
					int longitudActualSec=(finActualSec-inicioActualSec)+1;
					
					System.out.println("entro en cambiar lugar de sec");
					cambiar_lugar_sec(matA,inicioAnteriorSec,finAnteriorSec,filaAnteriorSec,inicioActualSec,finActualSec,filaActualSec,longitudAnteriorSec,longitudActualSec);
					cantNumerosAnteriorSec=cantNumerosActualSec;

					//SI EL INICIO Y FIN ACTUAL SON VACIOS  E IGUALES NO HACER NADA
					
					if(longitudAnteriorSec>longitudActualSec) {
				//		finActualSec=finActualSec+(longitudAnteriorSec-longitudActualSec);
					}
					
				}
				
				else {
					filaAnteriorSec=filaActualSec;
					inicioAnteriorSec=inicioActualSec;
					finAnteriorSec=finActualSec;
				}
			}
				pos=finActualSec;
			}
			System.out.println("");

			System.out.println("termino while de columnas pos:"+pos+" fila:"+filaActualSec);
		}
		
		}
	}
	
	public static void cambiar_lugar_sec(char matA[][],int inicioaAnteriorSec,int finAnteriorSec,int filaAnteriorSec,int inicioActualSec,int finActualSec,int filaActualSec,int longitudAnteriorSec,int longitudActualSec) {
		
	}
	
	public static int encontrar_inicio(char matA[][],int fila,int pos) {
		System.out.println("");

		System.out.println("encontrar inicio");
		while((pos<MAXCOL-1)&&(!(matA[fila][pos]!=' '))) {
			pos++;
		}
		System.out.println("encontrar inicio-termino while- pos :"+pos);

		return pos;
	}
	
	public static int encontrar_fin(char matA[][],int fila,int pos){
		System.out.println("---");
		System.out.println("encontrar fin");
		while((pos<MAXCOL-1)&&(!((matA[fila][pos]!=' ')&&(matA[fila][pos+1]==' ')))) {
			pos++;
		}
		System.out.println("encontrar fin- termino while- pos:"+pos);
		return pos;
	}
	
	public static int cantidad_numeros_sec(char matA[][],int fila,int inicio,int fin) {
		System.out.println("CANTIDAD NUMEROS SEC : FILA, INICIO Y FIN: "+fila+" :"+inicio+" fin: "+fin);
		char caracter=' ';
		int contador=0;
		
		for(int i=inicio;i<fin-inicio+1;i++) {
			caracter=matA[fila][inicio+i];
		
		switch (caracter){
			case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': 
				contador++; break;
			default : ;break;
		}
		}
		System.out.println("cantidad de numeros sec: contador:" +contador);
		return contador;
	}
}
