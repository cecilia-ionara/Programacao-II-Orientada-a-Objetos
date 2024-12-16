package Aula07;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, String cpf, Double salario) {
		super(nome, cpf, salario);
	}
	
	@Override //reescreve o método de acordo com o que queremos
	public Double calculaBonificacao() {
		return this.salario * 0.15;
	}
}
