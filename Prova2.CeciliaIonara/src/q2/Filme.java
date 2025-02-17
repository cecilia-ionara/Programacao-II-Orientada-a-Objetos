package q2;

public class Filme extends Midia {
	private Integer duracao;

	public Filme(String titulo, Integer ano, Genero genero, Integer duracao) {
		super(titulo, ano, genero);
		this.duracao = duracao;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Filme [duracao=" + duracao + ", toString()=" + super.toString() + "]";
	}
	
}
