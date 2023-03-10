package Herencia_Astros;

public class Astros {
	
	protected double radioecuatorial;
	protected double rotacionsobreeje;
	protected double masa;
	protected double tempmedia;
	protected double gravedad;
	
	
	
	
	public Astros(double radioecuatorial, double rotacionsobreeje, double masa, double tempmedia, double gravedad) {

		this.radioecuatorial = radioecuatorial;
		this.rotacionsobreeje = rotacionsobreeje;
		this.masa = masa;
		this.tempmedia = tempmedia;
		this.gravedad = gravedad;
	}




	@Override
	public String toString() {
		return "Astros [radioecuatorial=" + radioecuatorial + ", rotacionsobreeje=" + rotacionsobreeje + ", masa="
				+ masa + ", tempmedia=" + tempmedia + ", gravedad=" + gravedad + "]";
	}
	
	

}
