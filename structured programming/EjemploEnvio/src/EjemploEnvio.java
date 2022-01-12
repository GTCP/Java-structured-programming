import java.io.BufferedReader;
import java.io.InputStreamReader;
//Practico_5_Ejercicio_9: Escribir un programa que mientras el usuario ingrese un caracter letra minuscula, 
//se quede con la menor y la mayor letra ingresada. 
//Finalmente muestre por pantalla dichas letras.
public class EjemploEnvio {
	public static void main(String [] args) {
		char caracterMinimo=' ';
		char caracterMaximo=' ';
		char caracterIngresado=' ';
		int contadorCararacteresIngresados=0;
		boolean salidaDoWhile=false;
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingresar letra minuscula:");
				caracterIngresado=entrada.readLine().charAt(0);
				
				if((caracterIngresado>='a')&&(caracterIngresado<='z')) {
					if(caracterIngresado>caracterMaximo) {
						caracterMaximo=caracterIngresado;
						contadorCararacteresIngresados++;
					}
					else {
						caracterMinimo=caracterIngresado;
						contadorCararacteresIngresados++;
					}
				}
				else {
					salidaDoWhile=true;
				}
			}
			catch(Exception exc){
				System.out.println(exc);
			}
		}while(!salidaDoWhile);
		
		if(contadorCararacteresIngresados==1) {
			
			caracterMinimo=caracterMaximo;//en caso de que solo se ingrese un numero se le asigna como maximo y minimo.
		}
		System.out.println("Letra minuscula minima ingresada: "+caracterMinimo);
		System.out.println("Letra minuscula maximo ingresada: "+caracterMaximo);
		
	//	int random = (int )(Math.random() * 100+1 );
	//	System.out.println(random);
	}
}
