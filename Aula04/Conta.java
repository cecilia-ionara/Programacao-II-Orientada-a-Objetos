package Aula04;

public class Conta {
	private Integer numero;
	private Double limite;
	private Cliente titular;
	private Double saldo;

	public Conta(Integer numero, Cliente titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void sacar(Double valor) {
		this.saldo = this.saldo - (valor * 1.01);
	}

	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente novoTitular) {
		this.titular = novoTitular;
	}
	

}
