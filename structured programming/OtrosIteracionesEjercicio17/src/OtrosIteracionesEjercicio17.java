
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//17. Escribir un programa que solicite números enteros. Por cada número ingresado además
//se debe ingresar una opción entre 1 y 5. Si la opción es 1, mostrar el número elevado al
//cuadrado; si es 2, la mitad del numero; si es 3, mostrar si es múltiplo de 3; si es 4, mostrar
//la raiz cuadrada; si es 5, mostrar el mensaje "Hasta la próxima" y salir del programa.
public class OtrosIteracionesEjercicio17 {
	public static void main(String [] args) {
		int numero=0;
		int numeroswitch=0;
		boolean validador=true;
		
		while(validador) {
		System.out.println("ingresar numero");
		numero=pedir_entero();
		numeroswitch=0;
		
		System.out.println("ingresar numero entre 1 y 5");
		while(!((numeroswitch>0)&&(numeroswitch<=5))) {
			numeroswitch=pedir_entero();

		}
		switch(numeroswitch) {
		case 1: System.out.println(numero*numero);break;
		case 2: System.out.println(numero/2);break;
		case 3: if(numero%3==0) {
			System.out.println("Es multiplo de 3");
		}
		else {
			System.out.println("No es multiplo de 3");
		}
		;break;
		case 4:	System.out.println("La raiz cuadradra del numero es:"+Math.sqrt(numero)) ;break;
		case 5: validador=false; System.out.println("Hasta la proxima.");break;
		
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
