import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
//Hacer un programa que devuelva la posición de inicio y fin de la anteúltima secuencia de números distintos de ceros.
public class ArreglosEjercicio10 {
	final static int MAX=20;
	
	public static void main( String[] args) {
		int arr[]= {1,2,0,4,5,35,0,8,9,10,0,2,3,0,5,6,7,0,100,2};
		int pos=MAX-1;
		int inicioactual=MAX-1;
		int finactual=MAX;
		int inicioanterior=0;
		int finanterior=0;
		int contador=0;
		
		
		while(pos>0) {
			inicioactual=encontrar_inicio_sec(arr,finactual-1);
			finactual=encontrar_fin_sec(arr,inicioactual);
			contador++;
			
			if(contador==2) {
				inicioanterior=inicioactual;
				finanterior=finactual;	
			}
		
			
			pos=finactual;	
		}
		
		System.out.println("INICIO ANTEULTIMA SEC:"+inicioanterior);
		System.out.println("FIN ANTEULTIMA SEC:"+finanterior);

		
	}

	
	public static int encontrar_inicio_sec(int arr[],int pos) {
		
		while((pos>0)&&(arr[pos]==0)) {
			pos--;
		}
		System.out.println("INICIO"+pos);
		
		return pos;
	}
	
	public static int encontrar_fin_sec(int arr[],int pos) {
		
		while((pos>0) && ( !( (arr[pos]!=0)&&(arr[pos-1]==0) )  ) ) {
			pos--; 
		}
		System.out.println("FIN"+pos);

		return pos;
	}
}
