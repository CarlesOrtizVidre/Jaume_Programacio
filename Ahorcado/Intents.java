package Ahorcado;

public class Intents {
	
	private int intents;
	
	public Intents(int intents) {

		this.intents=intents;
	}
	
	
	public int getIntents() {
		return intents;
	}


	public void setIntents(int intents) {
		this.intents = intents;
	}


	public void intents() {
		
		for (intents=6;intents>0;intents--) {
			
			System.out.println("Intents restants " + intents);
			
			if( intents == 0) {
				
				System.out.println("Els Intents han acabat ");
			}
			
			
		}
	
	
	
	
	
	
	
	
	
	}

}
