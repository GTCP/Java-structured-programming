
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//13. Realizar un programa que pida las longitudes de los lados de n triángulos, e informar:
// De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles
//(dos lados iguales), o escaleno (ningún lado igual)
// Cantidad de triángulos de cada tipo
// Tipo de triángulo del que hay menor cantidad
public class OtrosIteracionesEjercicio13 {
	public static void main(String [] args) {
		int triangulos=0;
		int lado1=0;
		int lado2=0;
		int lado3=0;
		int contadorEquilateros=0;
		int contadorIsosceles=0;
		int contadorEscalenos=0;
		
		System.out.println("Ingresar cantidad de triangulos:");

		triangulos=pedir_entero();
		for(int i=0;i<triangulos;i++) {
			lado1=pedir_entero();
			lado2=pedir_entero();
			lado3=pedir_entero();
			
			if((lado1==lado2)&&(lado3==lado1)){
				contadorEquilateros++;
				System.out.println("Equilatero");
			}
			else if((lado1!=lado2)&&(lado3!=lado1)&&(lado2!=lado3)) {
				contadorEscalenos++;
				System.out.println("Escaleno");
			}
			else if(((lado1==lado2)&&(lado1!=lado3))||((lado2==lado3)&&(lado1!=lado2))||((lado1==lado3)&&(lado1!=lado2))) {
				contadorIsosceles++;
				System.out.println("Isosceles");
			}
		}
		
		if((contadorEquilateros<contadorIsosceles)&&(contadorEquilateros<contadorEscalenos)){
			
			System.out.println("Hay menos Triangulos Equilateros");
		}
		else if ((contadorIsosceles<contadorEquilateros)&&(contadorIsosceles<contadorEscalenos)) {
			System.out.println("Hay menos Triangulos Isosceles");
		}
		else if((contadorEscalenos<contadorEquilateros)&&(contadorEscalenos<contadorIsosceles)) {
			System.out.println("Hay menos Triangulos Escalenos");
		}
		System.out.println("Triangulos equilateros:"+contadorEquilateros);
		System.out.println("Triangulos isosceles:"+contadorIsosceles);
		System.out.println("Triangulos escalenos:"+contadorEscalenos);

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