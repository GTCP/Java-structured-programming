import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

//Escribir un programa que mientras el usuario ingrese un número distinto de 0, pida ingresar
//el nombre del usuario y lo imprima (Esto se debe repetir mientras el usuario no ingrese un
//0).
public class OtrosIteracionesEjercicio4 {
	
	
	public static void main (String[] args) {
		int numero=1;
		String nombre="";
		
		while(numero!=0) {
			
			numero=pedir_entero();
			
			if(numero!=0) {
				System.out.println("Ingresar nombre:");
				nombre=pedir_string();
				System.out.println(nombre);
			}
		}
		
	}
	
	public static String pedir_string() {
		String nombre="";
		Boolean validador=true;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		do {
			try {
				System.out.println("Ingresar String:");
				nombre=new String(entrada.readLine());
				validador=false;
			}
			catch(Exception exc) {
				System.out.println(exc);
				validador=true;
				nombre="";
			}
			
		}while(validador);
		
		return nombre;
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
