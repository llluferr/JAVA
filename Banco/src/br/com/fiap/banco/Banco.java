package br.com.fiap.banco;

public class Banco {

	public static void main(String[] args) {
		
		
		ContaCorrente contaCorrente = new ContaCorrente(101010);
		ContaEspecial contaEspecial = new ContaEspecial(50232);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(98765);
		contaPoupanca.depositar(100);
		contaPoupanca.depositar(1000);
		contaPoupanca.depositar(-10000);
		contaPoupanca.sacar(-1000);
		
		ContaDigital contaDigital = new ContaDigital(6666);
		contaDigital.depositar(10000);
		System.out.println(contaDigital. 0);
		
		contaPoupanca.transferir(500, contaCorrente);
		
		contaCorrente.transferir(1000, contaEspecial);
		
		System.out.println(contaPoupanca.getNumero()+ " " + contaPoupanca.getSaldo());
		System.out.println(contaCorrente.getNumero()+ " " + contaCorrente.getSaldo());
		System.out.println(contaEspecial.getNumero()+ " " + contaEspecial.getSaldo());
	}
	
}
 