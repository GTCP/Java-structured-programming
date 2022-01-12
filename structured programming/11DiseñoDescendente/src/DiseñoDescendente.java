import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras el usuario ingrese un número entero entre 1 y 10 realice:
//–Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para el caracteringresado imprima a que tipo de carácter esta asociado:
//•“letra minúscula” si el caracteres una letra del abecedario en minúscula;
//•“letra mayúscula” si el caracteres una letra del abecedario en mayúscula;
//•“dígito” si el caractercorresponde a un carácter número;
//•“otro” para los restantes casos de caracteres.
//–Si el numero ingresado es múltiplo de 5 imprima la tabla de multiplicar del numero ingresado.
public class DiseñoDescendente {
	final static int MAX=10;
	final static int MIN=1;

	public static void main(String [] args) {
		final int PRIMERMULTIPLO=1;
		final int SEGUNDOMULTIPLO=5;
		int entero=0;
		char caracter=' ';
		
		do {
			entero=obtener_entero_por_teclado();
			
			if((entero>MIN)&&(entero<MAX)) {

				if(entero%PRIMERMULTIPLO==0) {
					definir_caracter(caracter=obtener_caracter());
				}
				
				if(entero%SEGUNDOMULTIPLO==0) {
					imprimir_tabla(entero);
				}
			}
		}while((entero>1)&&(entero<10));
		
	}
	public static void imprimir_tabla(int entero) {
			
		for(int i=MIN;i<=MAX;i++) {
			System.out.println(entero*i);
		}
	}
	public static int obtener_entero_por_teclado() {
		int entero=0;
		boolean salidaDoWhile=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("ingresar entero");
				entero=Integer.valueOf(entrada.readLine());
				salidaDoWhile=true;	
			}
			catch(Exception exc) {
				System.out.println("Error");
				salidaDoWhile=false;
			}
		}while(!salidaDoWhile);
		
		return entero;
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
			System.out.println("Otro : "+caracter);
		}
	}
}
