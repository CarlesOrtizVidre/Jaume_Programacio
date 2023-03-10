package Mascotas;

public abstract class Mascotas {

	protected String nombre;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;

public Mascotas (String nombre, int edad, String estado, String fechaNacimiento) {
	
	this.nombre=nombre;
	this.edad=edad;
	this.estado=estado;
	this.fechaNacimiento=fechaNacimiento;
}




public String getNombre() {
	return nombre;
}




public void setNombre(String nombre) {
	this.nombre = nombre;
}




public int getEdad() {
	return edad;
}




public void setEdad(int edad) {
	this.edad = edad;
}




public String getEstado() {
	return estado;
}




public void setEstado(String estado) {
	this.estado = estado;
}




public String getFechaNacimiento() {
	return fechaNacimiento;
}




public void setFechaNacimiento(String fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}




public abstract void muestra();

public abstract void habla();

public void cumpleaños() {
	
	this.edad=this.edad + 1;
}
	
public void morir() {
	
	this.estado="Muerto";
}



}

	



