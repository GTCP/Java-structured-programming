import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SelectivasoCondicionales {
	
	public static void main( String [] args) {
		char caracter=' ';
		BufferedReader entrada= new BufferedReader (new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar un caracter:");
			caracter=entrada.readLine().charAt(0);
			System.out.println("caracter ingresado:"+caracter);
			if((caracter>='0')&&(caracter<='9')) {
				System.out.println("ES DIGITO");
			}
			else {
				System.out.println("NO ES DIGITO");
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
}
