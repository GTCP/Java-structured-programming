
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//11. Confeccionar un programa que pida n pares de datos, cada par de datos corresponde a la
//medida de la base y la altura de un triángulo. El programa deberá informar:
// De cada triángulo: la medida de su base, su altura y su superficie.
// La cantidad de triángulos cuya superficie es mayor a 12.
public class OtrosIteracionesEjercicio11 {
	final static int TRIANGULOS=2;
	final static int N=2*TRIANGULOS;
	final static int SUPERFICIEMAYOR=12;
	public static void main(String [] args) {
		int base=0;
		int altura=0;
		int superficie=0;
		
		int contSuperficieMayor=0;
		
		for(int i=0;i<N;i++) {
			System.out.println("base :");
			base=pedir_entero();
			System.out.println("altura :");
			altura=pedir_entero();
			System.out.println("base :"+base);
			System.out.println("altura :"+altura);
			superficie=(base*altura)/2;
			System.out.println("superficie :"+superficie);
			System.out.println("");

			if(superficie>SUPERFICIEMAYOR) {
				contSuperficieMayor++;
			}
		}
		
		System.out.println("Cantidad de triangulos con superficie mayor a "+SUPERFICIEMAYOR+" : "+contSuperficieMayor);

		
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
