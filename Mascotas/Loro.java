package Mascotas;

public class Loro extends Aves{
	
	private String origen;
	private boolean habla;
	
	public Loro (String nombre, int edad, String estado, String fechaNacimiento,String origen, boolean habla, String pico, boolean vuela) {
		
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen=origen;
		this.habla=habla;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean getHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
	}
	
	@Override
	public void muestra() {
		System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNacimiento());
        System.out.println("Pico   : " + this.getPico());
        System.out.println("Vuela  : " + this.getVuela());
        System.out.println("Origen : " + this.getOrigen());
        System.out.println("Habla  : " + this.getHabla());
	}
	
	public void saluda() {
		
		System.out.println("Hola");
	}


	public  void volar() {
		this.setEstado("Volando");
	}

	

	@Override
	public void habla() {
		System.out.println("Hola TETE");
	}

	
	
	
}
