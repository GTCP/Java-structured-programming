package matrices_practico_inicial;

public class matrices_practico_inicial {
	final static int COL = 5;
	final static int FIL = 5;
	final static int MAXNUM = 100;
	public static void main (String[]args) {
		
		
		int mat [][] = new int [FIL][COL];
		int fila [] = new int [FIL];
		
		
		inic_matriz_secuencias(mat);
		imp_matriz(mat);
		
		//                         FILA EN FORMA DE ARREGLO
		inic_arreglo_secuencias(fila);
		System.out.println("la fila es: ");
		imp_arreglo(fila);
		
		int inicArr= inicioSecuencia(fila);
		System.out.println("inicio:" + inicArr);
		int finArr= finSecuencia(fila,inicArr);
		System.out.println("fin: " + finArr);
		int cant = cantidadSecuencias(fila);
		System.out.println("CANT= " + cant);
		
		//                   SUMA DE LA DIAGONAL
		//int suma = SumaDiagonal(mat);
		//System.out.println("la suma de la diagonal es: " + suma );
		
		//					INVERTIR LA POS INICIO Y FIN DE UNA FILA
		//invertir_pos_fila(mat, 1);
		
		//                 	INSERTAR UNA FILA EN X POSICION
		//insertarFila (mat,2,fila);
		
		
		System.out.println(" ");
		
		//                        CORRIMIENTO DESDE FILA
		//corrimiento_arriba(mat, 3);
		//corrimiento_abajo(mat,2);
		//                        ORDENAR COMPONENTES DE UNA FILA ASCENDENTEMENTE
		//ordenar_filas(mat);
		
		//int sumaMat = sumaContenidoFila(mat, 1);
		//int sumaArr = sumaContenido(fila);
		//System.out.println("la suma es: " + sumaMat);
		//System.out.println("la suma FILA: " + sumaArr);
		
		//sumaContenidoFilas(mat);
		System.out.println("  ");
		//ordenar_asc_SumaContenido(mat);
		ordenar_cantSecuencias_asc(mat);
		imp_matriz(mat);
		//sumaContenidoFilas(mat);
		System.out.println("   ");
		
		insertar_filaSec_ordenada_asc(mat, fila);
		//insertar_fila_ordenada_asc(mat, fila);
		imp_matriz(mat);
		
		//sumaContenidoFilas(mat);
		
	}
	
	
	public static int SumaDiagonal (int x [][]) {
		int suma = 0;
		
		for (int i=0;i<FIL;i++) {
			suma += x [i][i];  
		}
		return suma;
	}
	
	public static void inic_matriz_random(int x [][]) {
		
		for (int i=0;i<FIL;i++) {
			for (int j=0;j<COL;j++) {
				x [i][j]= (int) (Math.random()* MAXNUM-1);
			}
		}
			
	}
	
	public static void imp_matriz(int x [][]) {
		
		for (int i=0; i<FIL;i++) {
			for (int j=0;j<COL; j++) {
				System.out.print("  " + x[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public static void invertir_pos_fila (int x[][], int fila) {
		
		if ((fila<FIL)&&(fila>=0)) {
			
			int aux = x[fila][0];
			x[fila][0] = x[fila][FIL-1];
			x[fila][FIL-1] = aux;
			
			
		}
	}

	public static void inic_arreglo_random(int x[]) {
		
		for (int i = 0; i<FIL; i++) {
			x[i]= (int)(Math.random()*MAXNUM-1);
		}
		
	}

	public static void imp_arreglo(int x[]) {
		
		for (int i = 0; i<FIL;i++) {
			System.out.print(x[i]+ "  ");
		}
		System.out.println(" ");
	}

	public static void insertarFila (int x[][], int fila,int y[]) {
		
		for (int i = 0; i<FIL;i++) {
			x[fila][i] = y[i];
		}
		
	}
	
	public static void corrimiento_arriba(int x[][] ,int fila) {
		
		for (int i=0; i<COL; i++) {
			for (int j=0; j<FIL; j++) {
				if (j<fila) {
				x[j][i] = x[j+1][i];
				}
			}
			}
		
	}
	
	public static void corrimiento_abajo(int x[][], int fila) {
		
		for (int i = COL-1; i>=0 ;i--) {
			for (int j = FIL-1; j>=0; j--) {
				
				if (j>fila) {
				x[j][i]= x[j-1][i];
				}
				
			}
		}
	}
	
	public static void ordenar_filas(int x [][]) {
		
		for (int a=0; a<FIL;a++) {
		
		for (int i = 1; i < COL; i++) {
			int aux = x[a][i];
			int j = i - 1;
			while ((j >= 0) && (x[a][j] > aux)){
			x[a][j+1] = x[a][j];
			j--;
			}
			x[a][j+1] = aux;
	}
		}
	}
	
	public static void ordenar_fila_seleccion (int x[][], int fila) {
		
		int i, j, menor, pos, aux;
		for (i = 0; i < FIL; i++) { // tomamos como menor el primero
			menor = x[fila][i]; // de los elementos que quedan por ordenar
			pos = i; // y guardamos su posición
			for (j = i + 1; j < FIL; j++){ // buscamos en el resto
				if (x[fila][j] < menor) { // del array algún elemento
					menor = x[fila][j]; // menor que el actual
					pos = j;
				}
			}
			if (pos != i){ // si hay alguno menor se intercambia
				aux = x[fila][i];
				x[fila][i] = x[fila][pos];
				x[fila][pos] = aux;
			}
		}
	}
	
	public static void ordenar_fila_burbujeo (int x [][], int fila) {
		
		int aux;
		for(int i = 1;i < FIL;i++){
			for (int j = 0 ; j < FIL - 1; j++){
				if (x[fila][j] > x[fila][j+1]){
					aux = x[fila][j];
					x[fila][j] = x[fila][j+1];
					x[fila][j+1] = aux;
					}
			}
		}
		
	}
		
	public static void ordenar_fila_insercion (int x [][], int fila) {
		
		for (int i = 1; i < FIL; i++) {
			int aux = x[fila][i];
			int j = i - 1;
			while ((j >= 0) && (x[fila][j] > aux)){
				x[fila][j+1] = x[fila][j];
				j--;
				}
			x[fila][j+1] = aux;
		}
	}
	
	public static int sumaContenidoFila (int x[][], int fila) {
		int suma = 0;
		
		for (int i = 0;i<COL; i++) {
			suma = suma + x[fila][i];
		}
		return suma;
	}

	public static int sumaContenido (int x []) {
		int suma = 0;
		for (int i = 0; i<FIL; i++) {
			
			suma += x[i];
		}
		return suma;
		
	}
	
	public static void sumaContenidoFilas (int x [][]) {
		
		for (int i=0;i<FIL;i++) {
			System.out.println(sumaContenidoFila(x, i));
		}
	}
	
	public static void ordenar_asc_SumaContenido (int x[][]) {
		
		int aux;
		for (int j = 1; j<FIL;j++) {
			for (int i = 0; i<FIL-1;i++) {
				if (((i+1)!=FIL)&&(sumaContenidoFila(x,i)>(sumaContenidoFila(x,(i+1))))) {
					for (int a = 0; a<COL;a++) {
						aux = x[i][a];
						x[i][a]= x[i+1][a];
						x[i+1][a] = aux;
					}
				}
			}
		}
		
	}

	public static void insertar_fila_ordenada_asc (int x[][], int fila []) {
		
		int pos=-1;
		for (int i = 0; i<FIL;i++) {
			if (sumaContenidoFila(x,i)<=sumaContenido(fila)) {
				pos = i;
			}
		}
		
		corrimiento_arriba(x, pos);
		for (int j = 0; j<COL;j++) {
			x[pos][j]=fila[j];
		}	
	}
	
	public static void inic_matriz_secuencias(int x[][]) {
		
		int aux;
		for (int i = 0; i<FIL;i++) {
			for (int j=0; j<COL;j++) {
				aux= (int)(Math.random()*15-1);	
				if (aux>7) {
					aux=(int)(Math.random()*MAXNUM-1);
				}
				else {
					aux=0;
				}
				x[i][j]=aux;
			}
		}
	}
	
	public static void inic_arreglo_secuencias(int x[]) {
		
		int aux;
		for (int i=0;i<FIL;i++) {
			aux = (int)(Math.random()*15-1);
			if (aux>7) {
				aux = (int)(Math.random()*MAXNUM-1);
			}
			else {
				aux=0;
			}
			x[i]=aux;
		}
	}
	
	public static int inicioSecuencia(int x[]) {
		
		int i=0;
		while (i<FIL) {
			if (x[i]!=0) {
			return i;
			}
			i++;
		}
		
		return -1;
	}

	public static int finSecuencia (int x[], int inicio) {
		
		
		while (inicio<FIL) {
			if (x[inicio]==0) {
				return (inicio-1);
			}
			inicio++;
		}
		return -1;
	}
	
	public static int cantidadSecuencias (int x[]) {
		
		int i=0;
		int contador=0;
		while (i<FIL) {
			if ((i!=0)&&(x[i]!=0)&&(x[i-1]==0)) {
				contador+=1;
			}
			if ((i==0)&&(x[i]!=0)) {
				contador+=1;
			}
			i++;
		}
		
		
		return contador;
	}
	
	public static int cantidadSecuenciasFila (int x[][], int fila) {

		int i=0;
		int contador=0;
		while (i<FIL) {
			if ((i!=0)&&(x[fila][i]!=0)&&(x[fila][i-1]==0)) {
				contador+=1;
			}
			if ((i==0)&&(x[fila][i]!=0)) {
				contador+=1;
			}
			i++;
		}
		
		return contador;
	}
	
	public static void ordenar_cantSecuencias_asc (int x[][]) {
		for (int j=1;j<FIL;j++) {
			for (int i=0; i<FIL-1;i++) {
				if (((i+1)!=FIL)&&(cantidadSecuenciasFila(x, i)>cantidadSecuenciasFila(x, i+1))) {
					for (int a=0; a<COL;a++) {
						int aux= x[i][a];
						x[i][a] = x[i+1][a];
						x[i+1][a]= aux;
					}
				}
			}
		}
		
	}

	public static void insertar_filaSec_ordenada_asc (int x[][], int fila []) {
		
		int cantidad = cantidadSecuencias(fila);
		int pos =-1;
		for (int i=0; i<FIL;i++) {
			if (cantidadSecuenciasFila(x, i)<=cantidad) {
				pos=i;
			}
		}
		corrimiento_abajo(x, pos);
		for (int j=0;j<COL;j++) {
			x[pos][j]=fila[j];
		}
		
	}
	
	
	//                                ACTIVIDAD 6
	/*6. Dada una matriz de m × n enteros ordenada ascendentemente
	entre filas por cantidad de secuencias separadas por ceros,
	insertar una fila cuyo elementos se encuentran en el arreglo
	nuevo de tamaño n manteniendo el orden. */
	
	//                                ACTIVIDAD 5
	/* 5. Dada una matriz de m × n enteros ordenada ascendentemente
	entre filas por la suma de contenido de cada fila, insertar una fila
	cuyos elementos se encuentran en el arreglo nuevo de tamaño n
	manteniendo el orden. */
	
	//                               ACTIVIDAD 4
	/* 4. Dada una matriz de m × n enteros, realizar los métodos necesarios
	para ordenar cada una de sus filas. */
	
	//                               ACTIVIDAD 3
	/* 3. Dada una matriz de m × n enteros, realizar los métodos necesarios
	para eliminar la fila de la posición pos. */
	
	//                                ACTIVIDAD 2
	/* 2. Dada una matriz de m × n enteros, realizar los métodos necesarios
	para insertar una fila en la posición pos. */
	
	//                                ACTIVIDAD 1
	/* En el caso de hacer corrimientos pueden quedar elementos repetidos
	1. Dada una matriz de enteros de 10 x 10, realizar los siguientes
	procedimientos o funciones:
	a) Obtener la suma de una diagonal.
	b) Invierta el contenido entre las posiciones inicio y fin de una fila
	dada. */
	


}
