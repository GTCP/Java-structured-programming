package diseño_decendente_practico1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class diseño_decendente_practico1 {
	public static void main(String [] args) {
		veintenumeros();
		
	}
	
	public static int mayorde2numeros(int asd,int asd2) {
		int numero1=asd;
		int numero2=asd2;
		if (numero1<numero2) {
			numero1=numero2;
			System.out.println(numero1);
			return numero1;
		} else {
			numero2=numero1;
			System.out.println(numero2);
			return numero2;
			
		}
	}
	
	public static void veintenumeros() {
		final int MAX=20;
		int numero=0;
		int numero2=0;
		int mayor=0;
		for (int i=1;i<=MAX;i++) {
			numero=ingresoporteclado(i);
			numero2=numero;
			mayor=mayorde2numeros(numero,numero2);
		}
		System.out.println("El numero mayor del ciclo es="+mayor);
	}
	public static int ingresoporteclado(int i) {
		int ingreso=0;
		boolean validador=true;
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","US"));
		int contador=i;
		while (validador) {
		try {
			System.out.println("Ingrese un numero");	
			ingreso= new Integer(entrada.readLine());
			if((ingreso==0)||(ingreso!=0)) {
				validador=false;
				System.out.println("Vas por "+contador+"/20");
				contador++;
			}
		}
		catch (Exception exc) {
			System.out.println(exc);
			validador=true;
		}
		}
		return ingreso;
	}
}
