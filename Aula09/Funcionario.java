package Aula09;

public abstract class Funcionario {
	protected String nome;
	protected Double salario;
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
}
	
	public abstract Double calcularTempoDeFerias();
	
	public Double calcularBonificacao() {
		return this.salario*0.1;
	}
	
}
