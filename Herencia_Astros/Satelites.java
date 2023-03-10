package Herencia_Astros;

public class Satelites {
	
	private String distanciaplaneta;
	private String orbitaplanetaria;
	private String planetapertenece;
	
	
public Satelites(String distanciaplaneta, String orbitaplanetaria, String planetapertenece) {
		super();
		this.distanciaplaneta = distanciaplaneta;
		this.orbitaplanetaria = orbitaplanetaria;
		this.planetapertenece = planetapertenece;
	}


public String getDistanciaplaneta() {
	return distanciaplaneta;
}


public void setDistanciaplaneta(String distanciaplaneta) {
	this.distanciaplaneta = distanciaplaneta;
}


public String getOrbitaplanetaria() {
	return orbitaplanetaria;
}


public void setOrbitaplanetaria(String orbitaplanetaria) {
	this.orbitaplanetaria = orbitaplanetaria;
}


public String getPlanetapertenece() {
	return planetapertenece;
}


public void setPlanetapertenece(String planetapertenece) {
	this.planetapertenece = planetapertenece;
}


@Override
public String toString() {
	return "Satelites [distanciaplaneta=" + distanciaplaneta + ", orbitaplanetaria=" + orbitaplanetaria
			+ ", planetapertenece=" + planetapertenece + "]";
}
	



}
