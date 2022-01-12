import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Escribir un programa que mientras el usuario ingrese un numero NUM que sea multiplo de 3 y 7 , pida ingresar NUM caracteres,y por cada caracter ingresado imprima:
//*"letra minuscula" si el caracter es una letra del abecedario en minuscula;
//*"letra mayuscula" si el caracter es una letra del abecedario en mayuscula;
//*"digito" si el caracter corresponde a un caracter numero;
//*"otro" para los restantes casos de caracteres;
public class PrimerParcial2019 {
	final static int multiplo_1=3;
	final static int multiplo_2=7;
	public static void main ( String[] args) {
		int NUM=0;
		char caracter=' ';
		boolean validador=true;
		
		Locale.setDefault(new Locale("Es","Us"));
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		while(validador) {
			try {
				System.out.println("Ingresar entero:");
				NUM=new Integer(entrada.readLine());
			}
			catch(Exception exc){
				System.out.println(exc);
				NUM=0;
			}
			if((NUM%multiplo_1==0)&&(NUM%multiplo_1==0)) {
				for(int i=0;i<NUM;i++) {
					while(validador) {
						try {
							System.out.println("Ingresar caracter:");
							caracter=(char)(entrada.readLine().charAt(0));
							}
						catch(Exception exc){
							System.out.println(exc);
						}
						validador=false;
	
						switch(caracter) {
							case 'A':case 'B':case 'C':case 'D':case 'E':case 'F':case 'G':case 'H':case 'I':case 'J':case 'K':case 'L':case 'M':case 'N':case 'Ñ':case 'O':case 'P':case 'Q':case 'R': case 'S':case 'T':case 'X':case 'Y': case 'Z':System.out.println("letra mayuscula");break;
							case 'a':case 'b':case 'c':case 'd':case 'e':case 'f':case 'g':case 'h':case 'i':case 'j':case 'k':case 'l':case 'm':case 'n':case 'ñ':case 'o':case 'p':case 'q':case 'r': case 's':case 't':case 'x':case 'y': case 'z':System.out.println("letra minuscula");break;
							case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':System.out.println("digito");break;
							default : System.out.println("otro");break;
						}
					}
					validador=true;
				}
				
			}
			else {
				validador=false;
			}
			
		}
	}
}		
