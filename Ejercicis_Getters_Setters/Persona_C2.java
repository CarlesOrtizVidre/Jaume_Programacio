package Ejercicis_Getters_Setters;

public class Persona_C2 {

	private String nom;
	private String cognoms;
	private String DNI;
	private int edat;



public Persona_C2(String DNI,String nom,String cognoms, int edat) {
	
	this.DNI = DNI;
	this.nom = nom;
	this.cognoms = cognoms;
	this.edat = edat;

}

	public String getNom() {
	return nom;
	}
	public String getDNI() {
	return DNI;
	}
	public String getCognoms() {
	return cognoms;
	}
	public int getEdat() {
	return edat;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}

}