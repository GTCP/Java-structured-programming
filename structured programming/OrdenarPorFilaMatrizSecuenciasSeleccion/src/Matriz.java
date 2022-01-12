import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Matriz{
	final static int MAXFILA=5;
	final static int MAXCOL=10;

public static void main(String [] args) {
	int Mat[][]= {{0,5,3,0,2,1,0,1,1,0},{0,7,2,0,2,3,0,1,1,0},{0,2,2,0,9,9,0,1,1,0},{0,5,3,0,5,4,0,1,1,0},{0,5,2,0,3,4,0,1,1,0}};
	
	imprimir_mat(Mat);
	ordenar_matriz(Mat);
	imprimir_mat(Mat);

}

public static void ordenar_matriz(int Mat[][]) {
	
	int iniciobase=0;
	int finbase=-1;// tiene que estar en cad fila para que arranque desde 0	
	
	int iniciomenor=0;
	int finmenor=0;
	int filamenor=0;
	
	int filanueva=0;
	int inicionueva=0;
	int finnueva=0;
	
	
		


	for(int filabase=3;filabase<4;filabase++) {
		
		iniciobase=MAXCOL;
		finbase=-1;
	
		iniciomenor=0;
		finmenor=0;
		filamenor=filabase;
		filanueva=filabase;
		inicionueva=0;
		finnueva=0;
		
		while((filabase<MAXFILA)&&(iniciobase>=MAXCOL)) {

			
			iniciobase=obtener_inicio_sec(Mat,filabase,finbase+1);

			
		}
		
		if(iniciobase<MAXCOL) {

			finbase=obtener_fin_sec(Mat,filabase,iniciobase);


			iniciomenor=iniciobase;
			finmenor=finbase;
			inicionueva=0;
			
			finnueva=finbase;

		
				while(inicionueva<MAXCOL) {
				

					inicionueva=obtener_inicio_sec(Mat,filabase,finnueva+1);//le estoy pasando finnueva=filabase
				
					if(inicionueva<MAXCOL) {
						
						finnueva=obtener_fin_sec(Mat,filanueva,inicionueva);
						System.out.println("inicionueva:"+inicionueva);

						System.out.println("finnueva:"+finnueva);
						
						filamenor=filabase;
						filanueva=filabase;
						
						if(es_menor(Mat,iniciomenor,finmenor,filamenor,inicionueva,finnueva,filanueva)) {
							System.out.println("ES MENOR");
	
							iniciomenor=inicionueva;
							finmenor=finnueva;
							
							filamenor=filabase;
							filanueva=filabase;
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
	System.out.println("ENTRO ");
	int menor=0;
	int nueva=0;
	
	for(int i=iniciomenor;i<=finmenor;i++) {
		System.out.println("MENOR");
		menor+=Mat[filamenor][i];
		System.out.println(Mat[filamenor][i]);
	}
	for(int i=inicionueva;i<=finnueva;i++) {
		System.out.println("NUEVA");
		nueva+=Mat[filanueva][i];
		System.out.println(Mat[filanueva][i]);

	}
	System.out.println("MENOR:"+menor);
	System.out.println("NUEVA:"+nueva);
	
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
