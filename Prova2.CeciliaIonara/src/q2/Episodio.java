package q2;

public class Episodio {
	private String tituloEpisodio;
	private Integer duracao;

	public Episodio(String tituloEpisodio, Integer duracao) {
		this.tituloEpisodio = tituloEpisodio;
		this.duracao = duracao;
	}
	
	public String getTituloEpisodio() {
		return tituloEpisodio;
	}
	public void setTituloEpisodio(String tituloEpisodio) {
		this.tituloEpisodio = tituloEpisodio;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Episodio [tituloEpisodio=" + tituloEpisodio + ", duracao=" + duracao + "]";
	}
	
	
}
