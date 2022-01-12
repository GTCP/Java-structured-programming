import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras el usuario ingrese un caracter letra minúscula, se quede con la menor y la mayor letra ingresada. Finalmente muestre por pantalla dichas letras.Escribir un programa que mientras el usuario ingrese un caracterletra minúscula, se quede con la menor y la mayor letra ingresada. Finalmente muestre por pantalla dichas letras.
public class Iterativas {
	public static void main(String [] args) {
		char caracter=' ';
		char minCaracter='a';
		char maxCaracter=' ';
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingrese caracter: ");
				caracter=entrada.readLine().charAt(0);
				
				if((caracter>='a')&&(caracter<='z')) {
					
					if(caracter<=minCaracter) {
						minCaracter=caracter;
					}
					if(caracter>maxCaracter) {
						maxCaracter=caracter;
					}
				}
			}
			catch(Exception exc) {
				System.out.println();
				caracter='a';
			}
			
		}while((caracter>='a')&&(caracter<='z'));
		
		
		System.out.println("Min caracter :"+minCaracter);
		System.out.println("Max caracter :"+maxCaracter);
	}
}
