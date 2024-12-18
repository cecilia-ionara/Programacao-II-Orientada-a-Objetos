package respostas;

import java.util.List;
public class Pokemon {
	protected Integer idPokedez;
	protected String nome;
	protected Double altura;
	protected Double peso;
	protected List<Ataque> ataque;
	protected List<Fraqueza> fraqueza;
	
	public Pokemon(Integer idPokedez, String nome, Double altura, Double peso) {
		super();
		this.idPokedez = idPokedez;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pokemon [idPokedez=" + idPokedez + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + "]";
	}
}
