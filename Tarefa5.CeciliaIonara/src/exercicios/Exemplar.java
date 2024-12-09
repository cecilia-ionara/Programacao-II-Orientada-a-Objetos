package exercicios;

public class Exemplar {
	private String codigo;
	private Biblioteca biblioteca;
	private SituacaoExemplar situacao;
	
	public Exemplar(String codigo, Biblioteca biblioteca, SituacaoExemplar situacao) {
		this.codigo = codigo;
		this.biblioteca = biblioteca;
		this.situacao = situacao;
	}

	public Exemplar(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	public SituacaoExemplar getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoExemplar situacao) {
		this.situacao = situacao;
	}
	
}
