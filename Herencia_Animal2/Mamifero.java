package Herencia_Animal2;

public class Mamifero extends Animal{

	public int gestacion;
	
	
public  Mamifero (String tipo_alimentacion, String nombre, int gestacion, int edad) {
	
	super(nombre, tipo_alimentacion, edad);
	this.gestacion=gestacion;
}




public int getGestacion() {
	return gestacion;
}


public void setGestacion(int gestacion) {
	this.gestacion = gestacion;
}

public String toString() {
	return "Animal [nombre=" + nombre + ", tipo_alimentacion=" + tipo_alimentacion + ", edad=" + edad + "]";
}




}
