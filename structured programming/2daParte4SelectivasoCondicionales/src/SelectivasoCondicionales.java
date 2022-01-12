import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SelectivasoCondicionales {
	
	public static void main(String [] args) {
		final int NUEVA=29;
		final int MENGUANTE=22;
		final int LLENA=15;
		final int CRECIENTE=8;
		
		final int DATOAUERO1=1;
		final int DATOAUERO2=19;
		final int DATOEPACTA1=-1;
		final int DATOEPACTA2=11;
		final int DATOEPACTA3=30;
		
		int dia=0;
		int mes=0;
		int ano=0;
		int numeroAureo=0;
		int epacta=0;
		int edadLunar=0;
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingresar el dia:");
			dia=Integer.valueOf(entrada.readLine());
			System.out.println("Ingresar el mes:");
			mes=Integer.valueOf(entrada.readLine());
			System.out.println("Ingresar el año:");
			ano=Integer.valueOf(entrada.readLine());

			numeroAureo=((ano+DATOAUERO1)%DATOAUERO2);
			
			epacta=(((numeroAureo-1)*DATOEPACTA2)%DATOEPACTA3);
			
			switch(mes) {
				case 1: edadLunar=epacta+11+dia;break;
				case 2: edadLunar=epacta+12+dia;break;
				case 3: edadLunar=epacta+13+dia;break;
				case 4: edadLunar=epacta+2+dia;break;
				case 5: edadLunar=epacta+3+dia;break;
				case 6: edadLunar=epacta+4+dia;break;
				case 7:edadLunar=epacta+5+dia;break;
				case 8: edadLunar=epacta+6+dia;break;
				case 9: edadLunar=epacta+7+dia;break;
				case 10: edadLunar=epacta+8+dia;break;
				case 11: edadLunar=epacta+9+dia;break;
				case 12: edadLunar=epacta+10+dia;break;
			}
			
			if(edadLunar>NUEVA) { //29
			edadLunar=edadLunar%30;
			}
			
			System.out.println("PASARON "+edadLunar+" DIAS DE LA ULTIMA LUNA NUEVA");
			
			if((dia>=NUEVA)&&(edadLunar<CRECIENTE)) { 
				System.out.println("FASE LUNAR NUEVA");
			}
			else if((dia>=MENGUANTE)&&(dia<NUEVA)) {
				System.out.println("FASE LUNAR MENGUANTE");
			}
			else if((dia>=LLENA)&&(dia<MENGUANTE)) {
				System.out.println("FASE LUNAR LLENA");
			}
			else {
				System.out.println("FASE LUNAR CRECIENTE");
			}
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}
}
