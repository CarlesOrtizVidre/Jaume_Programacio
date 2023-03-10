package ArrayList;

public class Producte1 {
	

	private String nom;
	private int quantitat;
	
	public Producte1(String nom, int quantitat) {
		super();
		this.nom = nom;
		this.quantitat = quantitat;
	}
	
	
	
	public String getNom() {
		return nom;
	}



	public int getQuantitat() {
		return quantitat;
	}


	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}

	public String toString() {
		
		return "producte nom=" + nom + " quantitat " + quantitat +".";
	}










}
