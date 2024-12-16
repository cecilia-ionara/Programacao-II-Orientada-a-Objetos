package Aula07;

public class Diretor extends Funcionario {
	public Diretor(String nome, String cpf, Double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public Double calculaBonificacao() {
		return this.salario * 0.2;
	}
}
