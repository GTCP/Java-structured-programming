package objetos_practico1;

public class objetos_practico1 {

	public static void main(String[] args) {
		Punto p;
		p = new Punto();
		System.out.println(p.coordX());
		System.out.println(p.coordY());
		System.out.println("distancia a 0: "+p.distancia_a_cero());
		System.out.println("promedio de ejes: "+p.promedio_ejes());	
		p.setearxy(-5, -4);
		p.llevar_primer_cuadrante();
		System.out.println(p.coordX());
		System.out.println(p.coordY());		
	}
}
