package Herencia_Animal2;

public class Caballo extends Mamifero{
	
	private String comida;
	private int ejercicio;



	public Caballo (String nombre, String tipo_alimentacion, int edad, int gestacion, String raza) {
		
		super(nombre, tipo_alimentacion,edad,gestacion);
		this.comida=comida;
		this.ejercicio=ejercicio;
	}


	public String getComida() {
		return comida;
	}


	public void setComida(String comida) {
		this.comida = comida;
	}


	public int getEjercicio() {
		return ejercicio;
	}


	public void setEjercicio(int ejercicio) {
		this.ejercicio = ejercicio;
	}

	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo_alimentacion=" + tipo_alimentacion + ", edad=" + edad + ", gestacion="+gestacion+",comida="+"]";
	}


	}








