package exercicios;

public class Orientador extends Professor{
	private String especialidade;

	public Orientador(String nome, String areaAtuacao, String especialidade) {
		super(nome, areaAtuacao);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Orientador [especialidade=" + especialidade + ", toString()=" + super.toString() + "]";
	}

	
	
}
