
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un
//mensaje cuál de las dos listas tiene un valor acumulado mayor (mensajes: "Lista 1 mayor",
//"Lista 2 mayor", "Listas iguales").
public class OtrosIteracionesEjercicio9 {
	final static int CANT_VALORES=15;
	public static void main(String [] args) {
		int lista1=0;
		int lista2=0;
		
		
		for(int i=0;i<CANT_VALORES;i++) {
			System.out.println(i+1);

			lista1+=pedir_entero();
		}
		for(int i=0;i<CANT_VALORES;i++) {
			System.out.println(i+1);
			lista2+=pedir_entero();
		}
		
		
		
		if(lista1>lista2) {
			System.out.println("Lista 1 Mayor");
		}
		else if(lista2>lista1) {
			System.out.println("Lista 2 Mayor");

		}
		else {
			System.out.println("Listas Iguales");
		}
	
	}
	
	public static int pedir_entero() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try {
				System.out.println("Ingresar entero:");	
				numero=new Integer(entrada.readLine());
				validador=false;
			}
			catch(Exception exc) {
				System.out.println(exc);
				validador=true;
				numero=0;
			}
			
		}while(validador);
		
		
		return numero;
	}
}