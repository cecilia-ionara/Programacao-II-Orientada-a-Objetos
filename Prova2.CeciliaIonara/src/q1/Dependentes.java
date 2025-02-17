package q1;

import java.time.LocalDate;

public class Dependentes {
	private String nome;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private GrauParentesco grauparentesco;

	public Dependentes(String nome, Sexo sexo, LocalDate dataNascimento, GrauParentesco grauparentesco) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.grauparentesco = grauparentesco;
	}

	@Override
	public String toString() {
		return "\n nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento
				+ ", grauparentesco=" + grauparentesco;
	}

}
