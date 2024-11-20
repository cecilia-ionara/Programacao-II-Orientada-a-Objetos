package Tarefa3;

public class TesteReta {
	public static void main(String[] args) {
		
		Ponto p1 = new Ponto(1.0, 3.0);
		Ponto p2 = new Ponto(4.0, 9.0);

		Reta reta1 = new Reta(2.0, 1.0); // y = 2x + 1
		Reta reta2 = new Reta(p1, p2); // Calculada a partir dos pontos

		Ponto p3 = new Ponto(2.0, 5.0);
		System.out.println("O ponto (2, 5) pertence à reta 1? " + reta1.pertence(p3));

		System.out.println("Reta 1: " + reta1);
		System.out.println("Reta 2: " + reta2);

		Ponto intersecao = reta1.intersecao(reta2);
		if (intersecao != null) {
			System.out.println("Ponto de interseção: (" + intersecao.x + ", " + intersecao.y + ")");
		} else {
			System.out.println("As retas são paralelas.");
		}
	}
}
