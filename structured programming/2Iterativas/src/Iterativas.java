import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que solicite al usuario el ingreso de un número entero
//positivo, y muestre por pantalla los valores entre el numero ingresado y 0
//de manera decreciente.


public class Iterativas {
	public static void main(String [] args) {
		int entero=0;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			do {
			System.out.println("Ingresar entero positivo");
			entero=Integer.valueOf(entrada.readLine());
			}while(!(entero>=0));
		}
		catch(Exception exc) {
			System.out.println("Ingreso mal, debe ser un entero");
		}
		
		for(int i=entero-1;i>0;i--) {
			System.out.println(i);
		}
	}
}

public class Iterativas {
	public static void main(String [] args) {
		int entero=0;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			do {
			System.out.println("Ingresar entero positivo");
			entero=Integer.valueOf(entrada.readLine());
			}while(!(entero>=0));
		}
		catch(Exception exc) {
			System.out.println("Ingreso mal, debe ser un entero");
		}
		
		int i=entero-1;
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}
}
