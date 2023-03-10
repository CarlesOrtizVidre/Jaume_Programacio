package Figuras;

public class Círculo implements iFigura2D{

	private double radio;
	
	public Círculo (double radio) {
		this.radio=radio;
	}
	
	
		
	public double getRadio() {
		return radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}



	public double perimetro() {
		return radio*4;
		
	}
	
	public double area() { 	
		return radio*radio;
	}
	
	public void escalar(double escala) {
		
		radio = radio * escala;
	}

	@Override
	public void imprimir() {
		System.out.println("Círculo [radio=" + radio + ", perimetro()=" + perimetro() + ", area()=" + area() + "]");
	}

	
		
	} 


