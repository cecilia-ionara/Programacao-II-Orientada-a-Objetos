package exercicio;

import java.util.List;
import java.util.ArrayList;

public class Autor {
	private String nome;
	private String email;
	private List<Autor> autor;

	public Autor(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.autor = new ArrayList<Autor>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Autor> getAutor() {
		return autor;
	}

	public void setAutor(List<Autor> autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", email=" + email + ", autor=" + autor + "]";
	}


}
