package atividade;

public class Curso {
	private String nome;
	private Double cargaHoraria;
	private Docente Coordenador;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Docente getCoordenador() {
		return Coordenador;
	}

	public void setCoordenador(Docente coordenador) {
		Coordenador = coordenador;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", Coordenador=" + Coordenador + "]";
	}
	
	
}
