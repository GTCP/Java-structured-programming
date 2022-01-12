import java.io.BufferedReader;
import java.io.InputStreamReader;
//Escribir un programa que mientras que el usuario ingrese un número entero
//natural, llame a un método que calcule la sumatoria entre 1 y dicho
//numero y se lo retorne como resultado. Finalmente, muestre por pantalla el
//resultado obtenido.
public class DiseñoDescendente {
	public static void main(String[] args) {
		int numero=-1;
		int sumatoria=0;
		
		do {
				numero=obtener_entero_natural();
				
				if(numero >=0) {
					sumatoria=calcular_sumatoria_entre_1_y_parametro(numero);
					imprimir_entero(sumatoria);
					}
			
		}while(numero>=0);
	}



public static int obtener_entero_natural() {
	int numero=-1;
	boolean salidaDoWhile=false;
	
	BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
	do {
		try {
			System.out.println("Ingresar numero");
			numero=Integer.valueOf(entrada.readLine());
			salidaDoWhile=true;
		}catch(Exception exc) {
			System.out.println("Error al ingresar");
			salidaDoWhile=false;
			
		}
	}while(!salidaDoWhile);
	return numero;
}

	public static void imprimir_entero(int numero) {
		System.out.println(numero);
	}
	
	public static int calcular_sumatoria_entre_1_y_parametro(int numero) {
		final int MIN=1;
		int sumatoria=0;
		
		for(int i=MIN;i<=numero;i++) {
			sumatoria+=i;
		}
		return sumatoria;
	}
}
