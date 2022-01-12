import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un diseño de programa que mientras que el usuario
//ingrese un caracter dígito o caracter letra minúscula,
//imprima dicho caracter, y si es caracter letra minúscula,
//imprima si es vocal o consonante.

public class DiseñoDescendente {
	
	public static void main(String [] args) {
			char caracter=' ';
			
			caracter=obtener_caracter();
			imprimir_caracter(caracter);
			definir_caracter(caracter);
			
	}
	
	public static char obtener_caracter() {

		char caracter=' ';
		boolean salidaDoWhile=false;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar Caracter");
				caracter=entrada.readLine().charAt(0);
				
				salidaDoWhile=true;
				
				
			}catch(Exception exc) {
				System.out.println("Error al ingresar");
				caracter=' ';
				salidaDoWhile=false;
			}
		}while(!salidaDoWhile);
		
		return caracter;
	}

	public static void imprimir_caracter(char caracter) {
		System.out.println(caracter);
	}
	
	public static void definir_caracter(char caracter) {
		
		if((caracter>='0')&&(caracter<='9')) {
			System.out.println("Digito");
		}
		else if((caracter>='a')&&(caracter<='z')) {
			
			switch(caracter) {
				case 'a': case 'e' : case 'i' : case 'o' : case 'u': System.out.println("Vocal");break;
				default : System.out.println("Consonante");break;
			}
		}else {
			System.out.println("Caracter especial: "+caracter);
		}
	}
}
