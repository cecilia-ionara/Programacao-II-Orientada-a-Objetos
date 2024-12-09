package exercicios;

import java.util.List;

public class Usuario {
	private Integer cpf;
	private String nome;
	private List<Emprestimo> historicoEmprestimos; //estudar lista e como se comporta
	
	public Usuario(Integer cpf, String nome, List<Emprestimo> historicoEmprestimos) {
		this.cpf = cpf;
		this.nome = nome;
		this.historicoEmprestimos = historicoEmprestimos;
	}

	public Usuario(Integer cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Emprestimo> getHistoricoEmprestimos() {
		return historicoEmprestimos;
	}

	public void setHistoricoEmprestimos(List<Emprestimo> historicoEmprestimos) {
		this.historicoEmprestimos = historicoEmprestimos;
	}
	
}
