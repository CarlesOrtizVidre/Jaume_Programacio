package Herencia_Animal1;

public class Main {

	public static void main(String[] args) {

        Perro Perro = new Perro("Teddy","Croquetas",10,"Chihuahua");
        Gato Gato = new Gato("Pelusa","Especial",8,"Siames");
        Caballo Caballo = new Caballo("Jhonny","Pasto",21,"Fino");
        
        

        //-->Nos muestra los detalles del objeto
        System.out.println(Perro.toString());
        System.out.println("--------------------------------------------------");
        System.out.println(Gato.toString());
        System.out.println("--------------------------------------------------");
        System.out.println(Caballo.toString());

    }
}
