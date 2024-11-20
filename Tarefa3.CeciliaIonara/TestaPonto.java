package Tarefa3;

public class TestaPonto {
	public static void main(String[] args) {

		Ponto ponto1 = new Ponto(1.0, 5.0);
		Ponto ponto2 = new Ponto(-2.0, 1.0);
		Ponto ponto3 = new Ponto(4.0, 1.0);

		Triangulo triangulo1 = new Triangulo(ponto1, ponto2, ponto3);

		System.out.println(ponto1.calcularDistancia(ponto3));

		System.out.println(triangulo1.calculaPerimetro());

	}
}
