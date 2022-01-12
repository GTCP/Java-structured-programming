import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que permita el ingreso de dos números enteros por teclado e imprima:
//_ si el primero es mayor al segundo.
//_ si ambos son múltiplos de 2.
public class OperadoresEjercicio3 {
	
	public static void main (String [] args) {
		int numero=0;
		int numero2=0;
		
		numero=pedir_numero_entero();
		numero2=pedir_numero_entero();
		
		if(numero>numero2) {
			System.out.println("El primero es mayor al segundo");
		}
		if((numero%2==0)&&(numero2%2==0)) {
			System.out.println("Ambos son multiplos de 2");
		}
		
	}
	
	public static int pedir_numero_entero() {
		int numero;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES", "US"));
		do {
			try {
				System.out.println("Ingresar numero entero:");
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
