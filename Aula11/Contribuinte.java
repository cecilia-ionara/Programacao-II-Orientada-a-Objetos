package Aula11;

public abstract class Contribuinte {
	protected String nome;
	protected Double rendaAnual;
	
	public Contribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public abstract Double calculaImposto();
}
