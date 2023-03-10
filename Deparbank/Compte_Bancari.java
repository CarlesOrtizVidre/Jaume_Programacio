package Deparbank;

public class Compte_Bancari {

	private String Titular;
	private double Saldo;
	private String Moviments;
	private String IBAN;

	
	public Compte_Bancari (String Titular, double Saldo, String Moviments, String IBAN)  {
		
		this.Titular=Titular;
		this.Saldo=Saldo;
		this.Moviments=Moviments;
		this.IBAN=IBAN;
	}
	
	
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public String getMoviments() {
		return Moviments;
	}
	public void setMoviments(String moviments) {
		Moviments = moviments;
	}


	public String getIBAN() {
		return IBAN;
	}


	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}


	@Override
	public String toString() {
		return "Compte_Bancari [Titular=" + Titular + ", Saldo=" + Saldo + ", Moviments=" + Moviments + ", IBAN=" + IBAN
				+ "]";
	}

	public void Imprimir() {
		
		System.out.println("El IBAN es: " + IBAN);
		System.out.println("El TITULAR es: " + Titular);
		System.out.println("El SALDO es de: "+ Saldo +"€");
	
	}
	
	public void Ingresar(double ingreso) {
		
		 if (ingreso > 3000 ) {
				
			 	System.out.println("Es NOTIFICARA A HACIENDA");
			 	Saldo = Saldo + ingreso;
			 	
		 } else {
			 
			 Saldo = Saldo + ingreso;
			 
		 }
		
		
	}

	public void Retirar(double retirada) {
		
		if (Saldo < 0 && Saldo > -50) {
			
			System.out.println("El saldo es negatiu");
			
			
		}	else if (Saldo < -50) {
			
			System.err.println("Saldo menor que 50 euros.");
		
		}	
		
		
	}
	
	

	

}