package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Exercici_1_ArrayList {

public static void main(String args [])  {
	
	Producte1  pa = new Producte1("Camisa",5);
	Producte1  alioli = new Producte1("Sudadera Semaforo", 20);
	Producte1  atun = new Producte1("Sudadera Nasa", 8);
	Producte1  ajonesa = new Producte1("Traje Espacial", 9);
	Producte1  ketchup = new Producte1("Sudadera Licenciado", 3);
	
	
	ArrayList <Producte1> llista = new ArrayList();

	
	llista.add(pa);
	llista.add(alioli);
	llista.add(atun);
	llista.add(ajonesa);
	llista.add(ketchup);
	
	Iterator it = llista.iterator();
	
	//System.out.println("\nAMb ITERATOr");
	
	while(it.hasNext()) {
		System.out.println(it.next().toString());
	}

	llista.remove(0);
	System.out.println(llista);
	
	llista.remove(0);
	System.out.println(llista);
	
	int x = llista.size();
	//System.out.println("ara te "+ x +"posicions");
	
	llista.add(3, new Producte1("Peix", 3));

	for (int i=0; i<llista.size();i++) {
		
		System.out.println(llista.get(i).toString());
	}
	
	//System.out.println("\nAmb FOR - EACH");
	// mostrem l'array amb bucle FOR-EACH
	
	for (Producte1 p:llista) {
		System.out.println(p.toString());    
	
	}
	
	// Esborrem tot l'ArrayList
	
	llista.clear();
	
	//System.out.println("\nAmb ITERATOR");
	
	Iterator it1 = llista.iterator();
	while(it1.hasNext())
		
		System.out.println(it1.next().toString());
	





}
}