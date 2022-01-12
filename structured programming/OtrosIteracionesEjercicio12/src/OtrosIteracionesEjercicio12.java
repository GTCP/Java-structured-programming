
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos
//5 valores ingresados.
public class OtrosIteracionesEjercicio12 {
	final static int N=10;
	public static void main(String [] args) {
		int numero=0;
		int suma=0;
		for(int i=0;i<N;i++) {
			numero=pedir_entero();
			if(i>=N/2) {
				System.out.println("asd");
				suma+=numero;
			}
		}
		System.out.println("Suma de los ultimos 5 valores:"+suma);
	}
	
	public static int pedir_entero() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
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
			
		}while(validador);
		
		
		return numero;
	}
}