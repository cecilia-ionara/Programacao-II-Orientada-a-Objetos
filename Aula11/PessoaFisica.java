package Aula11;

public class PessoaFisica extends Contribuinte {
	private Double despesasDeSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double despesasDeSaude) {
		super(nome, rendaAnual);
		this.despesasDeSaude = despesasDeSaude;
	}

	@Override
	public Double calculaImposto() {
		Double imposto = 0.0;
		if (this.rendaAnual < 20000.00) {
			imposto = this.rendaAnual * 0.15;
		} else {
			imposto = this.rendaAnual * 0.25;
		}
		imposto -= this.despesasDeSaude * 0.5;
		return imposto;
	}

	public Double getDespesasDeSaude() {
		return despesasDeSaude;
	}

	public void setDespesasDeSaude(Double despesasDeSaude) {
		this.despesasDeSaude = despesasDeSaude;
	}

}
