
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que solicite números al usuario hasta que se ingrese un -1. Para cada
//número ingresado se debe informar si es par o impar. Si es impar y mayor que 7, se debe
//indicar si es múltiplo de 7.
public class OtrosIteracionesEjercicio16 {
	final static int MAYOR=7;
	public static void main(String [] args) {
		int numero=0;
		
		while(numero!=-1) {
		numero=pedir_entero();
		
		if(numero!=-1) {
			
		if(numero%2==0) {
			System.out.println("Es par");
			
			if(numero>MAYOR) {
				
				if(numero%7==0) {
					System.out.println("Es multiplo de 7");
				}
			}
		}
		else {
			System.out.println("Es impar");
		}
		}
		
		}
		
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