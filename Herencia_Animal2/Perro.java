package Herencia_Animal2;

public class Perro extends Mamifero{
	
	protected String raza;


	public Perro(String nombre, String tipo_alimentacion, int edad, int gestacion, String raza) {
		
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
