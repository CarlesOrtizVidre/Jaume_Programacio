package Classe_Figura;

public class Dimensio {

	private double alt;
	private double ample;
	private double profunditat;
	private double volmax;

public Dimensio (double alt, double ample, double profunditat, double volmax)  {
	
	this.alt=alt;
	this.ample=ample;
	this.profunditat=profunditat;
	this.volmax=volmax;
}

public Dimensio()  {
	
	this.alt=0;
	this.ample=0;
	this.profunditat=0;
	this.volmax=0;
}

public double getAlt() {
	return alt;
}


public void setAlt(double alt) {
	this.alt = alt;
}


public double getAmple() {
	return ample;
}


public void setAmple(double ample) {
	this.ample = ample;
}


public double getProfunditat() {
	return profunditat;
}


public void setProfunditat(double profunditat) {
	this.profunditat = profunditat;
}

public double getVolumnen(double volmax) {
	
	return volmax = this.alt * this.ample * this.profunditat;
}

public void setVolumen(double volmax) {
	this.volmax = volmax;
}


@Override
public String toString() {
	return "Dimensio [alt=" + alt + ", ample=" + ample + ", profunditat=" + profunditat + "]";
	
}

public String toString2() {
	return "Dimensio [alt=" + alt + ", ample=" + ample + ", profunditat=" + profunditat +"Volumen maxim :" + this.volmax +"]";
	
	
	
}








}//class
