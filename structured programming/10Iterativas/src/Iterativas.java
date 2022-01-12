import java.io.BufferedReader;
import java.io.InputStreamReader;
//Escribir un programa que mientras el usuario ingresa un numero de mes (entero) entre 1 y 12 inclusive, 
//muestre por pantalla la cantidad de días del mes ingresado (suponer febrero de 28 días).
public class Iterativas {
	
	public static void main(String [] args) {
		int mes=0;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("");

				System.out.println("Ingresar numero del mes:");
				mes=Integer.valueOf(entrada.readLine());
				
				if((mes>=1)&&(mes<=12)){
					switch(mes) {
					case 1: System.out.println("Enero : 31 dias ");break;
					case 2: System.out.println("Febrero : 28 dias");break;
					case 3: System.out.println("Marzo : 31 dias ");break;
					case 4: System.out.println("Abril : 30 dias ");break; 
					case 5: System.out.println("Mayo : 31 dias");break;
					case 6: System.out.println("Junio : 30 dias ");break;
					case 7: System.out.println("Julio : 31 dias");break;
					case 8: System.out.println("Agosto : 31 dias");break;
					case 9: System.out.println("Septiembre : 30 dias");break;
					case 10: System.out.println("Octubre : 31 dias");break;
					case 11: System.out.println("Noviembre : 30 dias ");break;
					case 12: System.out.println("Diciembre : 31 dias");break;
					}
				}
			}
			catch(Exception exc){
				System.out.println(exc);
				mes=1;
			}
		}while((mes>=1)&&(mes<=12));
	}
}