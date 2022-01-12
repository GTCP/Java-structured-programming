
public class EjemploDoWhile {
		public static void main (String [] args) {
		final int MAX = 10;
		final double interes = 4;
		double capital = 100;
		int anios = 0;
		do {
			capital += capital*interes/100;
			anios++;
		} while (anios < MAX);
		System.out.println(capital);
		}
		
}
