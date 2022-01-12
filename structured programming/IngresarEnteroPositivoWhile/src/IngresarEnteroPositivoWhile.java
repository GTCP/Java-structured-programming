import java.io.BufferedReader;
	import java.io.InputStreamReader;
public class IngresarEnteroPositivoWhile {
	
	public static void main(String[] args){
		int valori = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (valori<=0){ //los valores positivos no incluyen al 0
			try { //try define un bloque de manejo de posibles excepciones
			System.out.println ("Ingrese valor positivo: ");
			valori = new Integer(entrada.readLine());
			System.out.println("int : " + valori);
			}
			catch (Exception exc ) {
			System.out.println( exc );
			valori = 0;
			}
		}
	}
}
