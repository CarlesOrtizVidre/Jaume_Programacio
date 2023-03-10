package Mascotas;

import java.util.ArrayList;

public class Inventario {
	
	

	private ArrayList <Mascotas> Animales = new ArrayList();

	

	private String getTipoMascota(Mascotas m) {
		  if (m instanceof Perro) {
	            return "Perro";
	        } else if (m instanceof Gato) {
	            return "Gato";
	        } else if (m instanceof Loro) {
	            return "Loro";
	        } else if (m instanceof Canario) {
	            return "Canario";
	        } else {
	            return null;
	        }
	    }
	
	public void mostrarListaAnimales() {
		System.out.println("--- LLISTA ANIMAL ---");
		 for (int i = 0; i < Animales.size(); i++) {
	            Mascotas m = Animales.get(i);
	            String tipo = getTipoMascota(m);
	            String nombre = m.getNombre();
	            System.out.println(i + ": " + tipo + " " + nombre);
	        }
	}
	public void mostrarUnAnimal(int indice) {
	      if (indice >= 0 && indice < Animales.size()) {
	            System.out.println("*** MASCOTA " + indice + " ***");
	            Mascotas m = Animales.get(indice);
	            m.muestra();
	        }
	}
	public void mostrarTodosAnimales() {
		   for (int i = 0; i < Animales.size(); i++) {
	            mostrarUnAnimal(i);
	            System.out.println("");
	        }
	}
	public void insertarAnimal(Mascotas a) {
		 Animales.add(a);
	}
	public boolean eliminarAnimal(int indice) {
        if (indice >= 0 && indice < Animales.size()) {
            Animales.remove(indice);
            return true;null
            
        } else {
            return false;
        }
	}
	public void vaciarInventario() {
		 Animales.clear();
	}


	



	}


