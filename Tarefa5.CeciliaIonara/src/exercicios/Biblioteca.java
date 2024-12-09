package exercicios;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	private Integer codigo;
	private String endereco;
	private String telefone;
	private List<Exemplar> exemplares;
	
	public Biblioteca(Integer codigo, String endereco, String telefone, List<Exemplar> exemplares) {
		super();
		this.codigo = codigo;
		this.endereco = endereco;
		this.telefone = telefone;
		this.exemplares = new ArrayList<Exemplar>();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	
}
