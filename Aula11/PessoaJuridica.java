package Aula11;

public class PessoaJuridica extends Contribuinte {
	private Integer numeroDeFuncionarios; 
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double calculaImposto() {
		Double imposto  = 0.0;
		if (numeroDeFuncionarios > 10) {
			imposto = this.rendaAnual * 0.14;
		} else {
			imposto = this.rendaAnual * 0.16;
		}
		return imposto;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

}
