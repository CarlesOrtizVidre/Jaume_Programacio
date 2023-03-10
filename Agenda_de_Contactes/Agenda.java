package Agenda_de_Contactes;

import java.util.Iterator;
import java.util.Scanner;

public class Agenda {

	private String nom;
	private String cognoms;
	private int telefono;
	private String DNI;
	private String email;
	
	
	public Agenda (String nom,String cognoms,String email, String DNI, int telefono) {
	
		this.nom = nom;
		this.cognoms = cognoms;
		this.telefono=telefono;
		this.DNI=DNI;
		this.email=email;
	
	}

//SET

public void setNom (String nom) {
	
	this.nom=nom;
	
}

public void setCognoms (String cognoms) {
	
	this.cognoms=cognoms;
	
}
public void setDNI(String DNI) {
	
	this.DNI=DNI;
	
}
public void setEmail(String email) {
	
	this.email=email;
	
}
public void setTelefono (int telefono) {
	
	this.telefono=telefono;
	
}

//GET

public String getNom () {
	
	return nom;
}
public String getCognoms () {
	
	return cognoms;
}
public String getDNI () {
	
	return DNI;
}
public int getTelefono () {
	
	return telefono;
}
public String getEmail () {
	
	return email;
}

@Override
public String toString() {
	return "Agenda [nom=" + nom + ", cognoms=" + cognoms + ", telefono=" + telefono + ", DNI=" + DNI + ", email="
			+ email + "]";
}




}


	

