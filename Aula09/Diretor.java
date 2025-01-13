package Aula09;

public class Diretor extends Gerente {
	
	public Diretor(String nome, Double salario) {
		super(nome, salario);
	}
	
	@Override
	public Double calcularTempoDeFerias() {
		return 1.0;
	}
	
	@Override
	public Double calcularAposentadoria() {
		return 10.00;
	}
	
}
