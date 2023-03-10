package Control_Exàmens;

public class Hora {


	private int hora;
	private int min;

	
	public Hora (int hora, int min) {
		
		this.hora=hora;
		this.min=min;

				
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	

	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", min=" + min + "]";
	}


	
}
