import java.io.BufferedReader;
import java.io.InputStreamReader;
//Realizar un programa que dado dos n�meros enteros y un car�cter, todos ingresados por el usuario, muestre por pantalla el resultado de la operaci�n
//matem�tica b�sica considerando el valor del car�cter. Si ingreso el caracter:
//��a� la suma, �b� la resta, �c� la multiplicaci�n y �d� la divisi�n entre ambos n�meros.
public class Dise�oDescendente {
	
	public static void main(String [] args) {
		int primerEntero=0;
		int segundoEntero=0;
		char caracter=' ';
		
		primerEntero=obtener_entero_por_teclado();
		primerEntero=obtener_entero_por_teclado();
		
		do {
		caracter=obtener_caracter_por_teclado();
		}while(!((caracter=='a')||(caracter=='b')||(caracter=='c')||(caracter=='d')));
		
		impresion_resultados(primerEntero,segundoEntero,caracter);
	}
	
	public static int obtener_entero_por_teclado() {
		int entero=0;
		boolean salidaDoWhile=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("ingresar entero");
				entero=Integer.valueOf(entrada.readLine());
				salidaDoWhile=true;	
			}
			catch(Exception exc) {
				System.out.println("Error");
				salidaDoWhile=false;
			}
		}while(!salidaDoWhile);
		
		return entero;
	}
	public static char obtener_caracter_por_teclado() {
		char caracter=' ';
		boolean salidaDoWhile=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar caracter:");
				caracter=entrada.readLine().charAt(0);
				salidaDoWhile=true;
			}
			catch(Exception exc) {
				System.out.println("Error");
				salidaDoWhile=false;
			}
			
		}while(!salidaDoWhile);
		
		return caracter;
	}

	public static void impresion_resultados(int primerEntero,int segundoEntero,char caracter){
		
		switch(caracter) {
		case 'a':System.out.println("Suma entre los 2 enteros da: "+(primerEntero+segundoEntero));break;
		case 'b':System.out.println("Resta entre los 2 enteros da :"+(primerEntero-segundoEntero));break;
		case 'c':System.out.println("Multiplicacion entre los 2 enteros da :"+(primerEntero*segundoEntero));break;
		case 'd':System.out.println("Division entre los 2 enteros da: "+(primerEntero/segundoEntero));break;
		}
	}
}
