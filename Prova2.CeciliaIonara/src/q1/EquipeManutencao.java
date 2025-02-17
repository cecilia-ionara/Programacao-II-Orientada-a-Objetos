package q1;

import java.time.LocalDate;

public class EquipeManutencao extends Funcionario {
	private Integer matricula;
	private Double jornadaTrabalho;
	
	public EquipeManutencao(String nome, String endereco, Sexo sexo, LocalDate dataNascimento, Double salario,
			Setores setor, Integer matricula, Double jornadaTrabalho) {
		super(nome, endereco, sexo, dataNascimento, salario, setor);
		this.matricula = matricula;
		this.jornadaTrabalho = jornadaTrabalho;
	}

	@Override
	public String toString() {
		return "EquipeManutencao [matricula=" + matricula + ", jornadaTrabalho=" + jornadaTrabalho + ", \\n"
				+ super.toString() + "]";
	}
	
}
