package Aula11;

public class PessoaJuridica extends Contribuinte {
	private Integer numeroDeFuncionarios; 
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double calculaImposto() {
		Double taxa  = 0.16;
		if (numeroDeFuncionarios > 10)
			taxa = 0.14;
		return this.rendaAnual * taxa;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

}
