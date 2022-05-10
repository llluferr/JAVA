package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero) {
		super(numero);
	}

	@Override
	public int calcularPontuacao() {
		return (int) (getSaldo() * 0.1);
	}

	
	
}
