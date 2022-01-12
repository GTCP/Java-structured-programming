
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos
//valores fueron pares y cuántos impares
public class OtrosIteracionesEjercicio10 {
	final static int N=6;
	public static void main(String [] args) {
		int numero=0;
		int contadorPar=0;
		int contadorInpar=0;
		
		
		
		for(int i=0;i<N;i++) {
			numero=pedir_entero();
			if(numero%2==0) {
				contadorPar++;
			}
			else {
				contadorInpar++;
			}
		}
		System.out.println("Cuantos pares hay:"+contadorPar);
		System.out.println("Cuantos inpares hay:"+contadorInpar);

	
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