
public class InvertirNegativo {

	public static void main(String [] args) {
		int longactual=5;
		int longanterior=-10;
		int dif=0;
			
		dif=longanterior-longactual;
		
		System.out.println(dif);
		
		if(dif<0) {
		dif=Math.abs(dif);
		}
		System.out.println("");

		System.out.println(dif);
	}
}
