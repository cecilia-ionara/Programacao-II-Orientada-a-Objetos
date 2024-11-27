package q1;

public class Professor {
	public Integer matricula;
	public String nome;

	public Professor(Integer matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public String toString() {
		return "Orientado pelo(a) professor(a) " + this.nome;
	}
}
