package exercicios;

public class Docente extends Funcionario{
	
	public Docente(String nome, String email, Double salario, Titulacao titulacao) {
		super(nome, email, salario, titulacao);
	}

	public Double retribuicaoTitulacao() {
		return null;
	}
	
}
