
public class OrdenarMatrizPorBurbujeo {
	final static int MAXFIL=4;
	final static int MAXCOL=4;
		public static void main(String [] args) {
			
			int matriz[][]= {{5,3,2,87,1},{19,12,456,1,2},{21,324,23,51},{176,12,136,12}};
			
		//	cargarMatriz(matriz);
			imprimirMatriz(matriz);
			int i=0;
			while(i<MAXFIL) {
			ordenarBurbujeo(matriz,i);
			i++;
			}
			System.out.println("");
			
			imprimirMatriz(matriz);
		}
		
		
		public static void cargarMatriz(int matriz[][]) {
			
			for(int i=0;i<MAXFIL;i++) {
				System.out.println("");
				for(int j=0;j<MAXCOL;j++) {
					matriz[i][j]=(int)Math.random()*i+i+3*2;	
				}
			}
		}
		
		public static void imprimirMatriz(int matriz[][]) {
			for(int i=0;i<MAXFIL;i++) {
				System.out.println("");
				for(int j=0;j<MAXCOL;j++) {
				System.out.print("[");
				System.out.print(matriz[i][j]);
				System.out.print("]");
				}
			}
		}
		
		public static void ordenarBurbujeo(int matriz[][],int FILA) {
			
			
			for(int i=1;i<MAXFIL;i++) {
				for(int j=0;j<MAXCOL-1;j++) {
				
					System.out.println("asd");
					if(matriz[FILA][j]>matriz[FILA][j+1]) {
						int temp=matriz[FILA][j];
						matriz[FILA][j]=matriz[FILA][j+1];
						matriz[FILA][j+1]=temp;
						
					}	
				}
			}
			
		}
		
		public static void burbujeo(int[][] matriz,int fila){
			
				for(int i = 1;i < MAXFIL;i++){
					for (int j = 0 ; j < MAXCOL - 1; j++){
						if (matriz[fila][j] > matriz[fila][j+1]){
							int temp = matriz[fila][j];
							matriz[fila][j] = matriz[fila][j+1];
							matriz[fila][j+1] = temp;
						}
					}
				}
		}

		
}
