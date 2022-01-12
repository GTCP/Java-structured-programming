package objetos_practico1;
public class Punto {
	private double x;
	private double y;
	Punto(){
		x = 0;
		y = 0;
	}
	Punto(double _x,double _y) {
		x=_x;
		y=_y;
	}
	public double coordX() {
		return x;
	}
	public double coordY() {
		return y;
	}
	public double promedio_ejes() {
		return promedio();
	}
	private double promedio() {
		return (x+y)/2;
	}
	public double distancia_a_cero() {
		return (Math.sqrt(x)+ Math.pow(x,y));
	}
	public void llevar_primer_cuadrante() {
		if (x<0) {
			x=-x;
		}
		if(y<0) {
			y=-y;
		}
	}
	public void setearxy(double _x,double _y) {
		x=_x;
		y=_y;
	}
}