import java.io.BufferedReader;
import java.io.InputStreamReader;

//Escribir un programa que mientras el usuario cargue desde
//teclado un caracter letra minúscula, llame a un método
//que imprime por pantalla la tabla de multiplicar de 9.

public class DiseñoDescendente {
	
	public static void main(String [] args) {
		char caracter=' '; 
		
		do {
			caracter=obtener_caracter();
			if(es_letra_minuscula(caracter)) {
				imprimir_tabla_del_9();
			}
		}while(es_letra_minuscula(caracter));
		
	}
	
	public static char obtener_caracter() {
		char caracter=' ';
		boolean salidaDoWhile=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar caracter");
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
	
	public static boolean es_letra_minuscula(char caracter) {

		if((caracter>='a')&&(caracter<='z')) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public static void imprimir_tabla_del_9() {
		final int TABLA=9;
		final int MIN=1;
		final int MAX=10;
		
		System.out.println("Tabla del: "+TABLA);
		for(int i=MIN;i<=10;i++) {
			System.out.println(TABLA*i);
		}
	}
}
