package respostas;

public class Ataque {
	private Integer idAtaque;
	private String nome;
	private Integer precisao;
	private Integer poder;

	public Ataque(Integer idAtaque, String nome, Integer precisao, Integer poder) {
		this.idAtaque = idAtaque;
		this.nome = nome;
		this.precisao = precisao;
		this.poder = poder;
	}

	@Override
	public String toString() {
		return "Ataque [idAtaque=" + idAtaque + ", nome=" + nome + ", precisao=" + precisao + ", poder=" + poder + "]";
	}
	
}
