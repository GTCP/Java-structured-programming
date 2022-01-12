import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras el usuario ingresa un caracter distinto
//del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
//vocal minúscula.

public class Iterativas {
	public static void main(String [] args) {
		char caracter=' ';
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			do {
				System.out.println("ingresar caracter diferente de *");
				caracter=entrada.readLine().charAt(0);
				
			}while(caracter=='*');	
		}
		catch(Exception exc) {
			System.out.println("Tenia que ingresar un caracter");
		}
		
		if((caracter>='0')&&(caracter<='9')) {
			System.out.println("Caracter digito");
		}
		else {
			switch(caracter) {
			case 'a': case 'e' : case 'i': case 'o': case 'u': System.out.println("Caracter vocal minuscula");break;
			default : System.out.println("Es una letra consonante o caracter simbolo") ;break;
			}
		}
	}
}
