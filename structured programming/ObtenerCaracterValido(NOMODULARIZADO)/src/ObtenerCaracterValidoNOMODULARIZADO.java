import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ObtenerCaracterValidoNOMODULARIZADO {

	public static void main(String [] args) {
			char caracter;
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
				salidaDoWhile=false;
				
				}

			}while(!salidaDoWhile);

		}
}

