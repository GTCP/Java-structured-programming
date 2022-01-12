import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Realizar un programa que mientras el usuario ingrese un numero entero positivo multiplo de 3 y de 5 realice los siguiente:
_solicite ingresar otros dos numeros enteros e imprima el resultado de las operaciones matematicas basicas entre ambos numeros,
_solicite ingresar un caracter y si es vocal imprima por pantalla de que vocal se trata.
*/
public class AGUS {

public static void main(String[] args) {
	final int MULTIPLOMAX = 5;
	final int MULTIPLOMIN = 3;
    int numero;
    int numero1, numero2;
    char caracter;
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    try {   
    	do {
	    	System.out.println("Ingrese un numero entero positivo: ");
	        numero = Integer.valueOf(entrada.readLine());       
        	if(((numero>0)&&((numero % MULTIPLOMIN == 0) && (numero % MULTIPLOMAX == 0)))) {       		
	            System.out.println("Ingresar dos numero enteros: ");
	            numero1 = Integer.valueOf(entrada.readLine());
	            System.out.println("falta el segundo entero: ");
	            numero2 = Integer.valueOf(entrada.readLine());                        
	            imprimir_operaciones_matematicas_basicas_entre_ambos_numeros(numero1, numero2);
	            System.out.println("Ingresar un caracter: ");	           
	            caracter = entrada.readLine().charAt(0);	                    
	            if (es_vocal(caracter)) {
                    System.out.println("Vocal : " + caracter);
                }	         
        	}
        }while(((numero>0)&&((numero % MULTIPLOMIN == 0) && (numero % MULTIPLOMAX == 0))));     
    	System.out.println("Fin del Programa");
    }catch (Exception exc) {
        System.out.println(exc);
    }
}
public static void imprimir_operaciones_matematicas_basicas_entre_ambos_numeros(double numero1, double numero2) {
    System.out.println("La sema de " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    System.out.println("La resta de " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
    System.out.println("La multiplicacion de " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
    System.out.println("La division de " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
}
public static boolean es_vocal(int caracter) {
    switch (caracter) {
        case 'a':  case 'e': case 'i': case 'o':  case 'u':   return true;
        default:  return false;
    }
}
}