package q1;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public abstract class Funcionario {
	protected String nome;
	protected String endereco;
	protected Sexo sexo;
	protected LocalDate dataNascimento;
	protected Double salario;
	protected Setores setor;
	protected List<Dependentes> dependente;

	public Funcionario(String nome, String endereco, Sexo sexo, LocalDate dataNascimento, Double salario, Setores setor) {
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
		this.setor = setor;
		this.dependente = new ArrayList<Dependentes>();
	}
	
	public void adicionarDependente(String nome, Sexo sexo, LocalDate dataNascimento, GrauParentesco grauparentesco) {
		Dependentes d = new Dependentes(nome, sexo, dataNascimento, grauparentesco);
		dependente.add(d);
	}

	public List<Dependentes> verDependente(Funcionario f) {
		return dependente;
	}
	
	@Override
	public String toString() {
		return "nome=" + nome + ", endereco=" + endereco + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", salario=" + salario + ", setor=" + setor ;
	}

}
