package q1;

import java.time.LocalDate;

public class ProcedimentoMedico {
	private Setores setor;
	private String nome;
	private Integer id;
	private static Integer contador = 1;
	private LocalDate dataInicio;
	private LocalDate dataEstimadaFim;

	public ProcedimentoMedico(Setores setor, String nome, LocalDate dataInicio, LocalDate dataEstimadaFim) {
		this.id = contador++;
		this.setor = setor;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataEstimadaFim = dataEstimadaFim;
	}

	@Override
	public String toString() {
		return "ProcedimentoMedico [setor=" + setor + ", nome=" + nome + ", id=" + id + ", dataInicio=" + dataInicio
				+ ", dataEstimadaFim=" + dataEstimadaFim + "]";
	}	
}
