package Herencia_Animal2;

public class Gato extends Mamifero{
	
	private String raza;


	public Gato (String nombre, String tipo_alimentacion, int edad,int gestacion, String raza) {
		
		super(nombre, tipo_alimentacion,edad,gestacion);
		this.raza=raza;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}




	
}
