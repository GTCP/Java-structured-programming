import java.io.BufferedReader;
import java.io.InputStreamReader;
//Se tiene un arreglo de enteros de tama�o 20 de secuencias de n�meros entre 1 y 9, separadas por 0. El arreglo esta precargado, y adem�s empieza y 
//termina con uno o m�s separadores 0. Considere para los siguientes ejercicios este tipo de arreglo.

//Hacer un programa que dado el arreglo definido y precargado, y un n�mero entero ingresado por el usuario, copie de forma continua las secuencias de 
//tama�o igual al n�mero ingresado en otro arreglo de iguales caracter�sticas e inicializado con 0. La copia en este �ltimo arreglo deben comenzar desde
//el principio del mismo.
public class Arreglos {
	final static int MAX=20;
	public static void main(String[] args) {
		int arr[]= {0,0,10,5,0,4,2,0,1,4,1,0,6,0,4,2,0,4,2,0};
		int aux[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};	
		int entero;
		int inicio=0;
		int fin=-1;
		int pos=0;
		int sumaSec;
		int ubicacion=0;
		entero=obtener_entero_valido();
		imprimir_arreglo_entero(arr);
		while(pos<MAX-1) {
			inicio=obtener_inicio_sec(arr,fin+1);
			fin=obtener_fin_sec(arr,inicio);
			sumaSec=obtener_suma_sec(arr,inicio,fin);		
			if(sumaSec==entero) {
				System.out.println("COPIE");
				copiar_sec_arreglo(arr,aux,inicio,fin,ubicacion);
				ubicacion+=fin-inicio+1;//en caso de que vallan separados por 0 se le agrega un +1
				pos=inicio;
			}
			pos=fin;	
		}
		System.out.println("");
		imprimir_arreglo_entero(aux);
	}
	public static int obtener_entero_valido() {
		int entero=0;
		boolean salidaDoWhile=false;
	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
		do {
			try {
			System.out.println("Ingresa un numero:");
			entero=Integer.valueOf(entrada.readLine());
			salidaDoWhile=true;
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			}
		}while(!salidaDoWhile);
	
		return entero;
	}
	public static void copiar_sec_arreglo(int arr[],int aux[],int inicio,int fin,int posInicioCopiar) {
		System.out.println("POS PARA COPIAR:"+posInicioCopiar);
		for(int i=0;i<fin-inicio+1;i++){
			aux[posInicioCopiar+i]=arr[inicio+i];
		}
	}
	public static int obtener_inicio_sec(int arr[],int pos) {
		while((pos<MAX)&&(arr[pos]==0)) {
			pos++;
		}
		return  pos;
	}
	public static int obtener_fin_sec(int arr[],int pos) {
		while((pos<MAX)&&(arr[pos]!=0)) {
			pos++;
		}
		return  pos-1;
	}
	public static int obtener_suma_sec(int arr[],int inicio,int fin) {
		int suma=0;
		for(int i=inicio;i<=fin;i++) {
				suma+=arr[i];
			
		}
		return suma;
	}
	public static void corrimiento_izquierda(int arr[],int inicio,int fin) {
		for(int i=0;i<=fin-inicio+1;i++) {
			for(int j=inicio;j<MAX-1;j++) {
				arr[j]=arr[j+1];
			}
		}
	}
	public static void imprimir_arreglo_entero(int arr[]) {
		for(int i=0;i<MAX;i++) {
			System.out.print("[");
			System.out.print(arr[i]);
			System.out.print("]");
		}
	}
}
