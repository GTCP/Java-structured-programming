import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

//Escribir un programa que mientras que el usuario ingrese un número distinto de 0, pida
//ingresar otros dos números e imprima el resultado de la multiplicación entre los dos últimos
//números ingresados.
public class OtrosIteracionesEjercicio6 {

	public static void main (String []args) {
		int numero=1;
		int numero2=0;
		int numero3=0;
		
		while(numero!=0) {
			numero=pedir_entero();
			
			if(numero!=0) {
				System.out.println("Ingresar 2 enteros");
				numero2=pedir_entero();
				numero3=pedir_entero();
				System.out.println("Multiplicacion entre "+numero2+" y" +numero3+" :"+numero2*numero3);
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
