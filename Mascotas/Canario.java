package Mascotas;

public class Canario extends Aves{
	
	private String color;
	private boolean canta;
	
	public Canario (String nombre, int edad, String estado, String fechaNacimiento,String color, boolean canta, String pico, boolean vuela) {
		
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color=color;
		this.canta=canta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}



	@Override
	public void muestra() {

        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNacimiento());
        System.out.println("Pico   : " + this.getPico());
        System.out.println("Vuela  : " + this.getVuela());
        System.out.println("Color  : " + this.getColor());
        System.out.println("Canta  : " + this.getCanta());
    }
	
	public void habla() {
		
		System.out.println( "PIO PIO");
	}

	@Override
	public void volar() {
		System.out.println( "Pot volar");
	}
	
	public void saluda() {
		System.out.println("Hola hola, como estas?");
	}
}
