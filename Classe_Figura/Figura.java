package Classe_Figura;

public class Figura {

	private String codi;
	private double preu;
	private Superherois Heroi;
	private Dimensio Dimensions; 
	
public Figura (String codi, double preu, Superherois Heroi, Dimensio Dimensions) {
	
	this.codi=codi;
	this.preu=preu;
	this.Heroi=Heroi;
	this.Dimensions=Dimensions;
	
}

public String getCodi() {
	return codi;
}

public void setCodi(String codi) {
	this.codi = codi;
}

public double getPreu() {
	return preu;
}

public void setPreu(double preu) {
	this.preu = preu;
}

public Superherois getHeroi() {
	return Heroi;
}

public void setHeroi(Superherois descripcio) {
	Heroi = descripcio;
}

public Dimensio getDimensions() {
	return Dimensions;
}

public void setDimensions(Dimensio Dimensions) {
	this.Dimensions = Dimensions;
}

public void pujarPreu (double quantitat) {
	
	 this.preu += quantitat;
}
@Override
public String toString() {
	return "Figura [Nom: "+Heroi.getNom() +"  Codi: " +getCodi() + ", preu=" + preu + ", Descripcio=" + Heroi.getDescripcio() + ", Dimensions=" + Dimensions + "Te Capa:"+ Heroi.isCapa()+ "]";
}



}
