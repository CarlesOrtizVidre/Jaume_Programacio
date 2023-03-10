package Interfícies;

public class Revistes {

	protected String codi;
	protected String Titol;
	protected double anyPubli;

	public Revistes (String codi, String Titol,double anyPubli) {
		

		this.anyPubli=anyPubli;
		this.Titol=Titol;
		this.codi=codi;
		
	}

	public String getCodi() {
	
		return codi;
	}

	public void setCodi(String codi) {
		this.codi = codi;
	}

	public String getTitol() {
		return Titol;
	}

	public void setTitol(String titol) {
		Titol = titol;
	}

	public double getAnyPubli() {
		return anyPubli;
	}

	public void setAnyPubli(double anyPubli) {
		this.anyPubli = anyPubli;
	}
}
