import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras que el usuario ingrese un caracterletra minúscula, pida ingresar un numero entero. 
//Si el número ingresado está entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho numero.


public class DiseñoDescendente {
	
	public static void main(String [] args) {
		final int MIN=1;
		final int MAX=5;
		char caracter=' ';
		int entero=0;
		
		do {
			caracter=obtener_caracter();
			if((caracter>='a')&&(caracter<='z')) {
				entero=obtener_entero();
				if((entero>=MIN)&&(entero<=MAX)) {
					imprimir_entero(entero);
				}
			}
		}while(!((caracter>='a')&&(caracter<='z')));
	}
	
	public static int obtener_entero() {
		int numero=0;
		boolean salidaDoWhile=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
			System.out.println("Ingresar entero:");
			numero=Integer.valueOf(entrada.readLine());
			salidaDoWhile=true;
			}
		catch(Exception exc) {
			System.out.println("Error");
			salidaDoWhile=false;
		}
		}while(!salidaDoWhile);
		
		return numero;
	}
	
	public static char obtener_caracter() {
		char caracter=' ';
		boolean salidaDoWhile=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar caracter minuscula");
				caracter=entrada.readLine().charAt(0);
				salidaDoWhile=true;
			}
			catch(Exception exc) {
				System.out.println("Error");
				salidaDoWhile=false;
			}
		}while(!salidaDoWhile);
		
		return caracter;
	}
	public static void imprimir_entero(int numero) {
		System.out.println(numero);
	}
}
