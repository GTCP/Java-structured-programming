import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Enterovalido {
	
	public static void main(String[] args) {
		int numero;
		boolean salidaDoWhile=false;

		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
			System.out.println("Ingresa un numero:");
			numero=Integer.valueOf(entrada.readLine());
			salidaDoWhile=true;
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			}

		}while(!salidaDoWhile);

	}
}
