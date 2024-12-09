package exercicios;

public class Bibliotecario {
	private String nome;
	private Integer cpf;
	private Biblioteca unidade;
	
	public Bibliotecario(String nome, Integer cpf, Biblioteca unidade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Biblioteca getUnidade() {
		return unidade;
	}

	public void setUnidade(Biblioteca unidade) {
		this.unidade = unidade;
	}
}
