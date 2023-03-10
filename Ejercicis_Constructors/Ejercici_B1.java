package Ejercicis_Constructors;

import java.util.Scanner;

public class Ejercici_B1 {

	public static void main(String args[]) {

	Punto_B1 p1 = new Punto_B1 (5,0);
	Punto_B1 p2 = new Punto_B1 (10,10);
	Punto_B1 p3 = new Punto_B1 (-3,7);
	
	
 System.out.println("Las coordenadas de el p1 son:" + p1.x +","+ p1.y);
 System.out.println("Las coordenadas de el p2 son:" + p2.x +","+ p2.y);
 System.out.println("Las coordenadas de el p3 son:" + p3.x +","+ p3.y);
	
	
 		p1.x += 3;
 		p1.y = 6;
 		
 		p2.x /= 2;
 		p2.y *= 2;
 		
 		p3.x *= 3;
 		p3.y /= 5;
 		
 		
 System.out.println("Las coordenadas de el p1 son:" + p1.x +","+ p1.y);
 System.out.println("Las coordenadas de el p2 son:" + p2.x +","+ p2.y);
 System.out.println("Las coordenadas de el p3 son:" + p3.x +","+ p3.y);
 		
	
	
	}
	
}