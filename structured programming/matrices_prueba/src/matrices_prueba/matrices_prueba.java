package matrices_prueba;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class matrices_prueba {
	final static int MAXFIL=6;
	final static int MAXCOL=6;
	public static void main( String[] args) {
		int matt[][]=new int [MAXFIL][MAXCOL];
		int sumadiagonalizquierda=0;
		cargarmatriz(matt);
		sumadiagonalizquierda=obtenersumadiagonalizquierda(matt);
		imprimirmatriz(matt);
		System.out.println(sumadiagonalizquierda);
		int numero=obtenerenteroporteclado2();
		invertirinicioyfindefiladada(matt,numero);
		imprimirmatriz(matt);
	}
	public static void cargarmatriz(int matt[][]) {
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++){
				matt[i][j]=obtenerenteroporteclado();
			}
		}
	}
	public static void imprimirmatriz(int matt[][]) {

		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("  "+matt[i][j]);
			}
			System.out.println("");

		}
	}
	public static int obtenerenteroporteclado() {
		int numero=0;
		boolean validador=false;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("Es","Us"));
		
		while (!(validador)) {
			try {
				System.out.println("Ingresar entero");
				numero=new Integer(entrada.readLine());
				if((numero>0)||(numero<=0)) {
					validador=true;
				}
			}
			catch (Exception exc){
				System.out.println(exc);
				validador=false;
			}
		}
		return numero;
	}
	public static int obtenersumadiagonalizquierda(int matt[][]) {
		int valordiagionalizquierda=0;
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++) {
				if(i==j) {
					valordiagionalizquierda+=(matt[i][j]);
				}
			}
		}
		return valordiagionalizquierda;
	}
	public static void invertirinicioyfindefiladada(int matt[][],int numero){
		int numerofila=numero;
		int recorrido=MAXCOL;
		int aux=0;
	
			for(int j=0;j<(MAXCOL/2);j++) {
				aux=matt[numerofila][j];
				matt[numerofila][j]=matt[numerofila][recorrido-1];
				matt[numerofila][recorrido-1]=aux;
				recorrido--;
			}
		
}
	public static int obtenerenteroporteclado2() {
		int numero=0;
		boolean validador=false;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("Es","Us"));
		
		while (!(validador)) {
			try {
				System.out.println("Ingresar entero");
				numero=new Integer(entrada.readLine());
				if((numero>0)||(numero<=0)) {
					if(numero<MAXCOL) {
						validador=true;
						}
				}
			}
			catch (Exception exc){
				System.out.println(exc);
				validador=false;
			}
		}
		return numero;
	}
}