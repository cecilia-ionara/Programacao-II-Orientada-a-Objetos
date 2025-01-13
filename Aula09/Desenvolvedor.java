package Aula09;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double calcularBonificacao() {
		return this.salario*0.13;
	}
}
