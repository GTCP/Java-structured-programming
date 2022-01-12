
import java.util.Random;
/*
Se tiene una matriz de caracteres de tamanio 4*20 de secuencias de caracteres entre 'a' y 'z' (por cada fila), separadas por espacios ' '.
La matriz esta precargada, y ademas cada fila empieza y termina con uno o mas separadores espacios. Se pide realizar un programa que:
_por cada secuencia, agregue en un arreglo de enteros de tamanio 4*20 inicializado con ceros la cantidad de vocales que tiene cada secuencia.
Cada agregado en el arreglo se debe realizar de forma consecutiva de izquierda a derecha y sin separadores.
*/

public class Parcial {

public static final double probabilidad_letra = 0.4;
	public static final int MAXFILA = 4;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final int MAXCOLUMNA = 20;
	
	public static final int MAX = MAXFILA * MAXCOLUMNA;
public static void main(String[] args) {

	int[] arrint;
	
	char[][] matchar;
	
	arrint = new int[MAX];
	
	matchar = new char[MAXFILA][MAXCOLUMNA];
	
	cargar_arreglo_cero(arrint);
	imprimir_arreglo_secuencias_int(arrint);
	cargar_matriz_aleatorio_secuencias_char(matchar);
	imprimir_matriz_char(matchar);
	// RESOLVER EL ENUNCIADO DENTRO DEL METODO QUE SIGUE:
	// realizar_segundo_ejercicio(...)
	
	realizar_segundo_ejercicio(matchar, arrint);
	imprimir_arreglo_secuencias_int(arrint);
}

public static void realizar_segundo_ejercicio(char[][] matchar, int[] arrint) {
int sumaDeVocales=0;
int inicio = 0;
int fin = -1;
int pos=MINVALOR;
for (int fila = 0; fila <MAXFILA; fila++) {
	inicio=0;//TE FALTO
	fin=-1;//TE FALTO
	
//	while (inicio < MAX) {
	while(inicio<MAXCOLUMNA) {
		
		inicio = inicioSecuencia(matchar[fila], fin + 1);
		
//		if (inicio < MAX) {
		if(inicio<MAXCOLUMNA-1) {
			
			fin = finSecuencia(matchar[fila], inicio);
			sumaDeVocales = SumaDeVocales(matchar[fila],inicio, fin);
		
			if(sumaDeVocales!=0){
				pos=traspaso_de_arreglo(arrint,sumaDeVocales,pos);         
			}
	//	fin=inicio;
		inicio=fin;	//AL REVEZ
		}
		else {//TE FALTO
			inicio=MAXCOLUMNA;//TE FALTO
		}//TE FALTO
    }


}
}
public static int traspaso_de_arreglo(int[]arrint,int sumaDeVocales, int pos) {
       

arrint[pos] = sumaDeVocales;

return pos +2;
}

public static int SumaDeVocales(char[] arreglo,int inicio, int fin) {
int suma=0;
for (int i = inicio; i <= fin; i++) {
char caracter=arreglo[i];
if(EsVocal(caracter)){
suma++;
}
}

return suma;

}
public  static boolean EsVocal(char caracter) {
switch (caracter){
 case 'a': case 'e':case 'i': case 'o': case 'u': case 'A': case 'E':case 'I': case 'O': case 'U': {
  return true;
 }
 default:{
 return false;
 }
}
}
public static int inicioSecuencia(char[] arreglo, int fin) {

int pos = fin;
while (pos < MAXCOLUMNA-1 && arreglo[pos] == ' ') {
pos++;
}
return pos;
}

public static int finSecuencia(char[] arreglo, int inicio) {

int pos = inicio;
while (pos < MAXCOLUMNA-1 && arreglo[pos] != ' ') {
pos++;
}
return pos-1;

}
public static void cargar_arreglo_cero(int[] arr) {
arr[0] = 0;
arr[MAX - 1] = 0;
for (int pos = 0; pos < MAX - 1; pos++) {
arr[pos]= 0;
}
}

public static void cargar_arreglo_aleatorio_secuencias_char(char[] arr) {
Random r = new Random();
arr[0] = ' ';
arr[MAXCOLUMNA - 1] = ' ';
for (int pos = 1; pos < MAXCOLUMNA - 1; pos++) {
if (r.nextDouble() > probabilidad_letra) {
arr[pos] = (char) (r.nextInt(26) + 'a');
} else {
arr[pos] = ' ';
}
}
}

public static void cargar_matriz_aleatorio_secuencias_char(char[][] mat) {
for (int fila = 0; fila < MAXFILA; fila++) {
cargar_arreglo_aleatorio_secuencias_char(mat[fila]);
}
System.out.println("");
}
public static void imprimir_matriz_char(char [][] mat){
for (int fila = 0; fila < MAXFILA; fila++){
System.out.print("|");
for (int columna = 0; columna < MAXCOLUMNA; columna++){
System.out.print(mat[fila][columna]+"|");
}
System.out.println("");
}
}
public static void imprimir_arreglo_secuencias_int(int[] arr) {
System.out.print("Arreglo de secuencias int\n|");
for (int pos = 0; pos < MAX; pos++) {
System.out.print(arr[pos] + "|");
}
System.out.print("\n");
}
}