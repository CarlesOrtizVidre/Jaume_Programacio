package Deparbank;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Deparbank {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	ArrayList <Compte_Bancari> Deparbank = new ArrayList <Compte_Bancari>(); 
	ArrayList <String> Moviments = new ArrayList <String>();
	
	Compte_Bancari Persona = new Compte_Bancari("",0,"","");
	
	
	System.out.print("Introduzca numero IBAN: ");
    Persona.setIBAN(sc.nextLine());
    System.out.print("Introduzca titular de cuenta: ");
    Persona.setTitular(sc.nextLine());
    System.out.print("Introduzca el saldo de la cuenta: ");
    Persona.setSaldo(sc.nextDouble());
    
	
	double compter = 0;
     int opcion;
     double cantidad;

    
     
     do {
    	 
    	 
         System.out.println("Elija una opción");
         System.out.println("1. Datos de la cuenta.");
         System.out.println("2. IBAN.");
         System.out.println("3. Titular.");
         System.out.println("4. Saldo.");
         System.out.println("5. Ingreso.");
         System.out.println("6. Retirada.");
         System.out.println("7. Movimientos.");
         System.out.println("8. Salir.");
         opcion = sc.nextInt();

         switch (opcion) {
             case 1:
            		Persona.Imprimir();
            	 break;
             case 2:
            	 System.out.println(Persona.getIBAN());
            	// String cadena1 ="El IBAN es: "+regexp+" El saldo es de: "+Persona.getIBAN(); 
            	 break;
             case 3:
            	 System.out.println(Persona.getTitular()); 
                 break;
             case 4:
            	 System.out.println(Persona.getSaldo()); 
                 break;
             case 5:
            	 System.out.println("Quants diners vols ingresar?");
            	 int a=sc.nextInt();
            	 Persona.Ingresar(a);
            	 String cadena1 ="Ingrés es de "+a+" El saldo es de: "+Persona.getSaldo(); 
            	 Moviments.add(cadena1);
            	 
                 break;
             case 6:
            	 
            	 System.out.println("Quants diners vols retirar?");
            	 int b=sc.nextInt();
            	 Persona.Retirar(b);
            	 
            	 	double resultado = Persona.getSaldo() - b;
            	
            		Persona.setSaldo(resultado);
            	
            	 String cadena ="Retirada de "+b+" El saldo es de: "+Persona.getSaldo(); 
            	 Moviments.add(cadena);
            	 
                 break;
             case 7:
            	 for(int c=0;c<Moviments.size();c++) {
            		 System.out.println(Moviments.get(c).toString());
            	 }
                 break;
             case 8:
            	 System.out.println("HAS SALIDO!");
                 break;
             default:
                 
         }
     } while (opcion != 8);
	
}
	

}


