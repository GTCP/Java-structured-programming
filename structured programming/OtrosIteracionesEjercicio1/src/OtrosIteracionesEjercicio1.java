import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que muestre por pantalla una cuenta regresiva de números empezando
//desde un valor entero ingresado por el usuario hasta 0.
public class OtrosIteracionesEjercicio1 {

	public static void main (String[] args) {
		int numero=0;
	
	
		numero=pedir_entero();
	
		for(int i=numero;i>0;i--) {
			System.out.println(i);
		}
	
	}
	
	public static int pedir_entero() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try {
				System.out.println("Ingresar entero");
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