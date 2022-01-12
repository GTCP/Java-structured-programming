import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que solicite 50 números enteros y almacene el máximo (max), el mínimo
//(min) y el promedio (prom) de los valores ingresados. Luego, pedir max - min (el nro
//resultante de restar max menos min) números e informar cuántos de ellos son mayores que
//prom.
public class OtrosIteracionesEjercicio18 {
	final static int MAXNUMEROS=5;
	public static void main(String [] args) {
		int numero=0;
		int promedio=0;
		int max=0;
		int maxanterior=0;
		int min=0;
		int minanterior=9999999;
		int contadorMayoresPromedio=0;
		
		for(int i=0;i<MAXNUMEROS;i++) {
			
			numero=pedir_entero();
			promedio+=numero;
			
			max=numero;
			min=numero;
		
			if(max>maxanterior) {
				maxanterior=max;
			}
			
			if(min<minanterior) {
				minanterior=min;
			}
			System.out.println(maxanterior);
			System.out.println(minanterior);
			
		}
		promedio=promedio/MAXNUMEROS;
		
		System.out.println("Promedio:"+promedio);
		
		System.out.println("Arranca el otro for");
		for(int i=0;i<maxanterior-minanterior;i++) {
			numero=pedir_entero();
			if(numero>promedio) {
				contadorMayoresPromedio++;
			}
		}
		
		System.out.println("contador de mayores del promedio"+contadorMayoresPromedio);
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
