package Figuras;

import java.util.ArrayList;

public class Main {

public static void main(String[] args) {
	
	
	ArrayList<String> Figura = new ArrayList<String>();
	
	Círculo circ1 = new Círculo(20);
	Cuadrado cua1 = new Cuadrado(2);
	Triángulo tri1 =new Triángulo(2,3);
	Rectángulo rec1 = new Rectángulo (2,5);
	
	
	circ1.imprimir();
	cua1.imprimir();
	tri1.imprimir();
	rec1.imprimir();
	System.out.println();
	circ1.escalar(2);
	cua1.escalar(2);
	tri1.escalar(2);
	rec1.escalar(2);
	System.out.println();
	circ1.imprimir();
	cua1.imprimir();
	tri1.imprimir();
	rec1.imprimir();
	System.out.println();
	circ1.escalar(0.1);
	cua1.escalar(0.1);
	tri1.escalar(0.1);
	rec1.escalar(0.1);
	System.out.println();
	circ1.imprimir();
	cua1.imprimir();
	tri1.imprimir();
	rec1.imprimir();



}

}
