import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un método que retorne el mayor de dos números. Usar ese método para calcular el máximo de una serie de números ingresados por el usuario (20 números en total).
public class DiseñoDescendenteEjercicio3 {
	final static int MAX=3;
	public static void main (String [] args) {
		int numero=-1;
		double valor1=0;
		double valor2=0;
		double valor3=0;
		
		System.out.println("Ingresar 3 doubles");
		valor1=ingresar_double_por_teclado();
		valor2=ingresar_double_por_teclado();
		valor3=ingresar_double_por_teclado();
		
		while((numero<0)||(numero>MAX)) {
			System.out.println("Ingresar un entero de 0 a 3");
			numero=ingresar_entero_por_teclado();
		}
		
		switch(numero) {
		case 0: System.out.println("Raiz cuadradra de la resta entre el valor1 y valor 3: "+Math.sqrt(valor1-valor3));break;
		case 1:	System.out.println("Promedio entre los 3 floats "+(valor1+valor2+valor3)/3);break;
		case 2:	System.out.println("Resultado de EquacionMat :"+EquacionMat(valor1,valor2,valor3));break;
		case 3:	System.out.println("Resultado del promedio / EquacionMat :"+(((valor1+valor2+valor3)/3)/EquacionMat(valor1,valor2,valor3)));break;
		}
			
		
	}
	
	public static double EquacionMat(double valor1,double valor2,double valor3) {
		double numero=0;
		
		numero=((Math.sqrt(valor1-valor3))/valor2);
			
		return numero;
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
	
	public static double ingresar_double_por_teclado() {
		double numero=0;
		boolean validador=true;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		
		do {
			try{
				System.out.println("Ingresar:");
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