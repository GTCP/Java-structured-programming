package arreglos_practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class arreglos_practico2 {
	final static int MAX=10;
	public static void main(String [] args) {
		int arrdatos[]={1,9,2,1,5,8,2,4,4,8};
		int numeroingresado=ingresar_entero();
		//cargar_arreglo(arrdatos);
		int buscar_posicion=buscar_pos_ord(arrdatos,numeroingresado);
		meter_entero(arrdatos,numeroingresado);
		burbujeo(arrdatos);
		imprimir_arreglo(arrdatos);

	}
	public static void cargar_arreglo(int arrdatos[]) {
		for (int pos=0;pos<MAX;pos++) {
			arrdatos[pos]=(pos+1);
		}
	}	
	public static int ingresar_entero() {
		int numero=0;
		boolean validador=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("Es","Us"));
		
		while (!validador) {
			try {
				System.out.println("Ingresar entero");
				numero=new Integer(entrada.readLine());
				if ((numero>0)||(numero<=0)) {
					validador=true;
				}
			}
			catch (Exception exc) {
				System.out.println(exc);
				validador=false;
			} 
		}
		return numero;
	}
	public static int buscar_pos_ord(int []arrdatos,int numeroingresado) { 
		int pos = 0;    
		while ((pos<MAX)&&(arrdatos[pos]>numeroingresado)) {   
			pos++;    
		}
		if ((pos<MAX)&&(arrdatos[pos]==numeroingresado)) {
			return pos;    
		}
		else {
			return -1; 
		}
	}
	public static void imprimir_arreglo(int arrdatos[]) {
		for (int i=0;i<MAX;i++) {
			System.out.print(arrdatos[i]);
		}
	}
	public static void meter_entero(int arrdatos[],int numeroingresado) {
		arrdatos[1]=numeroingresado;
	}	
	public static void burbujeo(int arrdatos[]) {
		
	   
			int temp;    
			for(int i = 1;i < MAX;i++){     
				for (int j = 0 ; j < MAX - 1; j++){      
					if (arrdatos[j] > arrdatos[j+1]){       
						temp = arrdatos[j];       
						arrdatos[j] = arrdatos[j+1];       
						arrdatos[j+1] = temp;      
						}
				}
			}
		}
	public static void insercion(int arrdatos[]) {
		for (int i=1;i<MAX;i++) {
			int aux=arrdatos[i];
			int j= i-1;
			
			while ((j>=0)&&(arrdatos[j]>aux)) {
				arrdatos[j+1]=arrdatos[j];
				j--;
			}
			arrdatos[j+1]=aux;
		}
		
	}
}
	
