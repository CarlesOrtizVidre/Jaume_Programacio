package Agenda_de_Contactes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Agenda_Main {

public static void main(String args[]) {
	
	Scanner teclat = new Scanner (System.in);
	
	int opcio = 0;
	
	ArrayList <Agenda> Agenda = new ArrayList <Agenda>();
	
	do {
	
	System.out.println("=================================================================");
	System.out.println("================== MENU AGENDA DE CONTACTES =====================");
	System.out.println("=================================================================");
	System.out.println("= 1. Inserir contactes a l'agenda ===============================");
	System.out.println("= 2. Consultar la informació de tots els contactes de l'agenda ==");
	System.out.println("= 3. Consultar la informacio d'un contacte de l'agenda (Per DNI)=");
	System.out.println("= 4. Esborrar un contacte de l'agenda  ==========================");
	System.out.println("= 5.Fi de programa ==============================================");
	System.out.println("=================================================================");
	opcio = teclat.nextInt();
	
	switch (opcio) {
	
	case 1:
		
		Contactes(Agenda);

	break;
	case 2:
		
	Iterator it = Agenda.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		
	break;
	case 3:
		
	
		Mostrar_Contactes_DNI(Agenda);
		
		
		
	break;
	case 4:
		
		Borar_Contactes (Agenda);
		
	break;
	case 5:
		
		System.out.println("FI DE PROGRAMA");
		
	break;
	
	
	}//switch
	}while(opcio != 5);
	
}
	
	public static void Contactes(ArrayList <Agenda> Agenda) {
		

		Scanner teclat = new Scanner (System.in);
		
		Agenda p1 = new Agenda ("","","","",0);
		
	
 
		System.out.println("Nom del contacte: ");
		p1.setNom(teclat.nextLine());
		teclat.nextLine();
		System.out.println("Cognoms del contacte: ");
		p1.setCognoms(teclat.nextLine());
		System.out.println("DNI del contacte: ");
		p1.setDNI(teclat.nextLine());
		System.out.println("Telefon del contacte: ");
		p1.setTelefono(teclat.nextInt());
		
		teclat.nextLine();
		System.out.println("Email del contacte: ");
		p1.setEmail(teclat.nextLine());
	
		
		
		Agenda.add(p1);
		
	
	}

	public static void Mostrar_Contactes_DNI(ArrayList <Agenda> Agenda) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("DNI del contacte: ");
		String dni=sc.nextLine();

		for(Agenda o: Agenda) {
			 o.getDNI().equals(dni);
		 if(o.getDNI().equals(dni)) {
			 System.out.println(o.toString());
		 }
		}
	}
		
		public static void Borar_Contactes (ArrayList <Agenda> Agenda) {
		
			int posic;
			Scanner tc = new Scanner (System.in);
		
			System.out.println("Contacte q vols borrar ");
			posic=tc.nextInt();
		
			Agenda.remove(posic);
			
			Iterator it = Agenda.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());
				
			}
		
		
	}
}

