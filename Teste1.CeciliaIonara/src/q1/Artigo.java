package q1;

public class Artigo {
	public Integer numero;
	public String titulo;
	public String descricao;
	public Discente autor;

	public Artigo(Integer numero, String titulo, String descricao, Discente autor) {
		this.numero = numero;
		this.titulo = titulo;
		this.descricao = descricao;
		this.autor = autor;
	}

	public String toString() {
		return "Apresentará o artigo de número " + this.numero + " com o tema " + this.titulo + " e descrição: "
				+ this.descricao + ". ";
	}
}
