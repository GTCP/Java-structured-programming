// Escribir un programa que permita el ingreso de un número entero
//	por teclado e imprima el cociente de la división de dicho número
//	con 2, 3, y 4.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operadores1 {
	
	public static void main(String [] args) {
		
		int primerDivision=2;
		int segundaDivision=3;
		int terceraDivision=4;
		String hola;
		char a;
		final int MULTIPLO=2;	
		final int primerdividor=2;
		final int segundodividor=3;
		int entero=2;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try{
		//	hola=String.valueOf(entrada.readLine());
		//	a=entrada.readLine().charAt(0);
			
		//	System.out.println(entero+"/"+primerdividor+":"+(double)(entero/primerDivision));
		//	System.out.println(entero);
		//	System.out.println(entero+"/"+segundodividor+":"+(double)(entero/segundodividor));

		}
		catch (Exception exc) {
			System.out.println(exc);
		}
		
		int entero1=2;
		int entero2=3;
		
		
		System.out.println("El primer numero("+entero1+") es mas grande que el segundo numero("+ entero2 +") = "+ (entero1>entero2));
		System.out.println("Ambos son multiplos de "+MULTIPLO+" = "+((entero1%2==0)&&(entero2%2==0)));
		System.out.println("---------------------------------------------------------------------------------");

		
		
		System.out.println("Ambos son multiplos de "+MULTIPLO+" = "+((entero1/5)>=10));

		
		boolean tru=true;
		boolean fals=false;
		
		System.out.println("Tabla AND");
		System.out.println((fals)&&(fals));
		System.out.println((fals)&&(tru));

		System.out.println((tru)&&(fals));
		System.out.println((tru)&&(tru));
		
		System.out.println("");
		
		System.out.println("Tabla OR");
		System.out.println((fals)||(fals));
		System.out.println((fals)||(tru));

		System.out.println((tru)||(fals));
		System.out.println((tru)||(tru));
		
		
		String p="algebra2.0";
		System.out.println(p);
	}
}
