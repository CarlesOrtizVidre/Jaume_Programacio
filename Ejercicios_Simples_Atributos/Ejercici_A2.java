package Ejercicios_Simples_Atributos;

import java.util.Scanner;

public class Ejercici_A2 {

public static void main(String args[]) {
	
	
	Scanner sc = new Scanner (System.in);


	Persona_A2 persona1 = new Persona_A2 ();
	Persona_A2 p2 = new Persona_A2 ();
	
	System.out.println("Introduce los datos de la primera persona: ");
	System.out.println("Nom: ");
	persona1.nom=sc.nextLine();
	System.out.println("Cognoms: ");
	persona1.cognoms=sc.nextLine();
	System.out.println("Edat: ");
	persona1.edat=sc.nextInt();
	System.out.println("DNI: "); 
	persona1.DNI=sc.nextLine();
	
	System.out.println("Introduce los datos de la segona persona: ");
	System.out.println("Nom: ");
	p2.nom=sc.nextLine();
	System.out.println("Cognoms: ");
	p2.cognoms=sc.nextLine();
	System.out.println("Edat: ");
	p2.edat=sc.nextInt();
	System.out.println("DNI: ");
	p2.DNI=sc.nextLine();

	
	String cadena1 = persona1.nom + " " + persona1.cognoms + " " + persona1.edat + " " + persona1.DNI + " "; 
	String cadena2 = p2.nom + " " + p2.cognoms + " " + p2.edat + " " + p2.DNI + " "; 
	
	if (persona1.edat >= 18) {
		cadena1 += "Es major de edat";
	}
	else {
		cadena1 += "Es menor de edat";
	}
	
	if (p2.edat > 18) {
		cadena2 += "Es major de edat";
	}
	else {
		cadena2 += "Es menor de edat";
	}
	
	
	System.out.println(cadena1);
	System.out.println(cadena2);
	
	
}
}






















