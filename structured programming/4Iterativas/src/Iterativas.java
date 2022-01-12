import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras que el usuario ingrese un número entero distinto de 0, pida ingresar otro número entero y lo imprima.

public class Iterativas {
	public static void main(String [] args) {
		int primerEntero=0;
		int segundoEntero=0;
		boolean validador=false;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
				System.out.println("Ingrese el primer entero:");
				primerEntero=Integer.valueOf(entrada.readLine());
				
				if(primerEntero!=0) {
					
					while(!validador) {
					try {
						System.out.println("Ingrese el segundo entero  para luego imprimirlo:");
						segundoEntero=Integer.valueOf(entrada.readLine());
						System.out.println("El numero ingresado es :"+segundoEntero);
						
						if((segundoEntero>=0)||(segundoEntero<=0)) {
							validador=true;
						}
					}
					catch(Exception exc) {
						System.out.println("Mal, ingreso un caracter en lugar de un entero 2");
					}
					}
					validador=false;
				}
			}
			catch(Exception exc) {
				System.out.println("Mal, ingreso un caracter en lugar de un entero");
				primerEntero=1;
			}
		}while(primerEntero!=0);
	}
}