package Aula13;

public class Vigilante extends Funcionario {

	
	public Vigilante(String nome, Double salario) {
		super(nome, salario);
	}
	
	public Double calcularBonificacao() {
		return this.salario * 0.11;
	}
}
