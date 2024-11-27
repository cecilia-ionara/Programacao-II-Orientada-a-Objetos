package q1;

public class Discente {
	public Integer matricula;
	public String nome;
	public Integer semestre;
	public Double crg;
	public Professor orientador;

	public Discente(Integer matricula, String nome, Integer semestre, Double crg, Professor orientador) {
		this.matricula = matricula;
		this.nome = nome;
		this.semestre = semestre;
		this.crg = crg;
		this.orientador = orientador;
	}

	public String toString() {
		return "O(a) aluno(a) " + this.nome + " com a matrícula " + this.matricula + " no " + this.semestre
				+ "° semestre" + " com crg " + this.crg;
	}
}
