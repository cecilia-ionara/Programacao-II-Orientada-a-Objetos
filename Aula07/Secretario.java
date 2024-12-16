package Aula07;

public class Secretario extends Funcionario {
	public Secretario(String nome, String cpf, Double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public Double calculaBonificacao() {
		return this.salario * 0.12;
	}
}
