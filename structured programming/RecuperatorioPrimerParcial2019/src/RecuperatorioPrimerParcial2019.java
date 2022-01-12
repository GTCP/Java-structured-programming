import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class RecuperatorioPrimerParcial2019 {
	
	public static void main (String [] args) {
		final int MAX=20;
		final int MULTIPLO=7;
		int numero=-1;
		char caracter=' ';
		int contador=0;
		boolean validador=true;
	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("ES","Us"));
		while(numero !=0){
			validador=true;
			numero=0;
			while(validador) {
				try {
					System.out.println("Ingresar un numero:");
					numero=new Integer(entrada.readLine());
				
				}
				catch(Exception exc) {
					System.out.println(exc);
					validador=false;
				}
				validador=false;
			}
			//SI PONGO UN - SE ROMPE TODO NO ENTRA EN EL CATCH
			
			if(numero !=0) {
				try {
					System.out.println("Ingresar un caracter:");
					caracter=(char)(entrada.readLine().charAt(0));
				}
				catch(Exception exc) {
					System.out.println(exc);
				}
				
				switch(caracter) {
					case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': 
						numero=0;
						for(int i=0;i<MAX;i++) {
							validador=false;

							while(!validador) {
								try {
									System.out.println("Ingresar un numero multiplo de 7: faltan "+(MAX-i)+" veces");
									numero=new Integer(entrada.readLine());
								}
								catch(Exception exc) {
									System.out.println(exc);
									validador=false;
								}
							
								if(numero%MULTIPLO==0) {
									validador=true;
								}				
							}
							
							contador+=numero;

							System.out.println(contador+"contador");
	
						}System.out.println(contador/MAX+" PROMEDIO DE NUMEROS MULTIPLOS DE :"+MULTIPLO);break;	
					default : System.out.println("otro");break;
				}
				
			}
		}
	}
}

