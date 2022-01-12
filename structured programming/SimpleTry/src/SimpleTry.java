import java.io.BufferedReader;
import java.io.InputStreamReader;
	
public class SimpleTry {

		
		public static void main(String [] args) {
			char caracter;
			char caracter2;

			boolean salidaDoWhile=false;

			BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

			do {
				try {
				System.out.println("Ingresa un caracter1:");
				caracter=entrada.readLine().charAt(0);
				
				if(caracter=='a') {


					do {
						System.out.println("Ingresa un caracter2:");
						caracter2=entrada.readLine().charAt(0);
						salidaDoWhile=true;
						
					}while(!salidaDoWhile);
					
				}//if	
				}//try
				catch(Exception exc){
				System.out.println("Error al ingresar primer caracter");
				salidaDoWhile=false;
				}//catch

			}while(!salidaDoWhile);

	}//main
}//class