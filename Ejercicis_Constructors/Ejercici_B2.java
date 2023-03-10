package Ejercicis_Constructors;

import java.util.Scanner;

public class Ejercici_B2 {

public static void main(String args[]) {
		
		
		Scanner sc = new Scanner (System.in);


		Persona_B2 p1 = new Persona_B2 ("12313435M", "Mangel", "Bondia",85);
		Persona_B2 p2 = new Persona_B2 ("12345678K", "Robertico", "Potasio", 52);
		
		
		String cadena1 = p1.nom + " " + p1.cognoms + " " + p1.edat + " " + p1.DNI + " "; 
		String cadena2 = p2.nom + " " + p2.cognoms + " " + p2.edat + " " + p2.DNI + " "; 
		
		if (p1.edat > 18) {
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

