package Aula13;

public abstract class Funcionario extends Pessoa {
	protected Double salario;

	public Funcionario(String nome, Double salario) {
		super(nome);
		this.salario = salario;
	}
	
	public abstract Double calcularBonificacao();
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", toString()=" + super.toString() + "]";
	}
	
	
}
