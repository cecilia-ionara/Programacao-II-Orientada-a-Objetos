package q1;

import java.util.ArrayList;
import java.util.List;

public class Setores {
	private String nome;
	private String id;
	private List<ProcedimentoMedico> procedimentosSetor;

	public Setores(String nome, String id) {
		this.nome = nome;
		this.id = id;
		this.procedimentosSetor = new ArrayList<ProcedimentoMedico>();
	}

	public void adicionarProcedimentoSetor(ProcedimentoMedico p) {
		procedimentosSetor.add(p);
	}
	
	@Override
	public String toString() {
		return "Setores [nome=" + nome + ", id=" + id + "]";
	}

}
