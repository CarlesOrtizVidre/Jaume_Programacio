package Calculadora;

import java.util.Scanner;

import Ejercicis_Getters_Setters.Punto_C1;

public class Calculadora_Main {

public static void main(String[] args) {
	
	Calculadora Calc1 = new Calculadora (0,0);
	Calculadora Calc2 = new Calculadora (0,0);
	Calculadora resultat = new Calculadora (0,0);
	
	Scanner texto = new Scanner (System.in);
	
	
	int opcio;
	
	do {
		
	System.out.println("===============================================");
	System.out.println("================= CALCULADORA =================");
	System.out.println("===============================================");
	System.out.println("1. SUMA");
	System.out.println("2. RESTA");
	System.out.println("3. MULTIPLICA");
	System.out.println("4. MULTIPLICAR 2");
	System.out.println("5. DIVIDIR");
	System.out.println("===============================================");
	opcio = texto.nextInt();
	
	System.out.println("Donam un valor per A:");
	Calc1.setReal(texto.nextDouble());
	System.out.println("Donam un valor per B:");
	Calc1.setIn(texto.nextDouble());
	System.out.println("Donam un valor per C:");
	Calc2.setIn(texto.nextInt());
	System.out.println("Donam un valor per D:");
	Calc2.setReal(texto.nextInt());
	
	switch (opcio) {
	
	case 1:
		
		System.out.println("==== HAS ELEGIT LA OPCIO DE SUMAR ====");
		System.out.println("");
		 
		System.out.println("FORMULA: (a,b) + (c,d) = (a + c, b + d) =");
		System.out.println();
		
		resultat=Calc1.Suma(Calc2);
		
		System.out.println(resultat);
		
	break;
	case 2:
		
		System.out.println("===== HAS ELEGIT LA OPCIO DE RESTA ====");
		System.out.println("");
		 
		System.out.println("FORMULA: (a,b) - (cb,d) = (a - c , b - d) =");

		resultat=Calc1.Suma(Calc2);
		
		System.out.println(resultat);
		
	break;
	case 3:
		
		System.out.println("===== HAS ELEGIT LA OPCIO DE MULTIPLICAR ====");
		System.out.println("");
		 
		System.out.println("FORMULA: (a,b) * (c,d) = (a * c - b * d, a * d + b * c) =");
	
		resultat=Calc1.Suma(Calc2);
		
		System.out.println(resultat);
		
		break;
	case 4:
		
		System.out.println("==== HAS ELEGIT LA OPCIO DE MULTIPLICAR 2 ====");
		System.out.println("");
		 
		System.out.println("FORMULA: (a, b) * n = (a * n, b * n)");
		
		resultat=Calc1.Suma(Calc2);
		
		System.out.println(resultat);
		
	break;
	case 5:
		
		System.out.println("===== HAS ELEGIT LA OPCIO DE DIVIDIR =====");
		System.out.println("");
		 
		System.out.println("FORMULA: (a, b) * (c, d) = (a*c – b*d, a*d + b*c)= ");
		resultat=Calc1.Suma(Calc2);
		
		System.out.println(resultat);
		
	break;
	}
	}while (opcio != 6);


}
}

