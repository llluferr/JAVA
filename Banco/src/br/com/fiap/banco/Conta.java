package br.com.fiap.banco;

public abstract class Conta {

	private final String NOME_DO_BANCO = "Fiap Bank";
	private int numero;
	private String nomeDoTitular;
	private double saldo;
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
	public Conta(int numero, String nomeDoTitular) {
		this.numero = numero;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public int calcularPontuacao() {
		return 0;
	}
	
	public void depositar(double valor) {
		if (valor > 0) this.saldo += valor;
	}
	
	public final void sacar(double valor) {
		if(valor > 0) this.saldo -= valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor); 
		contaDestino.depositar(valor);
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int setNumero() {
		return numero;
	}
}
