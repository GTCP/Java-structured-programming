import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que permita el ingreso de un número entero por teclado e imprima el cociente de la división de dicho número con 2, 3, y 4.
public class OperadoresEjercicio2 {

	public static void main (String[] args) {
		int numero=0;
		
		numero=pedir_numero_entero();
		
		System.out.println("con 2 : "+numero/2+"/con 3 : "+numero/3+"/con 4 : "+numero/4);
	}
	
	public static int pedir_numero_entero() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		do {
			try {
				System.out.println("Ingresar numero entero:");
				numero=new Integer(entrada.readLine());
				validador=false;
			}
			catch(Exception Exc) {
				System.out.println(Exc);
				validador=true;
				numero=0;
			}
			
		} while(validador);
		
		return numero;
	}
}
