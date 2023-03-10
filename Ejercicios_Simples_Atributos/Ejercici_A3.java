package Ejercicios_Simples_Atributos;

import java.util.Scanner;

public class Ejercici_A3 {

public static void main(String args[]) {

	Scanner tec = new Scanner (System.in);
	
	Rectangulo_A3 rec1 = new Rectangulo_A3();
	Rectangulo_A3 rec2 = new Rectangulo_A3();


	rec1.x1=0;
	rec1.y1=0;
	rec1.x2=5;
	rec1.y2=5;
	
	rec2.x1=7;
	rec2.y1=9;
	rec2.x2=2;
	rec2.y2=3;
	
	
	System.out.println("Las coordenadas del primer Rectangulo son: (" + rec1.x1 + ","+ rec1.y1 + ")"+"(" +rec1.x2 +","+ rec1.y2 + ")");
	
	System.out.println("Las coordenadas del segundo Rectangulo son: ("+ rec2.x1 + "," + rec2.y2+")" + "(" + rec2.x2 + "," + rec2.y2 + ")");

	
	System.out.println("El perimetro del primer Rectangulo es: " + perimetro(rec1));
	
	System.out.println("El perimetro del segundo Rectangulo es: " + perimetro(rec2));
	
	System.out.println("El area del primer Rectangulo es: " + area(rec1));
	
	System.out.println("El area del segundo Rectangulo es: " + area(rec2));

	rec1.x1=5;
	rec1.y1=5;
	rec1.x2=15;
	rec1.y2=15;
	
	rec2.x1=17;
	rec2.y1=19;
	rec2.x2=22;
	rec2.y2=24;
	
	
	System.out.println("Las coordenadas del primer Rectangulo son: (" + rec1.x1 + ","+ rec1.y1 + ")"+"(" +rec1.x2 +","+ rec1.y2 + ")");
	
	System.out.println("Las coordenadas del segundo Rectangulo son: ("+ rec2.x1 + "," + rec2.y2+")" + "(" + rec2.x2 + "," + rec2.y2 + ")");

	
	System.out.println("El perimetro del primer Rectangulo es: " + perimetro(rec1));
	
	System.out.println("El perimetro del segundo Rectangulo es: " + perimetro(rec2));
	
	System.out.println("El area del primer Rectangulo es: " + area(rec1));
	
	System.out.println("El area del segundo Rectangulo es: " + area(rec2));
	
	
}
	
	
	public static double perimetro (Rectangulo_A3 rec) {
		
		int costat1 = Math.abs(rec.x1 - rec.x2);
		int costat2 = Math.abs(rec.y1 - rec.y2);
	
	return (costat1 + costat2)*2;
	
	}
	
	public static double area (Rectangulo_A3 rec) {
		
		int costat1 = Math.abs(rec.x1 - rec.x2);
		int costat2 = Math.abs(rec.y1 - rec.y2);
	
	return costat1 * costat2;
	
	}


}
