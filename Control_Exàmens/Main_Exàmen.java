package Control_Exàmens;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class Main_Exàmen {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	ArrayList <Examen> Examen = new ArrayList <Examen>();
	
	Data Data = new Data (20,02,2010);
	Hora Ho = new Hora (20,18);
	

	Examen ex1 = new Examen ("Mate","Mate1",Data, Ho);
	
	
	ex1.setData(Data);
	ex1.setHora(Ho);

	Data Data0 = new Data (20,02,2010);
	Hora Ho0 = new Hora (20,18);
	
	Examen ex2 = new Examen ("Valenciano","Val2",Data0,Ho0);
	
	Data Data1 = new Data (20,02,2010);
	Hora Ho1 = new Hora (20,18);
	
	ex2.setData(Data);
	ex2.setHora(Ho);
	
	
	Examen ex3 = new Examen ("Base de Datos","INF2",Data1,Ho1);
	
	
	Data Data2 = new Data (20,02,2010);
	Hora Ho2 = new Hora (20,18);
	
	ex3.setData(Data);
	ex3.setHora(Ho);
	
	Examen ex4 = new Examen ("Entornos","INF1",Data2,Ho2);

	
	ex4.setData(Data);
	ex4.setHora(Ho);
	

	
	Examen.add(ex1);
	Examen.add(ex2);
	Examen.add(ex3);
	Examen.add(ex4);
	
	System.out.println("-- FOR EACH --");

	for(int c=0;c<Examen.size();c++) {
		 System.out.println(Examen.get(c).toString());
	 }
	

	System.out.println("-- ITERATOR --");

	Iterator it = Examen.iterator();

	
	while(it.hasNext()) {
		System.out.println(it.next().toString());
	}


}

	
	

	
}




