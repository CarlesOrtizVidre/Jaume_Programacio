package Ejercicis_Getters_Setters;

import Ejercicios_Simples_Atributos.Articulo_A4;

public class Ejercici_C4 {

public static void main(String[] args) {
		
		Articulo_C4 a1 = new Articulo_C4("Camiseta P$G", 20, 21, 5);
		Articulo_C4 a2 = new Articulo_C4("Camiseta FCR", 1, 21, 26);
		

		System.out.println(a1.getNombre() + " Precio: " + a1.getPrecio() + "€ - IVA " + a1.getIVA() + "% - PVP " + (a1.getPrecio() + a1.getPrecio() * a1.getIVA() / 100)+"€");
		System.out.println(a1.getNombre() + " Precio: " + a1.getPrecio() + "€ - IVA " + a1.getIVA() + "% - PVP " + (a1.getPrecio() + a1.getPrecio() * a1.getIVA() / 100)+"€");


a1.setNombre("Chaqueta del P$G");


	
}


	









}
