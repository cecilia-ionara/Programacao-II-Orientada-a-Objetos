package Aula08;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected Double salario;
	
	public final Double calculaBonificacao() {
		return this.salario * 0.1;
	}
}
