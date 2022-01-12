import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un m�todo que retorne el mayor de dos n�meros. Usar ese m�todo para calcular el m�ximo de una serie de n�meros ingresados por el usuario (20 n�meros en total).
public class Dise�oDescendenteEjercicio2 {
	final static int MAX=1000;
	public static void main (String [] args) {
		int dado=0;
		int numero=0;
		int contador=0;
		
		while((numero<=0)||(numero>6)) {
			System.out.println("primer etapa");
			numero=ingresar_entero_por_teclado();
		}
		
		
		
		for(int i=0;i<MAX;i++) {
			dado=(int)(6*Math.random()+1);
			
			if(dado==numero) {
				contador++;
			}
			System.out.println(dado);
			
		}
		System.out.println("Cantidad de veces que se repitio el dado con el numero ingresado: "+contador);
		
		
		
	}

	
	public static int ingresar_entero_por_teclado() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try{
				System.out.println("Ingresar un entero:");
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