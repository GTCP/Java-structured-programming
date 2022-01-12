import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras que el usuario ingrese un caracter letra minúscula, pida ingresar un numero entero. Si el número ingresado está entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho numero.

public class Iterativas {

	public static void main( String[] args) {
		final int MIN=1;
		final int MAX=5;
		char caracter=' ';
		int  entero=-0;
		
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar un caracter letra:");
				caracter=entrada.readLine().charAt(0);
				
				
				if((caracter>='a')&&(caracter<='z')) {
					
					do {
						try {
							System.out.println("Ingresar un entero");
							entero=Integer.valueOf(entrada.readLine());
							
							if((entero>=1)&&(entero<=5)) {
								
								System.out.println("Tabla de multiplicar del :"+entero);
								
								for(int i=0;i<=10;i++) {
								System.out.println(entero+" *"+i+" = "+entero*i);
								}
								entero=0;
								
							}
						}
						catch(Exception exc) {
							System.out.println("No ingresaste un entero.");
							entero=1;
						}
						
					}while((entero>=MIN)&&(entero<=MAX));					
				
				}
								
			}
			catch(Exception exc) {
				System.out.println(exc);
				caracter='a';
			}
			
		}while((caracter>='a')&&(caracter<='z'));
			
	}
}
