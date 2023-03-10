package Ejercicis_Getters_Setters;

public class Rectangulo_C3 {


	private int x1;
	private int x2;
	private int y1;
	private int y2 ;



public Rectangulo_C3 (int x1,int x2,int y1,int y2) {
	
	if((x1>x2)&&(y1>y2)){
		
	
	
	this.x1 = x1;
	this.x2 = x2;
	this.y1 = y1;
	this.y2 = y2;

	}
	else {
		System.err.println(
				"EROOR al hacer el Rectangulo (" + x1 + "," + y1 + "," + ")" + "(" + x2 + "," + y2 + ")"); 
	}
	

}

	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}

	
	public void setX2 (int x2) {
		if(x2 < this.x1) {
			System.out.println("ERROR el valor x2 no puede ser menor al de x1");
		}
		else {
			this.x2 = x2; 
		}
	}
	
	public void setY2 (int y2) {
		if(y2 < this.y1) {
			System.out.println("ERROR el valor y2 no puede ser menor al de y1");
		}
		else {
			this.y2 = y2; 
		}
	}

	public void setY1 (int y1) {
		if(y1 < this.y2) {
			System.out.println("ERROR el valor y1 no puede ser menor al de y2");
		}
		else {
			this.y1 = y1; 
		}
	}
	public void setX1 (int x1) {
		if(x1 < this.x2) {
			System.out.println("ERROR el valor x2 no puede ser menor al de x1");
		}
		else {
			this.x1 = x1; 
		}
	}



}