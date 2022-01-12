import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un m�todo que retorne el mayor de dos n�meros. Usar ese m�todo para calcular el m�ximo de una serie de n�meros ingresados por el usuario (20 n�meros en total).
public class Dise�oDescendenteEjercicio1 {
	final static int MAX=20;
	public static void main (String [] args) {
		int numero=0;
		int numeroanterior=0;
		for(int i=0;i<MAX;i++) {
			numero=ingresar_entero_por_teclado();
			
			numeroanterior=retorno_valor_mayor(numeroanterior,numero) ;
				
			
		}
		
		System.out.println(numeroanterior);
		
		
		
	}
	
	public static int retorno_valor_mayor(int numero1,int numero2) {
		int mayor=0;
		
		if(numero1>=numero2) {
			mayor=numero1;
		}
		else if(numero1<=numero2){
			mayor=numero2;
		}
		
		
		
		return mayor;
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
