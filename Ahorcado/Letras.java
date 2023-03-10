package Ahorcado;

import java.util.ArrayList;

import Mascotas.Mascotas;

public class Letras {
	
	private String Letras;
	private String LetrasErroneas;
	private int puntos;

	public Letras (String Letras, String LetrasErroneas, int puntos) {
		
		this.Letras=Letras;
		this.LetrasErroneas=LetrasErroneas;
		this.puntos=puntos; 
	}
	
	

	public String getLetras() {
		return Letras;
	}


	public void setLetras(String letras) {
		Letras = letras;
	}


	public String getLetrasErroneas() {
		return LetrasErroneas;
	}


	public void setLetrasErroneas(String letrasErroneas) {
		LetrasErroneas = letrasErroneas;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}




	
	void puntos() {
		
		if(this.Letras == this.Letras) {
			
			this.puntos += 4;
		}
		else {
			
			this.puntos -= 1;
		}
	}

	
}
