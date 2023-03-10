package Ejercicis_Getters_Setters;

import java.util.Scanner;

public class Ejercici_C1 {

	public static void main(String args[]) {

	Punto_C1 p1 = new Punto_C1 (5,0);
	Punto_C1 p2 = new Punto_C1 (10,10);
	Punto_C1 p3 = new Punto_C1 (-3,7);
	
	
 System.out.println("Las coordenadas de el p1 son:" + p1.getX() +","+ p1.getY());
 System.out.println("Las coordenadas de el p2 son:" + p2.getX() +","+ p2.getY());
 System.out.println("Las coordenadas de el p3 son:" + p3.getX() +","+ p3.getY());
	
	
 		p1.setX(p1.getY() + 3);
 		p1.setY(6);
 		
 		p2.setX(p2.getX() /2);
 		p2.setY(p2.getY() *2);
 		
 		p3.setX(p3.getX() -5);
 		p3.setY(p3.getY() %2);
 		
 		
 System.out.println("Las coordenadas de el p1 son:" + p1.getX() +","+ p1.getY());
 System.out.println("Las coordenadas de el p2 son:" + p2.getX() +","+ p2.getY());
 System.out.println("Las coordenadas de el p3 son:" + p3.getX() +","+ p3.getY());
 		
	
	
	}
	
}