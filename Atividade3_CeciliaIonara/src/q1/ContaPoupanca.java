package q1;

import exercicio_20250115.Conta;

public class ContaPoupanca extends Conta {
	protected Double taxaRendimento;
	
	public ContaPoupanca(String t, Double s, Double taxaRendimento) {
		super(t, s);
		this.taxaRendimento = taxaRendimento;
	}
	
	@Override
	public void sacar(Double valor){
		this.saldo =- valor;
	}
	
	@Override
	public void depositar(Double valor) {
		//add codigo
	}
	
	public Double calcularRendimento(Double s) {
		//add codigo
	}
	
	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [taxaRendimento=" + taxaRendimento + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}
