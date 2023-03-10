package Ejercicis_Getters_Setters;

import java.util.Scanner;

public class Ejercici_C2 {


public static void main(String args[]) {
			
			
			Scanner sc = new Scanner (System.in);


			Persona_C2 p1 = new Persona_C2 ("12313435M", "Mangel", "Bondia",85);
			Persona_C2 p2 = new Persona_C2 ("12345678K", "Robertico", "Potasio", 52);
			
			
			String cadena1 = p1.getNom() + " " + p1.getCognoms() + " " + p1.getEdat() + " " + p1.getDNI() + " "; 
			String cadena2 = p2.getNom() + " " + p2.getCognoms() + " " + p2.getEdat() + " " + p2.getDNI() + " "; 
			
			if (p1.getEdat() > 18) {
				cadena1 += "Es major de edat";
			}
			else {
				cadena1 += "Es menor de edat";
			}
			
			if (p2.getEdat() > 18) {
				cadena2 += "Es major de edat";
			}
			else {
				cadena2 += "Es menor de edat";
			}
			
			
			System.out.println(cadena1);
			System.out.println(cadena2);
			
			
		}
		}


