package Figuras;

public class Cuadrado implements iFigura2D {
	
	private double lado;
	
	public Cuadrado (double lado) {
		this.lado=lado;
	}
	
	

	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	public double perimetro() {
		return lado*4;
		
	}
	
	
	public double area() { 	
		return Math.pow(lado,2);
	}
	
	public void escalar(double escala) {
		
	lado = lado * escala;
	}

	@Override
	public void imprimir() {
		 System.out.println("Cuadrado [lado=" + lado + ", perimetro()=" + perimetro() + ", area()=" + area() + "]");
	}
	
	
}
