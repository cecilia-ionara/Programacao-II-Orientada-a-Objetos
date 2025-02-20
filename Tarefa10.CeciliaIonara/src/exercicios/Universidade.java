package exercicios;

import java.util.HashMap;
import java.util.Map;

public class Universidade {
	private String nome;
	private String sigla;
	private Map<String, Faculdade> faculdades;

	public Universidade(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
		this.faculdades = new HashMap<String, Faculdade>();
	}
	
	public void adicionarFaculdade(String nome, String sigla) {
		this.faculdades.put(sigla, new Faculdade(nome, sigla));
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Map<String, Faculdade> getFaculdades() {
		return faculdades;
	}

	public void setFaculdades(Map<String, Faculdade> faculdades) {
		this.faculdades = faculdades;
	}

	@Override
	public String toString() {
		return "Universidade [nome=" + nome + ", sigla=" + sigla + ", faculdades=" + faculdades + ", toString()="
				+ super.toString() + "]";
	}

	
}
