package HerenciaII_Empleats;

public class Oficial extends Empleats{
	
	public Oficial (String nombre) {
		
		super(nombre);
	}

	@Override
	public String toString() {
		return "Oficial [nombre=" + nombre + "] -> Oficial";
	}

	
	
}
