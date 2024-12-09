package exercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
	private Date dataEmprestimo;
	private Date dataDevolucao; 
	private Usuario usuario;
	private List<Exemplar> exemplares;
	
	public Emprestimo(Date dataEmprestimo, Date dataDevolucao, Usuario usuario, List<Exemplar> exemplares) {
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.usuario = usuario;
		this.exemplares = new ArrayList<Exemplar>();
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	
	
}
