package Tarefa3;

public class Reta {
	public Double a; // Coeficiente angular
	public Double b; // Coeficiente linear

	public Ponto ponto1;
	public Ponto ponto2;

	public Reta(Double a, Double b) {
		this.a = a;
		this.b = b;
	}

	public Reta(Ponto ponto1, Ponto ponto2) {
		if (ponto1.x.equals(ponto2.x)) {
			throw new IllegalArgumentException("Os pontos fornecidos criam uma reta vertical.");
		}
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
		this.a = (ponto2.y - ponto1.y) / (ponto2.x - ponto1.x);// Cálculo do coeficiente angular
		this.b = ponto1.y - this.a * ponto1.x; // Cálculo do coeficiente linear
	}

	public boolean pertence(Ponto ponto) {
		return ponto.y.equals(this.a * ponto.x + this.b);
	}

	public Ponto intersecao(Reta outra) {
		if (this.a.equals(outra.a)) {
			return null; // Retas paralelas
		}
		// Calcula x e y do ponto de interseção
		double x = (outra.b - this.b) / (this.a - outra.a);
		double y = this.a * x + this.b;
		return new Ponto(x, y);
	}

	public String toString() {
		return "y = " + a + "x + " + b;
	}

}
