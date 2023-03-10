package BANCO;

public class CuentaAhorro extends CuentaBancaria{

	private double saldoMinimo;
	
public CuentaAhorro (String iban, double saldo, double saldoMinimo) {
	
	super(iban, saldo);
	this.saldoMinimo=saldoMinimo;
	
}

public double getSaldoMinimo() {
	return saldoMinimo;
}

public void setSaldoMinimo(double saldoMinimo) {
	this.saldoMinimo = saldoMinimo;
}

@Override
public void calcularIntereses() {
	 if(this.saldo < this.saldoMinimo) {
		 this.saldo += interesBasico /2;
		 
	 }
	 else {
		this.saldo += interesBasico *2;
	 }
}


 
}
