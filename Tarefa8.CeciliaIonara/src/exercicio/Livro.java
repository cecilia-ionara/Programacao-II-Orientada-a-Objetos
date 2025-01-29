package exercicio;

import java.util.List;
import java.util.ArrayList;

public class Livro extends ItemImpresso {
	
	private Integer numeroPaginas;
	private String tipoLivro;
	private List<Editora> editora;
	
	public Livro(Integer numeroPaginas, String tipoLivro) {
		super();
		this.numeroPaginas = numeroPaginas;
		this.tipoLivro = tipoLivro;
		this.editora = new ArrayList<Editora>();
	}
	
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getTipoLivro() {
		return tipoLivro;
	}

	public void setTipoLivro(String tipoLivro) {
		this.tipoLivro = tipoLivro;
	}

	public List<Editora> getEditora() {
		return editora;
	}

	public void setEditora(List<Editora> editora) {
		this.editora = editora;
	}   

	@Override
	public Double calcularTempoEmprestimo() {
		// TODO Auto-generated method stub
		return null;
	}

}
