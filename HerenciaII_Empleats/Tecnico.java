package HerenciaII_Empleats;

public class Tecnico extends Empleats{
	
	public Tecnico (String nombre) {
		
		super(nombre);
	}

	@Override
	public String toString() {
		return "Tecnico [" + nombre + "] -> Tecnico";
	}

	
}
