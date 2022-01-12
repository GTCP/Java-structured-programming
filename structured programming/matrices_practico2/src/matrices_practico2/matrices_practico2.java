package matrices_practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class matrices_practico2 {
	final static int MAXFIL=4;
	final static int MAXCOL=4;
	public static void main( String[] args) {
		int matt[][]=new int [MAXFIL][MAXCOL];
		int matt2[][]= {{3,5,8,4},{5,7,4,5},{8,2,8,5},{2,9,8,9}};
		int arr[]=new int [MAXFIL];
		int arr2[]=new int [MAXFIL];
	//	for(int i=0;i<MAXFIL;i++) {
	//		arr[i]=(int)(Math.random()*100);
	//	}
	//	for(int i=0;i<MAXFIL;i++) {
	//		arr[i]=(int)(Math.random()*100);
	//	}
		cargarmatriz(matt);
		imprimirmatriz(matt);
		System.out.println("");
	//	int pos=obtenerenteroporteclado();

		//corrimientohaciaabajo(matt,pos);
		//insertar_arreglo(matt,arr,pos);
		System.out.println("");
	//	for(int i=0;i<MAXFIL;i++) {
	//		System.out.print("["+arr[i]+"]");
	//	}
		
		System.out.println("");
		//eliminarfila_arreglo(matt,arr);
		//imprimirmatriz(matt);
		//ordenarcadaunadesusfilasmatriz(matt);
		System.out.println("");
		imprimirmatriz(matt);
	//	ordenartodalamatrizascendentemente(matt);
		System.out.println("");
	//	insertarfila_manteniendoorden(matt,arr);
	//	imprimirmatriz(matt);
		ordenarcadaunadesusfilasmatriz(matt);
		imprimirmatriz(matt);
		


	}
	
	
	public static void cargarmatriz(int matt[][]) {
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++){
				matt[i][j]=(int)(Math.random()*100);
			}
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
	public static void imprimirmatriz(int matt[][]) {

		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++) {
				System.out.print("  "+"["+matt[i][j]+"]");
			}
			System.out.println("");

		}
	}
	public static void corrimientohaciaabajo(int matt[][],int pos) {
		for(int i=MAXFIL-1;i>0;i--) {	
			for(int j=0;j<MAXCOL;j++){
				if(!(i==pos)) {
					matt[i][j]=matt[i-1][j];
				}
			}
		}
	}
	public static void insertar_arreglo(int matt[][],int arr[],int pos) {
		for(int i=0;i<MAXFIL;i++) {
			matt[pos][i]=arr[i];
		}
	}
	public static void eliminarfila_arreglo(int matt[][],int arr[]) {
		System.out.println("Ingrese la fila que desea eliminar de la matriz");
		int pos=obtenerenteroporteclado();
		for(int j=0;j<MAXFIL;j++) {
			matt[pos][j]=0;
		}
	}
	public static void ordenarcadaunadesusfilasmatriz(int matt[][]) {
		int aux=0;
		for(int k=0;k<MAXFIL;k++) {
			for(int i=1;i<MAXCOL;i++) {
				for(int j=0;j<MAXCOL-1;j++) {
					if(matt[k][j]>matt[k][j+1]) {
						aux=matt[k][j];
						matt[k][j]=matt[k][j+1];
						matt[k][j+1]=aux;
					}
				}
			}
		}
			
	}
	public static void ordenartodalamatrizascendentemente(int matt[][]) {
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXFIL;j++) {
				for(int x=0;x<MAXFIL;x++) {
					for(int y=0;y<MAXFIL;y++) {
						if(matt[i][j]>matt[x][y]) {
							int temp=matt[i][j];
							matt[i][j]=matt[x][y];
							matt[x][y]=temp;
						}
					}
				}
			}
		}
		
	}

	public static void insertarfila_manteniendoorden(int matt[][],int arr[]) {
		int aux=0;
		int auxfinal=0;
		
		for(int i=0;i<MAXFIL;i++) {
			for(int j=0;j<MAXCOL;j++) {
				aux+=matt[i][j];
				
				if(j==MAXCOL-1) {
					auxfinal=aux;
					aux=0;
					System.out.println("aux: "+aux);
					System.out.println("auxfinal:"+auxfinal);			
				}
			}
		}
		
	}
}
