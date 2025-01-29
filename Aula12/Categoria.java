package Aula12;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private Integer id;
	private String nome;
	private List<Produto> produtos;
	
	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adicionaProduto( Produto produto) {
		this.produtos.add(produto);
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + ",\nprodutos=" + produtos + "]";
	}

}
