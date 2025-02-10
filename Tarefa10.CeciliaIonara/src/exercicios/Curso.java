package exercicios;

import java.util.HashMap;
import java.util.Map;

public class Curso {
	private String nome;
	private Double duracaoTotal;
	private Tecnico secretario;
	private Map<String, Docente> docentes;
	private Map<String, Matricula> matricula;
	private Map<String, Disciplina> disciplinas;

	public Curso(String nome, Double duracaoTotal, Tecnico secretario) {
		this.nome = nome;
		this.duracaoTotal = duracaoTotal;
		this.secretario = secretario;
		this.docentes = new HashMap<String, Docente>();
		this.matricula = new HashMap<String, Matricula>();
		this.disciplinas = new HashMap<String, Disciplina>();
	}

	public void adicionarDisciplina(String nome, Double cargaHoraria) {
	    Disciplina d1 = new Disciplina(nome, cargaHoraria);
	    this.matricula.put(codigo, d1);
	}

	public void adicionarMatricula(Matricula matricula) {
	    this.matricula.put(matricula.getNumero() + "", matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDuracaoTotal() {
		return duracaoTotal;
	}

	public void setDuracaoTotal(Double duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}

	public Tecnico getSecretario() {
		return secretario;
	}

	public void setSecretario(Tecnico secretario) {
		this.secretario = secretario;
	}

	public Map<String, Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(Map<String, Docente> docentes) {
		this.docentes = docentes;
	}

	public Map<String, Matricula> getMatricula() {
		return matricula;
	}

	public void setMatricula(Map<String, Matricula> matricula) {
		this.matricula = matricula;
	}

	public Map<String, Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Map<String, Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", duracaoTotal=" + duracaoTotal + ", secretario=" + secretario + ", docentes="
				+ docentes + ", matricula=" + matricula + ", toString()=" + super.toString() + "]";
	}

}
