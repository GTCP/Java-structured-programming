
public class RecuperatorioParcial2019 {
	final static int MAX = 12;
	public static void main(String[] args) {
		int[] ar = {2,2,3,2,2,0,5,1,2,2,2,0};
		int[] res = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		generar_secuencia_mas_repetida(ar,res);
		imprimir_ar(res);
		}
		public static void generar_secuencia_mas_repetida(int[] ar, int[] res) {
			int inicio = 0;
			int fin = -1;
			int cant;
			int iniciomejor = 0;
			int finmejor = 0;
			int cantmejor = 0;
			while (inicio < MAX) {
				inicio = obtener_inicio_secuencia(ar,fin+1);
				if (inicio < MAX) { fin = obtener_fin_secuencia(ar,inicio);
					cant = obtener_cantidad_repeticiones(ar,inicio,fin);
					if (cantmejor < cant){
						cantmejor = cant;
						iniciomejor = inicio;
						finmejor = fin;
					}
				}
			}
			if (cantmejor > 0){
				copiar_secuencia(ar,iniciomejor,finmejor,res);
			}
		}
		
		public static int obtener_cantidad_repeticiones(int[] ar, int iniciorep, int finrep) {
			int inicio = 0;
			int fin = finrep;
			int cant = 0;
			while (inicio < MAX) {
				inicio = obtener_inicio_secuencia(ar,fin+1);
				if (inicio < MAX) { 
					fin = obtener_fin_secuencia(ar,inicio);
				if ((ar[inicio]==ar[iniciorep])&&((finrep-iniciorep)==(fin-inicio)))
					cant++;
				}
			}
			return cant;
		}
		public static void copiar_secuencia(int[] ar, int inicio, int fin, int[] res) {
			for (int pos = 0;pos < (fin-inicio)+1;pos++)
				res[pos] = ar[pos+inicio];
		}
		public static int obtener_fin_secuencia(int[] ar, int pos) {
			while ((pos < MAX-1) && (ar[pos] == ar[pos+1]))
				pos++;
			return pos;
		}
		public static int obtener_inicio_secuencia(int[] ar, int pos) {
			while ((pos < MAX-1) && (ar[pos] != ar[pos+1]))
				pos++;
			return pos;
	}
	public static void imprimir_ar(int res[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(res[i]);
			System.out.print("]");
			
		}
	}
}
