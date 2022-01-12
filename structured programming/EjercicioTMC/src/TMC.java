import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TMC {

	
	  public static void main(String[] args){
		double t = 0.5; //TIEMPO TRANSCURRIDO
		double H = 2.4; 	//H ES LA ALTURA DEL AGUA EN EL TANQUE

		double E = 5;// CAUDAL CONSTANTE INGRESADO
		double S = 2;// CAUDAL CONSTANTE SALIDA
		double A = 3; //AREA DEL TANQUE
		double C = 6; 	//C CUPO  TOTAL DE AGUA EN EL TANQUE(ALTURA MAXIMA QUE PUEDE LLEGAREL AGUA)
		boolean comienzoVaciado=false;
		double Hb, VA = 0;
		int i = 0;
		int num = 0;
// switch() {
 
 //}

		while (H < C) { //llena el tanque hasta que llega a tope
			i++;
			Hb = tiempoRespectoAnterior (H, E, S,ta(t, A));
			H = Hb;
			VA= volumenAgua (A, H);
			//System.out.println(formatearDecimales(Hb, 3) + "||" + formatearDecimales(VA, 4));
			while (((C/2) < formatearDecimales(Hb, 3))&& (num != 1)) {
				System.out.println("primer valor que supero la mitad fue a los " + tiempoTranscurrido(i,t,comienzoVaciado) + " segundos");//ESTO ESTA BIEN
				System.out.println("iteraciones primer valor que supero la mitad:"+i);//ESTO ESTA BIEN
				num = 1;

			}
		}
		System.out.println("el tanque se llenó a los " + tiempoTranscurrido(i,t,comienzoVaciado) + " segundos");//ESTA BIEN
		System.out.println("ITERACINES AL LLENARSE:"+i); // ESTA BIEN
		
		while (H > 0) { //vacia tanque hasta 0
			i++;
			comienzoVaciado=true;
			Hb = tiempoRespectoAnterior (H, 0, S,ta(t, A));
			H = Hb;
			VA= volumenAgua (A, H);
			//System.out.println(formatearDecimales(Hb, 3) + "||" + formatearDecimales(VA, 4));
		}
		System.out.println("el tanque se vació a los " + tiempoTranscurrido(i,t,comienzoVaciado) + " segundos");
	}
	public static double tiempoTranscurrido (int i, double t,boolean comienzoVaciado) {
		
		if(comienzoVaciado) {
			i=i-1;			
			System.out.println("Iteraciones al vaciarse:"+i);
		}
		return i * t;
	}
	public static double tiempoRespectoAnterior (double tiempoAnterior, double entradaActual, double salidaActual, double ta) {
		double tiempoActual = tiempoAnterior + (entradaActual - salidaActual) * ta;
		return tiempoActual;
	}
	public static double ta (double t, double A) {
		return t/A;
	}
	public static double volumenAgua (double A, double tiempoAnterior){
		double volumen = tiempoAnterior * A;
		return volumen;
	}
	public static Double formatearDecimales(Double numero, Integer numeroDecimales) { //redondea los decimales innecesarios
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
		} 
	
	public static double obtener_double_valido() {
		double numero=0;
		boolean salidaDoWhile=false;
	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
		do {
			try {
			System.out.println("Ingresa un numero:");
			numero=Double.valueOf(entrada.readLine());
			salidaDoWhile=true;
			}
			catch(Exception exc){
			System.out.println("Error al ingresar");
			}
		}while(!salidaDoWhile);
	
		return numero;
	}
}	
