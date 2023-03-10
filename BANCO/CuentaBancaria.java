package BANCO;

public abstract class CuentaBancaria {

		protected String iban;
		protected double saldo;

protected static final double interesBasico = 2.5;
		
public CuentaBancaria(String iban, double saldo) {
			super();
			this.iban = iban;
			this.saldo = saldo;
		}


public String getIban() {
	return iban;
}


public void setIban(String iban) {
	this.iban = iban;
}


public double getSaldo() {
	return saldo;
}


public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public double ingresar(int ingreso) {
	return this.saldo += ingreso; 
}
 
public double retirada (int retirada) {
	return this.saldo -= retirada;
}

public String traspaso (CuentaAhorro a, int traspaso) {
	
	this.saldo -= traspaso;
	
	traspaso += a.getSaldo();
	
	return "El saldo de la cuenta es" + this.saldo;
	
}

public abstract void calcularIntereses();



}

