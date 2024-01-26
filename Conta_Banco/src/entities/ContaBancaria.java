package entities;

public class ContaBancaria {
	private String nomeTitular;
	private int numeroConta;
	private double deposito;
	
	
	public String nomeTitular(String nomeTitular) {
		return this.nomeTitular = nomeTitular;
	}
	
	public int numeroConta(int numeroConta) {
		return this.numeroConta = numeroConta;
	}
	
	
	public double deposito(double deposito) {
		return this.deposito += deposito;
	}
	
	public double saque(double saque) {
		return this.deposito - saque - 5;
	}
}
