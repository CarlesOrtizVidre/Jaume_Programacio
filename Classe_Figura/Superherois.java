package Classe_Figura;

public class Superherois {

	private String Nom;
	private String Descripcio;
	private boolean Capa; 

public Superherois (String Nom, String Descripcio, boolean Capa)  {
	
	this.Nom=Nom;
	this.Descripcio=Descripcio;
	this.Capa=false;
	
	
}

public String getNom() {
	return Nom;
}

public void setNom(String nom) {
	Nom = nom;
}

public String getDescripcio() {
	return Descripcio;
}

public void setDescripcio(String descripcio) {
	Descripcio = descripcio;
}

public boolean isCapa() {
	return Capa;
}

public void setCapa(boolean capa) {
	Capa = capa;
}

@Override
public String toString() {
	return "Superherois [Nom=" + Nom + ", Descripcio=" + Descripcio + ", Capa=" + Capa + "]";
}




}//class

