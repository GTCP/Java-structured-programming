import java.io.BufferedReader;
import java.io.InputStreamReader;
//Escribir un diseño de programa que mientras que el usuario
//ingrese un número distinto de 0, pida ingresar otro numero y
//lo imprima.

public class DiseñoDescendente {
	public static void main (String [] args){
		double primerNumero=1;
		double segundoNumero=0;

		while(primerNumero!=0) {
			primerNumero=obtener_numero_double();
		
			if(primerNumero!=0) {
				System.out.println("Por segunda vez");
				segundoNumero=obtener_numero_double();
				imprimir_numero_double(segundoNumero);
			}
			
		}
	}
	
	public static double obtener_numero_double() {
		double numero=0;
		boolean salidaDoWhile=false;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

		do {	
			try {
				System.out.println("Ingresa un numero:");
				numero=Double.valueOf(entrada.readLine());
				
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
	
	public static void imprimir_numero_double(double numero) {
		System.out.println(numero);
	}
}
