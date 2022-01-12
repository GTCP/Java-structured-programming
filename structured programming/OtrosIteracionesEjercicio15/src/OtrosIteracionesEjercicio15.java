
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
// La cantidad de valores ingresados negativos.
// La cantidad de múltiplos de 15.
// El valor acumulado de los números ingresados que son pares.
public class OtrosIteracionesEjercicio15 {
	final static int N=10;
	public static void main(String [] args) {
		int numero=0;
		int contadorNegativos=0;
		int multiplosDe15=0;
		int valorAcumuladoPares=0;
		
		for(int i=0;i<N;i++) {
		numero=pedir_entero();
		
		if(numero<0) {
			contadorNegativos++;
		}
		if(numero%15==0) {
			multiplosDe15++;
		}
		if(numero%2==0) {
			valorAcumuladoPares+=numero;
		}
		
		}
		
		System.out.println("Numeros negativos:"+contadorNegativos);
		System.out.println("Multiplos de 15:"+multiplosDe15);
		System.out.println("Valor acumulado de los pares:"+valorAcumuladoPares);

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
