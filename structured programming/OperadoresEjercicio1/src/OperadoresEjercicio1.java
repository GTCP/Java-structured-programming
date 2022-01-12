import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que dados tres números reales ingresados por el usuario divida el primero por el segundo y al resultado obtenido le reste el tercero.
public class OperadoresEjercicio1 {
	
	public static void main (String[] args) {
		double numero=0;
		double numero2=0;
		double numero3=0;
		double numeroFinal=0;
		
		numero=pedir_numero_real();
		numero2=pedir_numero_real();
		numero3=pedir_numero_real();
		
		numeroFinal=((numero)/(numero2))-(numero3);
		System.out.println(numeroFinal);
	}
	
	public static double pedir_numero_real() {
		double numero=0;
		boolean validador=true;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try {
				System.out.println("Ingresar numero Real :");
				numero=new Double(entrada.readLine());
				validador=false;
			}
			catch(Exception exc) {
				System.out.println(exc);
				validador=true;
				numero=0;
			}
		}while(validador) ;
		
		return numero;
	}
}
