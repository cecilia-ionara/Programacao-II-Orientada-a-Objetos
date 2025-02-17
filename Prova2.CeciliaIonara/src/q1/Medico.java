package q1;

import java.time.LocalDate;

public class Medico extends Funcionario {

	private Integer CRM;
	private String especialidadeMedica;
	Double cargaHoraria;
	
	public Medico(String nome, String endereco, Sexo sexo, LocalDate dataNascimento, Double salario, Setores setor,
			Integer cRM, String especialidadeMedica) {
		super(nome, endereco, sexo, dataNascimento, salario, setor);
		CRM = cRM;
		this.especialidadeMedica = especialidadeMedica;
		
	}

	public String realizarProcedimento(ProcedimentoMedico p) {
		return "O procedimento " + p + "foi realizado com sucesso!";
	}
	
	public void armazenarCargaHoraria(ProcedimentoMedico p, Double ch) {
		this.cargaHoraria =+ ch;
	}
	
	public Double verCHSemanal() {
		return this.cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Medico [CRM=" + CRM + ", especialidadeMedica=" + especialidadeMedica + ", \n"
				+ super.toString() + "]";
	}

}
