import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SelectivasoCondicionales {
	
	public static void main (String[] args) {
		final int MULTIPLO1=6;
		final int MULTIPLO2=7;
		final int MULTIPLO3=2;
		final int MAYORA1=30;
		final int DIVISION=5;
		final int MAYORA2=10;
		
		int entero=0;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingresar entero:");
			entero=Integer.valueOf(entrada.readLine());
			
			
			if((entero%MULTIPLO1==0)&&(entero%MULTIPLO2==0)) {
			System.out.println("ES MULTIPLO DE "+MULTIPLO1 +" Y "+MULTIPLO2);
			}
			else if((entero>MAYORA1)&&(entero%MULTIPLO3==0)) {
				System.out.println("ES MAYOR A "+MAYORA1 +" Y MULTIPLO DE "+MULTIPLO3);
			}
			
			if (entero/DIVISION>MAYORA2) {
				System.out.println("El COCIENTE DE LA DIVISION ENTRE "+entero +" y "+DIVISION+" ES : MAYOR A "+MAYORA2);
			}
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
	}
}
