import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnteroValido {
	
	public static void main(String[] args) {
		int numero=0;
	
		numero=obtener_entero_valido();
		System.out.println(numero);
	}
	
	public static int obtener_entero_valido() {
		import java.io.BufferedReader;
		import java.io.InputStreamReader;
		//Escribir un diseño de programa que mientras que el usuario
		//ingrese un número distinto de 0, pida ingresar otro numero y
		//lo imprima.

		public class DiseñoDescendente {
		

		public static double obtener_entero_valido() {
			
		int numero=0;
		boolean salidaDoWhile=false;

		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
			System.out.println("Ingresa un numero:");
			numero=Integer.valueOf(entrada.readLine());
	
			if((numero>=0)||(numero<0)) {
			salidaDoWhile=true;
			}
	
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			salidaDoWhile=false;
			numero=0;
			}

		}while(!salidaDoWhile);

		return numero;
		}

}
