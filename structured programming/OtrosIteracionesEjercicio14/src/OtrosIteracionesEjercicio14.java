
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//14. Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
//Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante.
//Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.
public class OtrosIteracionesEjercicio14 {
	public static void main(String [] args) {
		int puntos=0;
		int x=0;
		int y=0;
		int contadorPrimerCuadrante=0;
		int contadorSegundoCuadrante=0;
		int contadorTercerCuadrante=0;
		int contadorCuartoCuadrante=0;
		
		System.out.println("Ingresar cantidad de puntos:");

		puntos=pedir_entero();
		for(int i=0;i<puntos;i++) {
			x=pedir_entero();
			y=pedir_entero();
			
			if((x>=0)&&(y>=0)) {
				contadorPrimerCuadrante++;
			}
			else if((y<0)&&(x>0)) {
				contadorSegundoCuadrante++;
			}
			else if((y<0)&&(x<0)) {
				contadorTercerCuadrante++;
			}
			else if((y>0)&&(x<0)) {
				contadorCuartoCuadrante++;
			}
		}
			
		System.out.println("Primer cuadrante:"+contadorPrimerCuadrante);
		System.out.println("Segundo cuadrante:"+contadorSegundoCuadrante);
		System.out.println("Tercer cuadrante:"+contadorTercerCuadrante);
		System.out.println("Cuarto cuadrante:"+contadorCuartoCuadrante);

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
