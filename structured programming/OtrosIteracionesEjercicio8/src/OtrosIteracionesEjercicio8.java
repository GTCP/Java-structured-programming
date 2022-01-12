
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un
//programa que pida los sueldos que cobra cada empleado e informe cuántos empleados cobran
//entre 100y300 y cuántos cobran más de $300. Además el programa deberá informar el importe
//que invierte la empresa en sueldos al personal.
public class OtrosIteracionesEjercicio8 {
	final static int NUM_EMPLEADOS=10;
	public static void main(String [] args) {
		int numero=0;
		int contadorMinimo=0;
		int contadorMaximo=0;
		
		for(int i=0;i<NUM_EMPLEADOS;i++) {
			numero=pedir_entero();
			
			if((numero>=100)&&(numero<=300)) {
				contadorMinimo++;
			}
			else if(numero>300) {
				contadorMaximo++;
			}
		}
		System.out.println("Cantidad de empleados que ganan entre 100 y 300:"+contadorMinimo);
		System.out.println("Cantidad de empleados que ganan mas de 300:"+contadorMaximo);

	
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
