package exercicios;

public class Disciplina {
	private String nome;
	private String cargaHoraria;
	
	public Disciplina(String nome, String cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
}
