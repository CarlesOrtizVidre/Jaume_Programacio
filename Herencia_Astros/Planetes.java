package Herencia_Astros;

public class Planetes {
	

	private String distanciasol;
	private String orbitaSol;
	private String tieneSatelites;
	
public Planetes(String distanciasol, String orbitaSol, String tieneSatelites) {
	
		super();
		this.distanciasol = distanciasol;
		this.orbitaSol = orbitaSol;
		this.tieneSatelites = tieneSatelites;
	}

public String getDistanciasol() {
	return distanciasol;
}

public void setDistanciasol(String distanciasol) {
	this.distanciasol = distanciasol;
}

public String getOrbitaSol() {
	return orbitaSol;
}

public void setOrbitaSol(String orbitaSol) {
	this.orbitaSol = orbitaSol;
}

public String getTieneSatelites() {
	return tieneSatelites;
}

public void setTieneSatelites(String tieneSatelites) {
	this.tieneSatelites = tieneSatelites;
}

@Override
public String toString() {
	return "Planetes [distanciasol=" + distanciasol + ", orbitaSol=" + orbitaSol + ", tieneSatelites=" + tieneSatelites
			+ "]";
}





}
