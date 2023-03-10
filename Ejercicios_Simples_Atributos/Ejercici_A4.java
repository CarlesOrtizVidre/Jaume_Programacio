package Ejercicios_Simples_Atributos;

public class Ejercici_A4 {


public static void main(String[] args) {
	
	Articulo_A4 a1 = new Articulo_A4();
	
	
	a1.nom = "Camisa negra";
	a1.precio = 20;
	a1.IVA = 21;
	a1.quantsQueden = 5;

	System.out.println(a1.nom + " Precio: " + a1.precio + "€ - IVA " + a1.IVA + "% - PVP " + (a1.precio + a1.precio * a1.IVA / 100)+"€");

	a1.precio = 10;

	System.out.println(a1.nom + " Precio: " + a1.precio + "€ - IVA " + a1.IVA + "% - PVP " + (a1.precio + a1.precio * a1.IVA / 100)+"€");




}






}
