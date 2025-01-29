package Aula12;

public class Atleta {
	public String nome;
	public Integer idade;
	public String posicao;

	public Atleta(String nome, Integer idade, String posicao) {
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "\nnome=" + nome + ", idade=" + idade + ", posicao=" + posicao;
	}
	
	
}
