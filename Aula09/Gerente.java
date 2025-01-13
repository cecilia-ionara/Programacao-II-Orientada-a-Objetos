package Aula09;

public abstract class Gerente extends Funcionario {

	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}
	
	public abstract Double calcularAposentadoria();
	
	@Override
	public Double calcularBonificacao() {
		return super.calcularBonificacao()
				+ this.salario * 0.05;
	}
}
