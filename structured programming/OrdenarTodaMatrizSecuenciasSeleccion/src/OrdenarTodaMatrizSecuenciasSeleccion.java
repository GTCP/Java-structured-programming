import java.io.BufferedReader;
import java.io.InputStreamReader;
public class OrdenarTodaMatrizSecuenciasSeleccion {


	final static int MAXFILA=5;
	final static int MAXCOL=5;
	
	public static void main(String [] args) {
		int Mat[][]= {{0,5,3,0,0},{1,7,0,1,2},{0,0,2,1,0,},{0,5,7,0,0},{1,5,0,2,3}};
		
		imprimir_mat(Mat);
		ordenar_matriz(Mat);
		imprimir_mat(Mat);

	}
	
	public static void ordenar_matriz(int Mat[][]) {
		
		int filabase=0;
		int iniciobase=0;
		int finbase=-1;	
		
		int iniciomenor=0;
		int finmenor=0;
		int filamenor=0;
		
		int filanueva=0;
		int inicionueva=0;
		int finnueva=0;
		
		while(filabase<MAXFILA) {
			 iniciobase=MAXCOL;

			while((filabase<MAXFILA)&&(iniciobase>=MAXCOL)) {

				
				iniciobase=obtener_inicio_sec(Mat,filabase,finbase+1);

				if(iniciobase>=MAXCOL) {
					filabase++;
					finbase=-1;
				}
			}
			
			if(filabase<MAXFILA) {

				finbase=obtener_fin_sec(Mat,filabase,iniciobase);


				iniciomenor=iniciobase;
				finmenor=finbase;
				filamenor=filabase;
				
				finnueva=finbase;
				filanueva=filabase;
				
				while(filanueva<MAXFILA) {
			

					inicionueva=MAXCOL;
					
					while((filanueva<MAXFILA)&&(inicionueva>=MAXCOL)) {

						inicionueva=obtener_inicio_sec(Mat,filanueva,finnueva+1);
		
						if(inicionueva>=MAXCOL) {
							filanueva++;
							finnueva=-1;
						};
						
					}
					if(filanueva<MAXFILA) {
						
						finnueva=obtener_fin_sec(Mat,filanueva,inicionueva);
						System.out.println("finnueva:"+finnueva);
						
						if(es_menor(Mat,iniciomenor,finmenor,filamenor,inicionueva,finnueva,filanueva)) {
							System.out.println("ES MENOR");

							iniciomenor=inicionueva;
							finmenor=finnueva;
							filamenor=filanueva;
							System.out.println("iniciomenorFINAL:"+iniciomenor);
							System.out.println("finmenorFINAL:"+finmenor);
							System.out.println("filamenorFINAL:"+filamenor);

						}
					}
				}
				if((filamenor!=filabase)||(finmenor!=finbase)||(iniciomenor!=iniciobase)) {
					System.out.println("INTERCAMBIO");

					intercambiar(Mat,filamenor,finmenor,iniciomenor,filabase,finbase,iniciobase);
					
				}
			}
			
		}
	}
	
	public static int obtener_inicio_sec(int mat[][],int fila,int pos) {
		
		while((pos<MAXCOL)&&(mat[fila][pos]==0)) {
			pos++;
		}
		return pos;
	}
	
	public static int obtener_fin_sec(int mat[][],int fila,int pos) {
		while((pos<MAXCOL)&&(mat[fila][pos]!=0)) {
			pos++;
		}
		return pos-1;
	}
	
	public static void corrimiento_derecha(int Mat[][],int fin,int fila,int dif) {
		for(int i=0; i<dif;i++) {
			for(int j=MAXCOL-1;j>fin;j++) {
				Mat[fila][j]=Mat[fila][j-1];
			}
		}
	}
	
	public static void corrimiento_izquierda(int Mat[][],int fin,int fila,int dif) {
		for(int i=0; i<dif;i++) {
			if(fin==MAXCOL-1) {
				Mat[fila][fin]=0;
			}
			for(int j=fin;j<MAXCOL-1;j++) {
				Mat[fila][j]=Mat[fila][j+1];
			}
		}
	}
	
	public static void intercambiar(int Mat[][],int filamenor,int finmenor,int iniciomenor,int filabase,int finbase,int iniciobase) {
		int longmenor=(finmenor-iniciomenor)+1;
		int longbase=(finbase-iniciobase)+1;
		
		int dif=longmenor-longbase;
		
		if(dif>0) {
			corrimiento_derecha(Mat,finbase,filabase,Math.abs(dif));
			acomodar_sec(Mat,finmenor,filamenor,iniciomenor,finbase,iniciobase,filabase,longmenor);
			corrimiento_izquierda(Mat,finmenor,filamenor,Math.abs(dif));
			finbase+=Math.abs(dif);
		}
		else if(dif<0) {
			corrimiento_derecha(Mat,finmenor,filamenor,Math.abs(dif));
			acomodar_sec(Mat,finmenor,filamenor,iniciomenor,finbase,iniciobase,filabase,longbase);
			corrimiento_izquierda(Mat,finbase,filabase,Math.abs(dif));
			finbase-=Math.abs(dif);
		}
		else {
			acomodar_sec(Mat,finmenor,filamenor,iniciomenor,finbase,iniciobase,filabase,longmenor);
		}
		
		System.out.println("termino intercambiar");

	}
	
	
	public static void imprimir_mat(int Mat[][]) {
		for(int i=0;i<MAXFILA;i++) {
			System.out.println("");
			for(int j=0; j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(Mat[i][j]);
				System.out.print("]");

			}
		}
	}
	
	
	public static void acomodar_sec(int Mat[][],int finmenor,int filamenor,int iniciomenor,int finbase,int iniciobase,int filabase,int longmenor) {
		
		for(int i=0;i<longmenor;i++) {
			int aux=Mat[filamenor][iniciomenor+i];
			Mat[filamenor][iniciomenor+i]=Mat[filabase][iniciobase+i];
			Mat[filabase][iniciobase+i]=aux;
		}
		
	}
	
	
	public static boolean es_menor(int Mat[][],int iniciomenor,int finmenor,int filamenor,int inicionueva,int finnueva,int filanueva) {
		int menor=0;
		int nueva=0;
		
		for(int i=iniciomenor;i<=finmenor;i++) {
			menor+=Mat[filamenor][i];
		}
		for(int i=inicionueva;i<=finnueva;i++) {
			nueva+=Mat[filanueva][i];
		}
		
		if(nueva<menor) {
			return true;
		}
		else if(nueva>menor) {
			return false;
		}
		else {
			return false;
		}
	}
}
