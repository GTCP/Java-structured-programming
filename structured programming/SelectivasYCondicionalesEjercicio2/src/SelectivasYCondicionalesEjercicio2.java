import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class SelectivasYCondicionalesEjercicio2 {
//Construir un programa que solicite desde teclado un número de mes y posteriormente notifique por pantalla la cantidad de días de ese mes. En el caso de que ingrese 2 como número de mes (febrero) deberá además solicitar ingresar un número de anio (no usar ñ), y dependiendo de si es bisiesto o no con la siguiente sentencia
//	Si ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) es verdadero es bisiesto
//	imprimir la cantidad de días correspondiente.
	
	
	public static void main (String [] args) {
		int numero=-1;
		boolean validador= true;
		
		
		while(validador) {
			numero=pedir_entero();
			
			if( (numero>0) && (numero<=12) ) {
			validador=false;
			}
		}
		
		System.out.println("Switch");
		switch(numero) {
		case 1: case 3: case 4: case 5: case 6 : case 7: case 8: case 9: case 10: case 11: case 12: System.out.println("31 dias");break;
		
		case 2: System.out.println("Ingresar año"); numero=pedir_entero();
		if(es_biciesto(numero)) {System.out.println("29 dias");
		}
		else {
			System.out.println("28 dias");
		}
		;break;
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
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try {
				System.out.println("Ingresar un entero");
				numero=new Integer(entrada.readLine());
				validador=false;
			}
			catch(Exception exc){
				System.out.println(exc);
				validador=true;
				numero=0;
			}
			
		}while(validador);
		
		return numero;
	}
}
