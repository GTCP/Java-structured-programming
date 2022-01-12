import java.io.BufferedReader;
import java.io.InputStreamReader;
//Escribir un programa que mientras el usuario ingresa un caracter distinto
//del caracter �*�, invoque a un m�todo que imprima si es caracter d�gito o
//caracter letra min�scula, y si es letra min�scula imprimir si es vocal o
//consonante.
public class Dise�oDescendente {
	
	public static void main(String[] args) {
		char caracter=' ';
		
		
		do {
				caracter=obtener_caracter();
				
				if(caracter != '*') {
					definir_caracter(caracter);
					}
			
		}while(caracter!='*');
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

}
