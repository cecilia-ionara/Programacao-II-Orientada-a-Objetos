package exercicios;

import java.util.List;
import java.util.ArrayList;

public class Turma {
	private Professor professor;
	private List<Discente> discentes;
	
	public Turma(Professor professor) {
		this.professor = professor;
		this.discentes = new ArrayList<Discente>();
	}
	
	public void adicionarDiscente(Discente d) {
		this.discentes.add(d);
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Discente> getDiscentes() {
		return discentes;
	}

	public void setDiscentes(List<Discente> discentes) {
		this.discentes = discentes;
	}

	@Override
	public String toString() {
		return "Turma [professor=" + professor + ", discentes=" + discentes + "]";
	}
	
	
}
