import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SelectivasoCondicionales {
	public static void main(String [] args) {
		int entero1=0;
		int entero2=0;	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));	
		try {
			System.out.println("Ingresar el primero entero:");
			entero1=Integer.valueOf(entrada.readLine());
			System.out.println("Ingresar el segundo entero:");
			entero2=Integer.valueOf(entrada.readLine());		
			
			if((entero1>entero2)&&( ( (entero1%2==0)&&(entero2%2==0) ) ) ) {
				System.out.println("A: el primero mayor al segundo y B: son multiplos de 2");
			}
			else if((entero1>entero2)&&( !( (entero1%2==0)&&(entero2%2==0) ) ) ) {
				System.out.println("A: el primero mayor al segundo,NO son multiplos de 2");
			}
			else if((entero1<=entero2)&&( ( (entero1%2==0)&&(entero2%2==0) ) ) ) {
				System.out.println("El primero es menor o igual al segundo,B: son multiplos de 2");
			}
			else if (entero1>entero2) {
				System.out.println("A: primero mayor al segundo");
			}
			else {
				System.out.println("C: ni el primero es mayor, ni son multiplos de 2");
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
		
		
		
	}
}



			//if(entero1>entero2) {
			//	System.ot.printl("A");
			//}	
			//else if((entero1%2==0)&&(entero2%2==0)) {
			//	System.ot.printl("B");
			//}
			//else {
			//	System.ot.printl("C");
			//}	
		
	