package Aula07;

public class Engenheiro extends Funcionario{
	public Engenheiro(String nome, String cpf, Double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public Double calculaBonificacao() {
		return this.salario * 0.17;
	}
}
