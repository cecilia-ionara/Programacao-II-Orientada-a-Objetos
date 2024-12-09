package exercicios;

import java.util.List;
import java.util.ArrayList;

public class Livro {
	private String titulo;
	private List<String> autores;
	private Integer ano;
	private Genero genero;
	
	public Livro(String titulo, List<String> autores, Integer ano, Genero genero) {
		this.titulo = titulo;
		this.autores = new ArrayList<String>();
		this.ano = ano;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
