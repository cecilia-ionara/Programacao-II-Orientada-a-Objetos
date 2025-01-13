package Aula09;

public class Analista extends Funcionario {
	public Analista(String nome, Double salario) {
		super(nome, salario);
	}
	@Override
	public Double calcularTempoDeFerias() {
		return 1.0;
	}
	
	@Override
	public Double calcularBonificacao() {
		return super.calcularBonificacao()
				+ this.salario * 0.03;
	}
}
