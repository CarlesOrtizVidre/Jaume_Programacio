package Figuras;

public class Triángulo {
	
	private double ancho;
	private double alto;
	
	public Triángulo (double ancho, double alto) {
		this.alto=alto;
		this.ancho=ancho;
	}
	
	public double perimetro() {
		return ancho*2 + alto*2;
		
	}
	
	public double area() { 	
		return ancho*alto;
	}
	
	public void escalar(double escala) {
		
		ancho = ancho * escala;
		alto = alto * escala;
	}

	
	public void imprimir() {
		System.out.println("Triángulo [ancho=" + ancho + ", alto=" + alto + ", perimetro()=" + perimetro() + ", area()=" + area()
				+ "]");
	}
}
