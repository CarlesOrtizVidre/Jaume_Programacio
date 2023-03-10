package Ejercicis_Getters_Setters;

public class Articulo_C4 {

	
	
	private String nombre;
	private double precio;
	private int IVA;
	private int cuantosQuedan;






public Articulo_C4 (String nombre, double precio, int IVA, int cuantosQuedan) {
	

if(nombre.equals("")) {
	System.err.println("ERROR el nom no pot estar buit");
}
else if(precio <= 0) {
	System.err.println("ERROR el precio no pot ser menor a 0");
}
else if(IVA != 21) {
	System.err.println("ERROR el IVA no pot ser diferent a 21");
}
else if(cuantosQuedan < 0) {
	System.err.println("ERROR no pueden quedar menos de 0");
}
else {
	this.nombre = nombre;
	this.precio = precio;
	this.IVA = IVA;
	this.cuantosQuedan = cuantosQuedan;
}

}

public String getNombre() {
	return nombre;
}
public double getPrecio() {
	return precio;
}
public int getIVA() {
	return IVA;
}
public int getCuantosQuedan() {
	return cuantosQuedan;
}

public void setNombre (String nombre) {
	if(nombre.equals("")) {
		System.out.println("ERROR el nombre no puede estar vacio");
	}
	else {
		this.nombre = nombre; 
	}
}

public void setPrecio (double precio) {
	if(precio < 0) {
		System.out.println("ERROR el preu no pot ser menor a 0");
	}
	else {
		this.precio = precio; 
	}
}
public void setIVA (int IVA) {
	if(IVA != 21) {
		System.out.println("ERROR el IVA no puede ser diferent a 21");
	}
	else {
		this.IVA = IVA; 
	}
}
public void setCuantosQuedan (int cuantosQuedan) {
	if(cuantosQuedan < 0) {
		System.out.println("ERROR cuantosQuedan no pots ser menor a 0");
	}
	else {
		this.cuantosQuedan = cuantosQuedan; 
	}
}
}
