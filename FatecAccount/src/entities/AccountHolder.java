package entities;

import application.Account;

public class AccountHolder {
	private String client;
	protected double saldo;
	
	
	public AccountHolder() {
		saldo = 0.0;
	}

	public AccountHolder(String client, double saldo) {
		this.client = client;
		this.saldo = saldo;
	}
	
	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public AccountHolder(String client) {
		this.client = client;
	}

	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		}
		saldo = saldo - valor;
		return true;
	}
	
	public String imprimirSaldo() {
		return "Saldo = " + saldo;
	}
	
	public String imprimirSaldo(boolean comClient) {
		if(comClient) {
			return "Client = " + comClient 
			+ "\n" + imprimirSaldo();
		}
		return imprimirSaldo();
	}
	
}
