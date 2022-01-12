import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que solicite el ingreso de números entre 0 y 999, y muestre un mensaje
//de cuántos dígitos tiene el mismo. Además, si tiene 3 dígitos debe informar qué número es.
//Finalice el programa cuando se ingrese el valor 0.
public class OtrosIteracionesEjercicio3 {
	
	public static void main(String [] args) {
		int numero=1;
		
		while((numero>0)&&(numero<999)) {
		numero=pedir_entero();
		
			if(numero!=0) {
				if(numero<10) {
					System.out.println("Tiene 1 Digito");
				}
				else if((numero>=10)&&(numero<100)) {
					System.out.println("Tiene 2 Digitos");
				}
				else {
					System.out.println("Tiene 3 Digitos: el numero: "+numero);
				}
			}
			else {
				System.out.println("Ingreso 0, fin del programa");
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
