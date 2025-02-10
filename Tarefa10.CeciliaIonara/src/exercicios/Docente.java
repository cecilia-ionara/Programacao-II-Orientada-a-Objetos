package exercicios;

public class Docente extends Funcionario{
	private String areaAtuacao;
	
	public Docente(String nome, String email, Double salario, Titulacao titulacao, String areaAtuacao) {
		super(nome, email, salario, titulacao);
		this.areaAtuacao = areaAtuacao;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public Double retribuicaoTitulacao() {
		Double retribuicao = 2000.00;
		if (this.titulacao == Titulacao.MESTRADO) {
			retribuicao += 1000.00;
		} else if(this.titulacao == Titulacao.DOUTORADO) {
			retribuicao += 3000.00;
		}
		return retribuicao;
	}

	@Override
	public String toString() {
		return "Docente [areaAtuacao=" + areaAtuacao + ", toString()=" + super.toString() + "]";
	}
	
}
