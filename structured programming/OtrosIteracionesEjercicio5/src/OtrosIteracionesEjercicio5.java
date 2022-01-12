import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que solicite el ingreso de un número N mayor a 50, y muestre por
//pantalla los números primos menores a N.
public class OtrosIteracionesEjercicio5 {
	final static int MAX=50;
	public static void main (String[] args) {
		int numero=1;
		
		while(numero<=MAX) {
			numero=pedir_entero();
			
			if(numero>MAX) {
				
				for(int i=1;i<numero;i++) {
					System.out.println("ENTRO EN FOR");
					if(es_primo(i)) {
						System.out.println(i);
					}
				}
			}
		}
	}
	
	
	public static boolean es_primo(int numero) {
		 int contador = 2;
		 boolean primo=true;
		 
		 if (numero%2==0)
			  return false;
		 
		 while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		    	primo = false;
		    	contador++;
		  	}
		 return primo;
	}
	
	public static int pedir_entero() {
		int numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		do {
			try {
				System.out.println("Ingresar entero");
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
