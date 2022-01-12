import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

//9.Hacer un programa que devuelva la posición de inicio y fin de la secuencia de números distintos de ceros cuya suma del contenido sea mayor.
public class ArreglosEjercicio9 {
	final static int MAX=20;
	
	public static void main(String [] args) {
		int arr[]= {1,2,0,4,5,35,0,8,9,10,0,2,3,0,5,6,7,0,100,2};
		
		int inicioactual=0;
		int finactual=-1;
		int pos=0;
		int valoractual=0;
		int valoranterior=0;
		int inicioanterior=0;
		int finanterior=0;
		
		while(pos<MAX-1) {
			inicioactual=encontrar_inicio_sec(arr,finactual+1);
			finactual=encontrar_fin_sec(arr,inicioactual);
			
			valoractual=sumar_sec(arr,inicioactual,finactual);
			System.out.println("VALOR ACTUAL:"+valoractual);
			
			if(valoractual>valoranterior) {
				valoranterior=valoractual;
				inicioanterior=inicioactual;
				finanterior=finactual;
				
			}
			
			
			
			pos=finactual;
		}
		
		System.out.println("INICIOFINAL:"+inicioanterior);
		System.out.println("FINFINAL"+finanterior);

		System.out.println("VALOR SECUENCIA MAS ALTA:"+valoranterior);
	
	}
	
	
	public static int sumar_sec(int arr[],int inicio,int fin) {
		int valor=0;
		
		for(int i=inicio;i<=fin;i++) {
			
				valor+=arr[i];
			
			System.out.println(valor);
		}
		
		
		
		return valor;
	}
	
	public static int encontrar_inicio_sec(int arr[],int pos) {
		
		while((pos<MAX)&&(arr[pos]==0)) {
			pos++;
		}
		System.out.println("INICIO"+pos);
		
		return pos;
	}
	
	public static int encontrar_fin_sec(int arr[],int pos) {
		
		while((pos<MAX-1) && ( !( (arr[pos]!=0)&&(arr[pos+1]==0) )  ) ) {
			pos++; 
		}
		System.out.println("FIN"+pos);

		return pos;
	}
}
