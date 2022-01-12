package arreglos_practico1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class arreglos_practico1 {
	final static int MAX = 10;
	public static void main(String args[]) {   
		int arrdatos[]=new int[MAX];   
		cargar_arreglo(arrdatos); 
		imprimir_arreglo(arrdatos);
		} 
	public static void cargar_arreglo(int arrdatos[]) {
		for (int i=0; i<MAX;i++) {
			arrdatos[i]=ingresar_entero(i);
		}
	}
	public static int ingresar_entero(int i) {
		int numero=0;
		int contador=i;
		boolean validador=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("Es","Us"));	
		while (!validador) {
			try {
				System.out.println("Ingrese un numero entero="+contador+"/"+(MAX-1));
				numero=new Integer(entrada.readLine());
				if ((numero<0)||(numero>=0)) {
					validador=true;
				}
			}
			catch (Exception exc) {
				System.out.println(exc);
				validador=false;
			}
		}
		return numero;
	}
	public static void imprimir_arreglo(int arrdatos[]) {
		for (int i=0;i<MAX;i++) {
			System.out.print(arrdatos[i]);
		}
	}
}