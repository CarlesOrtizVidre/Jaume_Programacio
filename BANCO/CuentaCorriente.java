package BANCO;

public class CuentaCorriente extends CuentaBancaria{
	
	
	public CuentaCorriente (String iban, double saldo) {
		
		super(iban, saldo);
		
	}

	@Override
	public void calcularIntereses() {
		// TODO Auto-generated method stub
		double saldo2;
		
		saldo2 = this.saldo *= interesBasico/100;
		
		this.saldo += saldo2;
		
		System.out.println(saldo2);
	}

}
