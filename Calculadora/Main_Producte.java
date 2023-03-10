package Calculadora;

import java.util.Scanner;

public class Main_Producte {
	
	public static void main(String[] args) {
		
		Scanner teclat = new Scanner (System.in);

	Producte p0 = new Producte ("",4);
	Producte p1 = new Producte ("",8);
	Producte p2 = new Producte ("",3);
	Producte p3 = new Producte ("",7);
	Producte p4 = new Producte ("",6);


	//System.out.println(p0);


	System.out.println("Nom per al primer producte: ");
	p0.setNom(teclat.nextLine());
	
	System.out.println("Quantitat per al primer producte: ");
	p0.setQuantitat(teclat.nextInt());
	
	System.out.println("Nom per al segon producte: ");
	p1.setNom(teclat.nextLine());
	
	System.out.println("Quantitat per al segon producte: ");
	p1.setQuantitat(teclat.nextInt());
	
	System.out.println("Nom per al tercer producte: ");
	p2.setNom(teclat.nextLine());
	
	System.out.println("Quantitat per al tercer producte: ");
	p2.setQuantitat(teclat.nextInt());
	
	System.out.println("Nom per al quart producte: ");
	p3.setNom(teclat.nextLine());
	
	System.out.println("Quantitat per al quart producte: ");
	p3.setQuantitat(teclat.nextInt());
	
	System.out.println("Nom per al quint producte: ");
	p4.setNom(teclat.nextLine());
	
	System.out.println("Quantitat per al quint producte: ");
	p4.setQuantitat(teclat.nextInt());
	
	int[] vec = new int[5]; 
	
	Producte[] vecProduc = new Producte[5];
	
//	vecProduc[0] = p0;
//	vecProduc[1] = p1;
//	vecProduc[2] = p2;
//	vecProduc[3] = p3;
//	vecProduc[4] = p4;
//	

	System.out.println(p0.toString());
	

	for(int i=0; i<vecProduc.length; i++) {
		
		System.out.println(vecProduc[i].toString());
	}
	for(int i=0; i<vecProduc.length; i++) {
	
		System.out.println(vecProduc[i].getNom()+""+vecProduc[i].getQuantitat());

	}
	
	
	}
}