package Herencia_Animal2;


public class Main {
	
public static void main(String[] args) {

Animal animal = new Animal("Gustavo", "insectos", 3);
Mamifero mamifero = new Mamifero("Moby Dick", "plancton", 5, 12);
Perro perro = new Perro("Tobby", "carne", 7, 2, "caniche");
Gato gato = new Gato("Tom", "pescado", 4, 4, "siamés");
Caballo caballo = new Caballo("Rocinante", "hierba", 8, 12, "español");

System.out.println(animal);
System.out.println(mamifero);
System.out.println(perro);
System.out.println(gato);
System.out.println(caballo);
caballo.setNombre("Rucio");
caballo.setEjercicio(3);
System.out.println(caballo);
}
}
