package exercicios;
import java.util.List;
import java.util.ArrayList;

public class Faculdade {
	private String nome;
	private String sigla;
	private List<Curso> cursos;
	
	public Faculdade(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
		this.cursos = new ArrayList<Curso>();
	}
	
	public void adicionarCurso(String nome, Double duracaoTotal, Tecnico tecnico) {
		cursos.add(new Curso(nome, duracaoTotal, tecnico));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Faculdade [nome=" + nome + ", sigla=" + sigla + ", cursos=" + cursos + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
