package Principal;

import Classe_Figura.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {

	Superherois musta = new Superherois ("SuperMusta","moro",true);
	musta.setDescripcio("Lleva manta");
	musta.setCapa(true);
	Dimensio D1 = new Dimensio (3, 3, 3,5);
	Figura F1 = new Figura ("F1",240,musta,D1);
	
	System.out.println(F1.toString());

	
	Superherois Detective = new Superherois ("Detective","Lupa",false);
	musta.setDescripcio("Lleva Lupa");
	musta.setCapa(false);
	Dimensio G1 = new Dimensio (2, 2, 2,4);
	Figura J1 = new Figura ("G1",260,Detective,G1);
	
	System.out.println(J1.toString());


	J1.pujarPreu(50);
	F1.pujarPreu(20);

	System.out.println(F1.toString());
	System.out.println(J1.toString());

	Colecció Almacen = new Colecció ("1");

	Almacen.añadirFigura(F1);
	Almacen.añadirFigura(J1);
	
	System.out.println(Almacen.toString1());
	
	System.out.println("Mes car: ");
	System.out.println(Almacen.mesCar());
	System.out.println("Valor de la coleccio: ");
	System.out.println(Almacen.getValorColeccio());
	System.out.println("Volum de la coleccio: ");
	System.out.println(Almacen.getVolumColeccio());
 
	System.out.println();
	
	
	}
}