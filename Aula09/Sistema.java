package Aula09;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private Double somaBonificacoes = 0.0;
	
	private List<Funcionario> funcionarios;
	
	public Double getSomaBonificacoes() {
		return somaBonificacoes;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public Sistema() {
		this.somaBonificacoes = 0.0;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public void adicionarFuncionarios(Funcionario f) {
		this.funcionarios.add(f);
	}
	public void calculaSomaBonificacoes() {
		for(int i=0; i<this.funcionarios.size(); i++){
			this.somaBonificacoes += 
			this.funcionarios.get(i).calcularBonificacao();
		}
	}
}
