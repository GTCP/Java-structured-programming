import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Iterativas {
//Escribir un programa que mientras que el usuario ingrese un número entero entre 1 y 10 inclusive, lleve la suma de los números ingresados y la cantidad de sumas que realizó. Finalmente, cuando sale del ciclo muestre por pantalla el resultado del promedio de todo lo ingresado.	
	public static void main(String [] args) {
		int entero=0;
		int sumaTotal=0;
		int cantidadSumas=0;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("ingrese un número entero entre 1 y 10 inclusive");
				entero=Integer.valueOf(entrada.readLine());
				
				if((entero>=1)&&(entero<=10)) {
					sumaTotal+=entero;
					cantidadSumas++;
				}
			}
			catch(Exception exc) {
				System.out.println(exc);
				entero=0;
			}
			
		}while((entero>=1)&&(entero<=10));
		System.out.println("Suma total: "+sumaTotal);
		System.out.println("Cantidad de sumas realizadas: "+cantidadSumas);
		System.out.println("El promedio de la cantidad de veces que se sumo y la suma total es:"+sumaTotal/cantidadSumas);
		
	}
}
