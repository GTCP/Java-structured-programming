import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio
//de las personas.
public class OtrosIteracionesEjercicio7 {
	
	public static void main(String [] args) {
		System.out.println("Ingrese Cantidad de alturas");
		int cantidadDeAlturas=pedir_entero();
		int alturas[]=new int[cantidadDeAlturas];
		double promedio=0;
		for(int i=0;i<cantidadDeAlturas;i++) {
			alturas[i]=pedir_entero();
			promedio+=alturas[i];
		}
		promedio=promedio/cantidadDeAlturas;
		System.out.println("El promedio es:"+promedio);

	
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
