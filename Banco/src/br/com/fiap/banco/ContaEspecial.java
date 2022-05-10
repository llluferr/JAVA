package br.com.fiap.banco;

public class ContaEspecial extends Conta {

	private double limite;
	
	public ContaEspecial(int numero) {
		super(numero);
	}

	@Override
	public int calcularPontuacao() {
		return limite;
	}

	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}	
}
