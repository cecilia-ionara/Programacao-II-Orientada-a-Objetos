package atividade;

public abstract class Funcionario extends Pessoa {
	protected Titulacao titulo;

	protected Double salario;

	protected String localTrabalho;

	public abstract double calcularIncentivoQualificacao();

	public Titulacao getTitulo() {
		return titulo;
	}

	public Double getSalario() {
		return salario;
	}

	public String getLocalTrabalho() {
		return localTrabalho;
	}

	public void setTitulo(Titulacao titulo) {
		this.titulo = titulo;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

}
