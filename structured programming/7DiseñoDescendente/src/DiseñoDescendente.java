import java.io.BufferedReader;
import java.io.InputStreamReader;
//Escribir un programa que mientras el usuario ingresa un numero de mes (entero) entre 1 y 12 inclusive, 
//muestre por pantalla la cantidad de días del mes ingresado (suponer febrero de 28 días) 
//(¿mostrar por pantalla la cantidad de días del mes debería realizarse con un método? Debería).
public class DiseñoDescendente {
	
	public static void main(String [] args) {
		int entero=1;
		
		do {
			System.out.println("Numero de mes");
			entero=obtener_entero_por_teclado();
			
		}while(!((entero>=1)&&(entero<=12)));
		
		mostrar_dias_del_mes(entero);
		
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
	
	public static void mostrar_dias_del_mes(int entero) {
		
		switch(entero) {
		case 1: System.out.println("Entero,31 dias");break;
		case 2:	System.out.println("Febrero,28 dias");break;
		case 3: System.out.println("Marzo,31 dias");break;
		case 4: System.out.println("Abril,30 dias");break;
		case 5: System.out.println("Mayo, 31 dias");break;
		case 6: System.out.println("Junio,30 dias");break;
		case 7: System.out.println("Julio 31 dias");break;
		case 8: System.out.println("Agosto,31 dias");break;
		case 9: System.out.println("Septiembre,30 dias");break;
		case 10: System.out.println("Octubre,31 dias");break;
		case 11: System.out.println("Noviembre,30 dias");break;
		case 12: System.out.println("Diciembre,31 dias");break;
		}
	}
}
