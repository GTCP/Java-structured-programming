import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Construir un programa que solicite desde teclado un número de mes válido y posteriormente notifique por pantalla la cantidad de días de ese mes. En el caso de que ingrese 2 como número de mes (febrero) deberá además solicitar ingresar un número de anioentre 2000 y 2019 inclusive, y dependiendo de si es bisiesto o no imprimir la cantidad de días correspondiente.
public class IterativasORepetitivasEjercicio3 {
	final static int PRIMER_ANIO=2000;
	final static int SEGUNDO_ANIO=2019;
	public static void main ( String[] args) {
		int numero=-1;
		int numero2=0;
		boolean validador=true;
		
		while( (numero<0)||(numero>12) ) {
		numero=pedir_entero();
		}
		if(numero==2) {
			do {
				System.out.println("Ingresar un numero entre "+PRIMER_ANIO+"y"+SEGUNDO_ANIO+" inclusive");
				numero2=pedir_entero();
				if((numero2>PRIMER_ANIO)&&(numero2<=SEGUNDO_ANIO)){
					validador=false;
				}
			}while(validador);
			
			if(es_biciesto(numero2)) {
				System.out.println("29 dias");
			}
			else {
				System.out.println("28 dias");
			}
		}
		else {
			System.out.println("31 dias");
		}
		
	}
	
	public static boolean es_biciesto(int anio) {
		if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
		return true;
		}
		else {
			return false;
		}
	}
	
	public static int pedir_entero() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try {
			System.out.println("Ingresar entero");
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
