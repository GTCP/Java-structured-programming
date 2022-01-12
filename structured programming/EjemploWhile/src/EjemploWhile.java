
public class EjemploWhile {
		public static void main (String [] args) {
			final int MAX = 10;
			final double interes = 4;
			double capital = 100;
			int anios = 1;
			while (anios< MAX) {
				capital += capital*interes/100;
				anios++;
			}
			System.out.println(capital);		
		}
}

