import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

//Escribir un programa que dado un número N imprima la tabla de multiplicar de ese número.
public class OtrosIteracionesEjercicio2 {
	final static int MAX=10;
	public static void main (String[] args) {
		int numero=0;
		
		numero=pedir_entero();
		
		System.out.println("Tabla del numero:"+numero);
		for(int i=1;i<=MAX;i++) {
			System.out.println(numero*i);
		}
	}
	
	
	public static int pedir_entero() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		while(validador) {
			try {
				System.out.println("Ingresar entero:");
				numero=new Integer(entrada.readLine());
				validador=false;
			}
			catch(Exception exc) {
				System.out.println(exc);
				validador=true;
				numero=0;
			}
		}
		
		return numero;
	}
}
