package questao3;

public class Circulo {
	public Double raio;
	public Ponto centro;

	public Circulo(Double raio, Ponto centro) {
		this.raio = raio;
		this.centro = centro;
	}

	public Circulo(Double raio) {
		this.raio = raio;
	}

	public void inflar(Double valor) {
		this.raio += valor;
	}

	public void desinflar(Double valor) {
		this.raio -= valor;
	}

	public String toString() {
		return "Raio: " + this.raio;
	}
}
