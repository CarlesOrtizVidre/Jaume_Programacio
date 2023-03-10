package Herencia_Animal1;

public class Animal {
	
	 protected String nombre;
	 protected String tipo_alimentacion;
	 protected int edad;
	
public Animal (String nombre, String tipo_alimentacion, int edad) {
	
	this.nombre=nombre;
	this.tipo_alimentacion=tipo_alimentacion;
	this.edad=edad;	
}

@Override
public String toString() {
	return "Animal [nombre=" + nombre + ", tipo_alimentacion=" + tipo_alimentacion + ", edad=" + edad + "]";
}





}
