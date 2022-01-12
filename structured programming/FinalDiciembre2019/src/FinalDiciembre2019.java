

public class FinalDiciembre2019 {
	final static int MAXFIL=4;
	final static int MAXCOL=15;
	public static void main ( String[] args) {
		char matB[][]= {{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ','2','1','3',' ',' ',' ',' ',' ',' ',' ',' ',' ','1','3'}};
		char matA[][]= {{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
//1 O MAS SECUENCIAS DISTINTAS DE CARACTER ESPACIO
//SE PIDE AGREGAR LA MAYOR CANTIDAD DE SECUENCIAS NO REPETIDAS DE MATB EN MATA, CONSIDERANDO QUE DICHAS SECUENCIAS NO EXISTAN EN MATA, QUE AL AGREGAR UNA SECUENCIA EN UNA FILA DE MATA SE ESTA REEMPLAZANDO CARACTERES ESPACIOS CONSECUTIVOS POR UNA SECUENCIA DE LETRAS DISTINTAS DE CARACTER ESPACIO, DONDE ADEMAS LA NUEVA SECUENCIA DEBE QUEDAR SEPARADA DE LAS YA EXISTENTES.
//MATA Y MAT B ESTAN CARGADOS' '
//PUEDE HABER 1 O MAS CARACTERES ESPACIOS EN EL PRINCIPIO Y FINAL
		imprimir_matriz(matB);
		imprimir_matriz(matA);
		resolver(matB,matA);
		System.out.println("ASDASD");

		imprimir_matriz(matA);
		

	}
	
	public static void imprimir_matriz(char matriz[][]) {
		for(int i=0;i<MAXFIL;i++) {
			System.out.println("");
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(matriz[i][j]);
				System.out.print("]");

			}
		}
		System.out.println("");

	}
	
	public static int inicio_sec(char[][]matB,int fila,int pos) {
		while((pos<MAXCOL-1)&&(!(matB[fila][pos] != ' '))){
			pos++;
		}
		return pos;
	}
	
	public static int fin_sec(char matB[][],int fila,int pos) {
		while((pos<MAXCOL-1)&&(!((matB[fila][pos]!= ' ')&&(matB[fila][pos+1]== ' ')))){
			pos++;
		}

		return pos;
	}
	
	public static void resolver(char matB[][],char matA[][]) {
		int fin=-1;
		int inicio=0;
		int pos=0;
		for(int i=0; i<matB.length;i++) {
			inicio=-1;
			fin=0;
			while(pos<MAXCOL-1) {
				inicio=inicio_sec(matB,i,fin+1);
				System.out.println(inicio+"inicio");
				fin=fin_sec(matB,i,inicio);
				System.out.println(fin+"fin");
				
			
					if(!((es_repetido(matB,matB,i,inicio,fin,2))&&(es_repetido(matB,matA,i,inicio,fin,1)))) {
						System.out.println("no es repetido");
						int longitud=((fin-inicio)+1+2);
						encontrar_lugar(matB,matA,inicio,fin,longitud,i);
					//termino if	
					}
				
				
				else {
				System.out.println("s se repitio");
				}
				
				pos=fin;
				
				//termino while
			}
			inicio=-1;
			fin=0;
		//termino for
		}
		//termino metodo resolver
	}
	
	public static boolean es_repetido(char [][]origen,char [][]destino,int fila,int inicio,int fin,int max_repetida){
		int iniciorep=0;
		int finrep=-1;
		int contador=0;
		int i=0;
		int longitudanterior=(fin-inicio)+1;
		
		System.out.println("ETAPA 1 ES REPETIDO");
		while((i<MAXFIL)&&(contador<max_repetida)) {
			int j=0;
			System.out.println("fila:"+i);

			System.out.println("ETAPA 2 PRIMER WHILE ");
			while((j<MAXCOL-1)&&(contador<max_repetida)) {
				System.out.println("ETAPA 3 SEGUNDO WHILE ");

				iniciorep=inicio_sec(destino,i,finrep+1);
				
				System.out.println("iniciorep :"+iniciorep);
				
				finrep=fin_sec(destino,i,iniciorep);
				
				System.out.println("finrep :"+finrep);
				
				if(longitudanterior==(finrep-iniciorep)+1) {
					if(comparar_sec(origen,destino,inicio,fin,fila,iniciorep,finrep,i,longitudanterior)) {
						contador++;
						System.out.println("contador: "+contador);
						
					}
				}
				if(!(longitudanterior==(finrep-iniciorep)+1)) {
					System.out.println("NO ENTRO EN EL IF");

				}
				j=finrep;
			}
			iniciorep=-1;
			finrep=0;
			i++;
		}
		if(contador==max_repetida) {
			System.out.println("contador igual que max repetida");

			return true;
		}
		else {
			System.out.println("contador NO igual que max repetida");

			return false;
		}
		
	}

	
	public static boolean comparar_sec(char [][]origen,char [][]destino,int inicio,int fin,int fila,int iniciorep,int finrep,int filarep,int longitudanterior) {
		int i=0;
		while (longitudanterior>i) {
			System.out.println("ETAPA 5 COMPARAR: "+i);
			if(!(origen[fila][inicio+i]==destino[filarep][iniciorep+i])) {
				System.out.println("NO ES IGUAL origen"+origen[fila][inicio+i]);
				System.out.println("NO ES IGUAL destino"+destino[filarep][iniciorep+i]);
				return false;
			}
			i++;
		}
		System.out.println("ES IGUAL");
		return true;
	}

	public static int inicio_vacio(char matriz[][],int fila,int pos) {
		while((pos<MAXCOL)&&(matriz[fila][pos]!=' ')) {
			pos++;
		}
		return pos;
	}
	
	public static int fin_vacio(char matriz[][],int fila,int pos) {
		
		while((pos<MAXCOL)&&(matriz[fila][pos]==' ')) {
			pos++;
		}
		return pos-1;
	}
	
	public static void encontrar_lugar(char matB[][],char matA[][],int inicio,int fin,int longitud,int fila) {
		boolean encontrado=false;
		int iniciovacio=0;
		int finvacio=-1;
		int f=0;
		int c=0;
		System.out.println("encontrar lugar antes del while");
		while((f<MAXFIL)&&(!encontrado)){
			
			while((!encontrado)&&(c<MAXCOL-1)) {
				iniciovacio=inicio_vacio(matA,f,finvacio+1);
				finvacio=fin_vacio(matA,f,iniciovacio);
				
				if(longitud<=fin-inicio+1){
					encontrado=true;
				}
				
				c=finvacio;
			}
			
			if(!encontrado) {
				f++;
			}
		}
		
		if(encontrado) {
			System.out.println("COPIAR");
			copiar(matA,matB,inicio,iniciovacio,fila,longitud,f);
		}
	}
	
	public static void copiar(char matA[][],char matB[][],int inicio,int iniciovacio,int fila,int longitud,int fila2) {
		
		for(int i=0;i<longitud-2;i++) {
			matA[fila2][iniciovacio+i+1]=matB[fila][inicio+i];
		} 
	}
}
