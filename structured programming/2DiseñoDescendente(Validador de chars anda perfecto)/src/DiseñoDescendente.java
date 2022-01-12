import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un dise�o de programa que mientras que el usuario
//ingrese un caracter d�gito o caracter letra min�scula,
//imprima dicho caracter, y si es caracter letra min�scula,
//imprima si es vocal o consonante.

public class Dise�oDescendente {
	
	public static void main(String [] args) {
			char caracter=' ';
			
			caracter=obtener_caracter();
			imprimir_caracter(caracter);
			definir_caracter(caracter);
			
	}
	
	public static char obtener_caracter() {

		char caracter=' ';
		boolean salidaDoWhile=false;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar Caracter");
				caracter=entrada.readLine().charAt(0);
				
				salidaDoWhile=true;
				
				
			}catch(Exception exc) {
				System.out.println("Error al ingresar");
				caracter=' ';
				salidaDoWhile=false;
			}
		}while(!salidaDoWhile);
		
		return caracter;
	}

	public static void imprimir_caracter(char caracter) {
		System.out.println(caracter);
	}
	
	public static void definir_caracter(char caracter) {
		
		if((caracter>='0')&&(caracter<='9')) {
			System.out.println("Digito");
		}
		else if((caracter>='A')&&(caracter<='Z')) {
			
			switch(caracter) {
				case 'A': case 'E' : case 'I' : case 'O' : case 'U': System.out.println("Vocal Mayuscula");break;
				default : System.out.println("Consonante Mayuscula");break;
			}
		}
		else if((caracter>='a')&&(caracter<='z')) {
			
			switch(caracter) {
				case 'a': case 'e' : case 'i' : case 'o' : case 'u': System.out.println("Vocal Minuscula");break;
				default : System.out.println("Consonante Minuscula");break;
			}
		}else {
			System.out.println("Caracter especial: "+caracter);
		}
	}
}
