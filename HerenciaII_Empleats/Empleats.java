package HerenciaII_Empleats;

public class Empleats {

	
	protected String nombre;
	
	
	public Empleats (String nombre) {
		
		super();
		this.nombre=nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Empleats [Nombre = " + nombre + "]";
	}





















}
