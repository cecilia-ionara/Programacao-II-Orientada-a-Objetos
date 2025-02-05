package exercicios;

public abstract class Funcionario extends Pessoa{
	protected Double salario;
	protected Titulacao titulacao;
	
	public Funcionario(String nome, String email, Double salario, Titulacao titulacao) {
		super(nome, email);
		this.salario = salario;
		this.titulacao = titulacao;
	}

	public abstract Double retribuicaoTitulacao();

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", titulacao=" + titulacao + ", toString()=" + super.toString()
				+ "]";
	}

	

}	
