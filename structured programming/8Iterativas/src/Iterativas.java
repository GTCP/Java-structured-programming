import java.io.BufferedReader;
import java.io.InputStreamReader;


//Escribir un programa que mientras el usuario ingrese un caracter letra minúscula, acumule la cantidad de vocales que ingreso. Finalmente muestre por pantalla dicha cantidad.
public class Iterativas {

	public static void main(String [] args) {
		char caracter=' ';
		int cantVocales=0;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {	
			try {
				System.out.println("Ingresar un caracter letra minuscula: ");
				caracter=entrada.readLine().charAt(0);
				if((caracter>='a')&&(caracter<='z')) {
					cantVocales++;
				}
			}
			catch(Exception exc){
				System.out.println(exc);
				caracter='a';
			}
			
		}while((caracter>='a')&&(caracter<='z'));
		
		System.out.println("Cantidad de vocales ingresadas: "+cantVocales);
		
		
	}
}
