package Banco;

public class Conta {
	Cliente titular;
	private int numero;
	double saldo;

	public Conta(Cliente cliente, int numero) {
		this.titular = cliente;
		this.numero = numero;
		saldo = 0;
	}
	
	public boolean deposito(double valor) {
		saldo += valor;
		return true;
	}
	
	public boolean saque(double valor) {
		if (valor >= saldo) 
			return false;
		saldo -= valor;
		return true;
	}
	
	public double verSaldo() {
		return saldo;
	}
	
	//get e set gerado automaticamente	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}