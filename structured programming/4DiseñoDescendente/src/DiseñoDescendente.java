import java.io.BufferedReader;
import java.io.InputStreamReader;
//Escribir un programa que mientras el usuario cargue desde
//teclado un numero entero distinto de 0, imprima por
//pantalla la suma que se obtiene de invocar un método
//que calcula la sumatoria de los primeros 200 números
//naturales (son números enteros en 1 y 200).
public class DiseñoDescendente {
	
	public static void main(String [] args) {
		int sumatoria=0;
		int entero=1;
		do {
			entero=obtener_entero();
			
			if(entero!=0) {
				sumatoria=sumatoria_200_numeros_naturales();
				imprimir_numero(sumatoria);
			}
			
		}while(entero!=0);
	}
	
	public static int obtener_entero() {
		int numero=0;
		boolean salidaDoWhile=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Ingresar entero:");
				numero=Integer.valueOf(entrada.readLine());
				
				
			}catch(Exception exc) {
				System.out.println(exc);
				numero=' ';
			}
			
		}while(!((numero>=0)||(numero<0)));
		
		return numero;
	}
	
	public static int sumatoria_200_numeros_naturales() {
		final int MIN=1;
		final int MAX=200;
		int suma=0;
		
		for(int i=MIN;i<MAX;i++) {
			suma+=i;
		}
		
		return suma;
	}
	
	public static void imprimir_numero(int numero) {
		System.out.println("numero");
	}
}
