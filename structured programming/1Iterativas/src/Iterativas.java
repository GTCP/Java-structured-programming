import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras el usuario ingrese un número entero
//menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
//2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados deberían
//ser constantes?. De a poco habría que definirlos como constantes).

public class Iterativas {
	public static void main(String [] args) {
		final int MAX=10;
		final int MIN=1;
		final int PRIMERMULTIPLO=2;
		final int SEGUNDOMULTIPLO=3;
		int entero=0;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			do {
			System.out.println("Ingresar un numero entero menor a "+MAX+" y mayor a "+MIN);
			entero=Integer.valueOf(entrada.readLine());
			
			}while(!((entero>MIN)&&(entero<MAX)));
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
		if((entero%PRIMERMULTIPLO==0)&&(entero%SEGUNDOMULTIPLO==0)) {
			System.out.println("El valor ingresado "+entero+" es multiplo de "+PRIMERMULTIPLO+" y "+SEGUNDOMULTIPLO);
		}
	}
}
