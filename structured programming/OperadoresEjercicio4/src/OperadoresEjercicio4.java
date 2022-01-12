import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class OperadoresEjercicio4 {
	final static int PRIMER_MULTIPLO=6;
	final static int SEGUNDO_MULTIPLO=7;
	final static int TERCER_MULTIPLO=2;
	final static int DIVISION=5;
	final static int PRIMER_MAYOR_QUE=30;
	final static int SEGUNDO_MAYOR_QUE=10;
//Escribir un programa que ingrese un número entero por teclado e imprima el resultado de determinar:
//	_ si es múltiplo de 6 y de 7,
//	_ si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
//	_ si el cociente de la división de dicho número con 5 es mayor que 10.
	public static void main (String [] args) {
		int numero=0;
		
		
		numero=pedir_numero_entero();
		
		if((numero%PRIMER_MULTIPLO==0)&&(numero%SEGUNDO_MULTIPLO==0)) {
			System.out.println("Es multiplo de 6 y 7");
		}
		
		if(((numero>PRIMER_MAYOR_QUE)&&(numero%TERCER_MULTIPLO==0))||(numero<=PRIMER_MAYOR_QUE)) {
			System.out.println("Numero mayor a 30 y multiplo de 2, o menor igual a 30");
		}
		
		if(numero/DIVISION>SEGUNDO_MAYOR_QUE) {
			System.out.println("Cociente de la division es mayor que 10");
		}
	}
	
	public static int pedir_numero_entero() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("Es","Us"));;
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
