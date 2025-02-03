package exercicios;

public class Professor {
	private String nome;
	private String areaAtuacao;
	
	public Professor(String nome, String areaAtuacao) {
		this.nome = nome;
		this.areaAtuacao = areaAtuacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", areaAtuacao=" + areaAtuacao + "]";
	}
	
}
