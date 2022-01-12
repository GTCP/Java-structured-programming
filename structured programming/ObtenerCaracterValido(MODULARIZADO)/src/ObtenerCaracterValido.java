import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ObtenerCaracterValido {

	public static void main(String [] args) {
			char caracter;
			
			caracter=obtener_caracter_valido();
		}
	
	public static char obtener_caracter_valido() {
		char caracter=' ';
		boolean salidaDoWhile=false;

		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
			System.out.println("Ingresa un caracter:");
			caracter=entrada.readLine().charAt(0);
			salidaDoWhile=true;
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			}

		}while(!salidaDoWhile);

		return caracter;
	}                                   
}


