package Control_Exàmens;

public class Examen {

	private String Asignatura;
	private String Aula;
	private Data data;
	private Hora hora;

public Examen (String Asignatura, String Aula, Data data, Hora hora)  {
		
		this.Asignatura=Asignatura;
		this.Aula=Aula;
		this.data=data;
		this.hora=hora;
	}

public String getAsignatura() {
	return Asignatura;
}

public void setAsignatura(String asignatura) {
	Asignatura = asignatura;
}

public String getAula() {
	return Aula;
}

public void setAula(String aula) {
	Aula = aula;
}

public Data getData() {
	return data;
}

public void setData(Data data) {
	this.data = data;
}

public Hora getHora() {
	return hora;
}

public void setHora(Hora hora) {
	this.hora = hora;
}

@Override
public String toString() {
	return "Examen [Asignatura=" + Asignatura + ", Aula=" + Aula + ", data=" + data + ", hora=" + hora + "]";
}





	
}












