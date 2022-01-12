import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

//Escribir uno programa completo (declaración de constantes y variable, carga de datos, procesamiento e impresión de resultados) para cada caso o ítem que:
//•solicite un número e indique si es positivo o negativo.
//•solicite un número e imprima “grande” si es mayor a 100 y
//“chico “ si es menor.
//•solicite un número del 1 al 7 e imprima el día de la semana.
//•solicite una letra e imprima si es vocal o consonante.
//•solicite 3 números e imprima “creciente” si los tres números están en orden creciente, “decreciente” si están en orden decreciente o “error” si no cumplen ningún orden.

public class SelectivasYCondicionalesEjercicio1 {
	final static int GRANDE=100;
	final static int PRIMERO=1;
	final static int ULTIMO=7;
	public static void main( String[] args) {
		int numero=0;
		int numero2=0;
		int numero3=0;
		char caracter=' ';
		
		numero=ingresar_entero();
		if(numero<0) {
			System.out.println("Es negativo");
		}
		else {
			System.out.println("Es positivo");
		}
		
		numero=ingresar_entero();
		
		if(numero>GRANDE) {
			System.out.println("Grande");
		}else if(numero<GRANDE) {
			System.out.println("Chico");

		}
		numero=0;
		
		while(!((numero>=PRIMERO)&&(numero<=ULTIMO))) {
		numero=ingresar_entero();
		}
		switch (numero) {
		case 1: System.out.println("Lunes");break;
		case 2: System.out.println("Martes");break;
		case 3: System.out.println("Miercoles");break;
		case 4: System.out.println("Jueves");break;
		case 5: System.out.println("Viernes");break;
		case 6: System.out.println("Sabado");break;
		case 7: System.out.println("Domingo");break;
		}
		
						
		while (!(((caracter>='a')||(caracter>='A'))&&((caracter<='z')||(caracter<='Z')))) {
			caracter=ingresar_char();
			
		}
		
		
		
		switch (caracter) {
		case 'a': case 'e': case 'i': case 'o':  case 'u': case 'A': case 'E': case 'I': case 'O':  case 'U': System.out.println("Vocal"); break;
		default : System.out.println("Consonante");break;
		}
		
		numero=ingresar_entero();
		numero2=ingresar_entero();
		numero3=ingresar_entero();
		
		if((numero2>numero)&&(numero2<numero3)) {
			System.out.println("Creciente");
		}
		else if((numero2>numero3)&&(numero2<numero)) {
			System.out.println("Decreciente");
		}
		else {
			System.out.println("Error");
		}
		
		
	}
	
	public static int ingresar_entero() {
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
	
	public static char ingresar_char() {
		char caracter=' ';
		boolean validador=true;

		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try {
			System.out.println("Ingresar un caracter");
			caracter=(char)(entrada.readLine().charAt(0));
			validador=false;
			}
			catch(Exception exc) {
				System.out.println(exc);
				validador=true;
				caracter=' ';
			}
		}while(validador);
		
		return caracter;
	}
	
}
