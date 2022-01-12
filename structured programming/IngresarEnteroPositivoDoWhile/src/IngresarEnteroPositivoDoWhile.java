import java.io.BufferedReader;
	import java.io.InputStreamReader;
public class IngresarEnteroPositivoDoWhile {
	
	public static void main(String[] args){
		int valori = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try { //try define un bloque de manejo de posibles excepciones
				System.out.println ("Ingrese valor positivo: ");
				valori = new Integer(entrada.readLine());
				System.out.println("int : " + valori);
			}
			catch (Exception exc ) {
				System.out.println( exc );
				valori = 0;
			}
		}while (valori<=0);
	}	
}
