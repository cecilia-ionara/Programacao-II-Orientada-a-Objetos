package exemplos;

public class Conta {
	public Integer numero;
	public Double saldo;
	public Double limite;
	public String nome;
	
	public Conta(Integer numero, Double saldo, Double limite, String nome) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.nome = nome;
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
