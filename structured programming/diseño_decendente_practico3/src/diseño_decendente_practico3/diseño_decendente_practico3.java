package diseño_decendente_practico3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class diseño_decendente_practico3 {
	public static void main(String [] args) {
		int numeroinicial=0;
		final int MAX=3;
		float val1=0,val2=0,val3=0;
		int contador=1;
		numeroinicial=ingresarentero();
		val1=ingresarfloat(contador);
		contador++;
		val2=ingresarfloat(contador);
		contador++;
		val3=ingresarfloat(contador);
		contador++;
		opciones(numeroinicial,val1,val2,val3);
	}
	public static int ingresarentero() {
		boolean validador=true;
		int numero=0;
		final int MAX=4;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("Es","Us"));
		while (validador) {
			try {
				System.out.println("Ingresar un numero del 0 al 3");
				numero=new Integer(entrada.readLine());
				if ((numero>=0)&&(numero<MAX)) {
					validador=false;
				}
			} 
			catch (Exception exc) {
				System.out.println(exc);
				validador=true;
			}
		}
		return numero;
	}
	public static float ingresarfloat(int contador) {
		boolean validador=true;
		float numero=0;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("Es","Us"));
		while (validador) {
			try {
				System.out.println("Ingresar el "+contador+"/3"+" float");
				numero=new Float(entrada.readLine());
				if ((numero<0)||(numero>0)) {
					validador=false;
					
					
				}
			}
			catch (Exception exc) {
				System.out.println(exc);
				validador=true;
			}
			System.out.println();
		}
		return numero;
	}
	public static void opciones(int numeroinicial,float val1,float val2,float val3) {
		int numero=numeroinicial;
		double raizcuadrada=val1-val3;
		double numerocase2=0;
		switch (numeroinicial) {
		case 0: System.out.println(raizcuadrada=Math.sqrt(raizcuadrada));break;
		case 1: System.out.println("promedio entre los 3 floats"+((val1+val2+val3)/3));break;
		case 2: System.out.println("asd2");break;
		case 3: System.out.println("asd3");break;
		}
	}
	public static double EquacionMat(float val1,float val2,float val3) {
		double EquacionMat=((Math.sqrt(val1-val3))/val2);
		return EquacionMat;
	}
}