package q2;

public abstract class Midia {
	protected static Integer contador = 1;
	protected Integer id;
	protected String titulo;
	protected Integer ano;
	protected Genero genero;

	public Midia(String titulo, Integer ano, Genero genero) {
		this.id = contador++;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
	}

	public Integer getContador() {
		return contador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	@Override
	public String toString() {
		return "id=" + id + ", titulo=" + titulo + ", ano=" + ano + ", genero=" + genero;
	}


}
