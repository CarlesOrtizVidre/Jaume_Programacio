package Classe_Figura;

import java.util.ArrayList;

public class Colecció {

	private String nomColeccio;

ArrayList <Figura> llistaFigures;

public Colecció (String nomColeccio) {
	
	this.nomColeccio=nomColeccio;
	llistaFigures=new ArrayList<>();
}


	public String getNumColeccio() {
		return nomColeccio;
	}


	public void setNumColeccio(String nomColeccio) {
		this.nomColeccio = nomColeccio;
	}



	
	public void añadirFigura(Figura fig) {
		
		llistaFigures.add(fig);
	}

	public void pujarPreu (double quantitat, String id) {
		
		for(Figura f: llistaFigures) {
			if(f.getCodi()==id) {
				f.setPreu(quantitat);
			}
	}
	}
	
	public Figura mesCar() {
		double preuMajor = 0.0;
		Figura fMajor = null;
	
	for(Figura f: llistaFigures) {
		if(f.getPreu()>preuMajor) {
			preuMajor = f.getPreu();
			fMajor= f;
		}
		
	}
	return fMajor;

	}
	
	public String ambCapa() {
		for(Figura f: llistaFigures) {
			if(f.getHeroi().isCapa()== true) {
			System.out.println();
			}
		}

	return nomColeccio;

		
	}
	
	public String getValorColeccio() {
		
		String cadena;
		double preutotal = 0;
		
		for (Figura f: llistaFigures) {
			preutotal += f.getPreu();
			
		}
		cadena="El valor de la coleccio es de:" + preutotal;
		return cadena;
	}
	
	public String getVolumColeccio() {
		
		String cadena;
		double vol = 0;
		
		for (Figura f: llistaFigures) {
			vol = f.getPreu();
			vol=vol+200;
		}
		cadena="El valor de la coleccio es de:" + vol;
		return cadena;
	}
	


	@Override
	public String toString() {
		return "Colecció [numColeccio=" + nomColeccio + ", llistaFigures=" + llistaFigures + "]";
	}

	public String toString1() {
		return "llista Figures = " +llistaFigures;
	}


}
