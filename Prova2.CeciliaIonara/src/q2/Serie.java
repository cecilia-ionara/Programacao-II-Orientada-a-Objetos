package q2;

import java.util.List;
import java.util.ArrayList;

public class Serie extends Midia {
	private Integer temporadas;
	private List<Episodio> episodios;

	public Serie(String titulo, Integer ano, Genero genero, Integer temporadas) {
		super(titulo, ano, genero);
		this.temporadas = temporadas;
		this.episodios = new ArrayList<Episodio>();
	}
	
	public void adicionarEp(String tituloEpisodio, Integer duracao) {
		Episodio e = new Episodio(tituloEpisodio, duracao);
		episodios.add(e);
	}
	
	public Integer getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Integer temporadas) {
		this.temporadas = temporadas;
	}

	public List<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	@Override
	public String toString() {
		return "Serie [temporadas=" + temporadas + ", episodios=" + episodios + ", toString()=" + super.toString()
				+ "]";
	}

}
