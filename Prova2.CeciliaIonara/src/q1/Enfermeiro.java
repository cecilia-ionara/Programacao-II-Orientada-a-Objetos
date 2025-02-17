package q1;

import java.time.LocalDate;

public class Enfermeiro extends Funcionario {
	private Integer matricula;
	private String nivelFormacao;

	public Enfermeiro(String nome, String endereco, Sexo sexo, LocalDate dataNascimento, Double salario, Setores setor, Integer matricula, String nivelFormacao) {
		super(nome, endereco, sexo, dataNascimento, salario, setor);
		this.matricula = matricula;
		this.nivelFormacao = nivelFormacao;
	}

	@Override
	public String toString() {
		return "Enfermeiro [matricula=" + matricula + ", nivelFormacao=" + nivelFormacao + ", \n"
				+ super.toString() + "]";
	}

}
