package arreglos_practico17;

public class arreglos_practico17 {
	final static int MAXCOL=20;
	final static int AUX=4;
	public static void main( String [] args) {
		int arreglo[]= {0,1,2,0,3,4,5,0,1,2,3,4,0,5,6,7,8,9,0,0};
		int arreglo_aux[]=  {5,6,7,8};
		
		int numero_sec_aux=contar_sec_aux(arreglo_aux);
		int inicio_sec=buscar_ini_sec(arreglo,numero_sec_aux);
		imprimir_arreglo(arreglo);
		System.out.print("");

		corrimiento_izquierda(arreglo,inicio_sec,numero_sec_aux);
		System.out.print("");

		corrimiento_derecha(arreglo,inicio_sec,numero_sec_aux);
		imprimir_arreglo(arreglo);
		System.out.print("");
		insertar_secuencia(arreglo,arreglo_aux,inicio_sec,numero_sec_aux);
		imprimir_arreglo(arreglo);

		
	}
		public static int contar_sec_aux(int arreglo_aux[]) {
			int  contador=0;
			for(int i=0;i<AUX;i++) {
				contador++;
			}
			return contador;
		}
		public static int buscar_ini_sec(int arreglo[],int numero_sec_aux) {
			int inicioSec=0;
			int contador=0;
			int contFinal=0;

			//for(int i=0;i<MAXCOL;i++) {
			//	inicioSec=ifini(arreglo,cont,numero_sec_aux,i);
			int i=0;
			while (contFinal!=numero_sec_aux) {
			if(arreglo[i]==0) {
				contFinal=contador;
				contador=0;
			}
			if(arreglo[i]!=0) {
				contador++;
				contFinal=contador;
			}
			i++;
			}
			inicioSec=i-numero_sec_aux;
			return inicioSec;
		}
		public static int ifini (int arreglo[],int cont,int numero_sec_aux,int i) {
			int contador=cont;
			int contFinal=0;
			int numero=0;
			if(arreglo[i]!=0){
				contador++;
				System.out.println(contador);
			}
			if(arreglo[i]==0) {
				contFinal=contador;
				contador=0;
			}
			if(contFinal==numero_sec_aux) {
				numero=arreglo[i]-contFinal;
				contFinal=0;
			}
			return numero;
		}
		public static void corrimiento_izquierda(int arreglo[],int inicio_sec,int numero_sec_aux) {
			System.out.println("inicio_sec"+inicio_sec);
			for(int i=inicio_sec;i<MAXCOL-1;i++) {
				arreglo[i]=arreglo[i+1];
			}
		}
		public static void insertar_secuencia(int arreglo[],int arreglo_aux[],int inicio_sec,int numero_sec_aux) {
			int  contador=0;
			for (int i=inicio_sec;i<inicio_sec+numero_sec_aux;i++) {
				arreglo[i]=arreglo_aux[contador];
				contador++;
			}
		}
		public static void corrimiento_derecha(int arreglo[],int inicio_sec,int numero_sec_aux) {
			for(int i=MAXCOL-1;i>MAXCOL-1-inicio_sec-numero_sec_aux;i--) {
				arreglo[i]=arreglo[i-1];
			}
		}
		public static void imprimir_arreglo(int arreglo[]) {
			System.out.print("");

			for(int i=0;i<MAXCOL;i++) {
				System.out.print("["+arreglo[i]+"]");
				System.out.print(" ");

			
			}	
			System.out.print(" ");

		}

}