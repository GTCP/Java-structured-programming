import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ObtenerEnteroValido {
	
	public static void main(String [] args) {
		int entero;
		
		entero=obtener_entero_valido();
		System.out.println(entero);
	}

	public static int obtener_entero_valido() {
		int entero=0;
		boolean salidaDoWhile=false;
	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
		do {
			try {
			System.out.println("Ingresa un numero:");
			entero=Integer.valueOf(entrada.readLine());
			salidaDoWhile=true;
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			}
		}while(!salidaDoWhile);
	
		return entero;
	}

}
