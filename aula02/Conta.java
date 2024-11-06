package aula02;

public class Conta {
	public Integer numero;
	public Double saldo;
	public Double limite;
	public Cliente titular;
	
	public Conta(Integer numero, Double saldo, Double limite, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.titular = titular;
	}
	
	public Conta(Integer numero, Double saldo, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public Boolean sacar(Double quantidade) {
		if (quantidade > this.saldo)
			return false;
		else {
		this.saldo = this.saldo - quantidade;
			return true;
	}
}
	
	public void depositar(Double quantidade) {
		this.saldo = this.saldo + quantidade;
	}
}
