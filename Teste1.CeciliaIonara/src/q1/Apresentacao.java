package q1;

public class Apresentacao {
	public Integer numero;
	public String local;
	public String horario;
	public Artigo artigo;

	public Apresentacao(Integer numero, String local, String horario, Artigo artigo) {
		this.numero = numero;
		this.local = local;
		this.horario = horario;
		this.artigo = artigo;
	}

	public String toString() {
		return "A apresentação " + this.numero + " ocorrerá no local " + this.local + " às " + this.horario + ".";
	}

}
