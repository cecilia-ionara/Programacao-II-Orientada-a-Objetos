package q2;

public class Ponto {
	public Double centro;

	public Ponto(Double centro) {
		this.centro = centro;
	}

	public Ponto() {
		this.centro = 0.0;
	}
	
	public void moveCirculo(Double novoPonto) {
		this.centro = novoPonto;
	}
	
	public String toString() {
		return "Centro: " + this.centro;
	}

}
