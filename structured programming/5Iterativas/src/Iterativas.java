import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras que el usuario ingrese un caracterdígito o caracterletra minúscula, imprima si es caracterdígito o caracterletra minúscula, y si es letra minúscula imprimir si es vocal o consonante.

public class Iterativas {
	public static void main(String [] args) {
		char caracter=' ';
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingrese un caracter dígito o caracter letra minúscula");
				caracter=entrada.readLine().charAt(0);
				
				if((caracter>='0')&&(caracter<='9')){
					System.out.println("Digito");
				}
				else if(((caracter>='a')&&(caracter<='z'))) {
					switch(caracter) {
						case 'a': case 'e' : case 'i' : case 'o' : case 'u': System.out.println("Letra Vocal");break;
						default : System.out.println("Letra Consonante");
					}
				}
			}
			catch(Exception exc) {
				System.out.println("Ingresar un caracter valido");
				caracter='0';
			}
			
		}while(((caracter>='0')&&(caracter<='9'))||((caracter>='a')&&(caracter<='z')));
	}
}
