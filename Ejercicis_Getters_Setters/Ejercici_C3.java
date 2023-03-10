package Ejercicis_Getters_Setters;

import java.util.Scanner;

public class Ejercici_C3 {

public static void main(String args[]) {

		Scanner tec = new Scanner (System.in);
		
		Rectangulo_C3 rec1 = new Rectangulo_C3(0,0,5,5);
		Rectangulo_C3 rec2 = new Rectangulo_C3(7,9,2,3);


		System.out.println("Las coordenadas del primer Rectangulo son: (" + rec1.getX1() + ","+ rec1.getY1() + ")"+"(" +rec1.getX2() +","+ rec1.getY2() + ")");
		
		System.out.println("Las coordenadas del segundo Rectangulo son: ("+ rec2.getX1() + "," + rec2.getY2()+")" + "(" + rec2.getX2() + "," + rec2.getY2() + ")");

		
		System.out.println("El perimetro del primer Rectangulo es: " + perimetro(rec1));
		
		System.out.println("El perimetro del segundo Rectangulo es: " + perimetro(rec2));
		
		System.out.println("El area del primer Rectangulo es: " + area(rec1));
		
		System.out.println("El area del segundo Rectangulo es: " + area(rec2));

		rec1.setX1(5);
		rec1.setX2(5);

		
		rec2.setY1(17);
		rec2.setY2(19);
	
		
		
		System.out.println("Las coordenadas del primer Rectangulo son: (" + rec1.getX1() + ","+ rec1.getY1() + ")"+"(" +rec1.getX2() +","+ rec1.getY2() + ")");
		
		System.out.println("Las coordenadas del segundo Rectangulo son: ("+ rec2.getX1() + "," + rec2.getY2()+")" + "(" + rec2.getX2() + "," + rec2.getY2() + ")");

		
		System.out.println("El perimetro del primer Rectangulo es: " + perimetro(rec1));
		
		System.out.println("El perimetro del segundo Rectangulo es: " + perimetro(rec2));
		
		System.out.println("El area del primer Rectangulo es: " + area(rec1));
		
		System.out.println("El area del segundo Rectangulo es: " + area(rec2));
		
		
	}
		
		
		public static double perimetro (Rectangulo_C3 rec) {
			
			int costat1 = Math.abs(rec.getX1() - rec.getX2());
			int costat2 = Math.abs(rec.getY1() - rec.getY2());
		
		return (costat1 + costat2)*2;
		
		}
		
		public static double area (Rectangulo_C3 rec) {
			
			int costat1 = Math.abs(rec.getX1() - rec.getX2());
			int costat2 = Math.abs(rec.getY1() - rec.getY2());
		
		return costat1 * costat2;
		
		}


	}
	
	





