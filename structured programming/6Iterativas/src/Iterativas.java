import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras que el usuario ingrese un número entero entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente, cuando sale del ciclo muestre por pantalla el resultado de la suma.

public class Iterativas {
	
	public static void main(String [] args) {
	int entero=0;
	int sumaTotal=0;
	
	BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
	do {
		try {	
			System.out.println("ingrese un número entero entre 1 y 10 inclusive");
			entero=Integer.valueOf(entrada.readLine());
			
			if((entero>=0)&&(entero<=10)) {
				sumaTotal +=entero;
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
			entero=0;
		}
	
	}while((entero>=0)&&(entero<=10));
	
	System.out.println("La suma de todos los valores ingresados es :"+sumaTotal);
	
	}	
}
