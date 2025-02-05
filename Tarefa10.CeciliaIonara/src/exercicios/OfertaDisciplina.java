package exercicios;

import java.util.List;
import java.util.ArrayList;

public class OfertaDisciplina {
	private String nome;
	private String periodo;
	private Disciplina disciplina;
	private Docente docente;
	private List<Discente> discentes;

	public OfertaDisciplina(String nome, String periodo, Disciplina disciplina, Docente docente) {
		this.nome = nome;
		this.periodo = periodo;
		this.disciplina = disciplina;
		this.docente = docente;
		this.discentes = new ArrayList<Discente>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public List<Discente> getDiscentes() {
		return discentes;
	}

	public void setDiscentes(List<Discente> discentes) {
		this.discentes = discentes;
	}

	@Override
	public String toString() {
		return "OfertaDisciplina [nome=" + nome + ", periodo=" + periodo + ", disciplina=" + disciplina + ", docente="
				+ docente + ", discentes=" + discentes + ", toString()=" + super.toString() + "]";
	}
	
	
}
