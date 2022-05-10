package br.com.fiap.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero) {
		super(numero);
	}
	
	@Override
	public int calcularPontuacao() {
		return (int) (getSaldo() * 0.1);
	}



	private double taxaDeRendimento;
	
	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

	public void setTaxaDeRendimento(double taxaDeRendimento) {
		this.taxaDeRendimento = taxaDeRendimento;
	}
}
