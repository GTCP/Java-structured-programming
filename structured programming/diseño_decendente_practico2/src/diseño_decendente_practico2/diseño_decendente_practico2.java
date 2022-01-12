package diseño_decendente_practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class diseño_decendente_practico2 {
	public static void main ( String [] args) {
		int numerodado=0;
		numerodado=numeroentero();
		tirardado(numerodado);
	}
	public static int numeroentero() {
		int numero=0;
		final int MAX=7;
		boolean validador=true;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		while(validador) {
			try {
				System.out.println("Ingrese un numero del 1 al 6");
				numero=new Integer(entrada.readLine());
				if ((numero>0)&&(numero<MAX)){
					validador=false;
				}
			} 
			catch (Exception exc)  {
				System.out.println(exc);
				validador=true;
			}
		}
		return numero;
	}
	public static void tirardado(int entero) {
		int numeroingresado=entero;
		final int MAX=1000;
		int contador=0;
		for (int i=1;i<=MAX;i++) {
			int dado =(int)(6*Math.random() + 1);
			if (dado==numeroingresado) {
				contador++;
			}
		}
		System.out.println("La cantidad de veces que salio igual al numero ingresado el dado fue:"+contador);
	}
}
