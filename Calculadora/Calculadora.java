package Calculadora;

public class Calculadora {

	
	private double real;//Raal
	private double in;//Imagi
	
	public Calculadora (double real, double in ) {
		
		this.real = real;
		this.in = in;
		
		
	}

	public double getReal() {
		
		return real;
	}
	public double getIn() {
		
		return in;
	}
	public void setReal(double real) {
		
		this.real = real;
	}
	public void setIn(double in) {
		
		this.in = in;
		
	}

	
	public  Calculadora Suma (Calculadora obj2) {
		
		double sumReal = this.real + obj2.real;
		double sumImg = this.in + obj2.in;
		
		Calculadora resultat = new Calculadora (sumReal, sumImg);
		
		return resultat;
				
		//return obj2;
	}
	public Calculadora Resta (Calculadora obj2) {
		
		double RestReal = this.real - obj2.real;
		double RestImg = this.in - obj2.in;
		
		Calculadora resultat =new Calculadora(RestReal, RestImg);
			
		return resultat;
		
	}
	public Calculadora Multiplicacio (Calculadora obj2) {
		
		double MultReal = this.real * obj2.real - this.in*obj2.in;
		double MultImg = this.in + obj2.in + this.in*obj2.in;
		
		
		Calculadora resultat =new Calculadora(MultReal, MultImg);
		
		return resultat;
		
	}
	public Calculadora Multiplicacion2 (Calculadora obj2, double nume) {
		
		double Mult1Real = this.real * nume;
		double Mult1Img = this.in * nume;
		
		Calculadora resultat =new Calculadora(Mult1Real, Mult1Img);
		
		return resultat;
		
	}
	
	public Calculadora Dividir (Calculadora obj2, double nume) {
		
		double DivReal = this.real * obj2.in + this.in * obj2.real / Math.pow(obj2.real, 2)+Math.pow(obj2.in, 2);
		double DivImg = this.in * obj2.real - this.real * obj2.in / Math.pow(obj2.real, 2)+Math.pow(obj2.in, 2);
		
		Calculadora resultat =new Calculadora(DivReal, DivImg);
		
		return resultat;
				
		
	}

	public String toString() {
		
		String imprimir;
		
		imprimir = "La parte real es: "+ this.real + " La parte imaginaria es: " + this.in+"i";
		
		return imprimir;
	}

	//public boolean equals(C2) {
		
//	}




}
