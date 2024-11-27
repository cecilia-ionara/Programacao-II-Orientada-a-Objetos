package q1;

public class TestaJornada {
	public static void main(String[] args) {
		// apresentacao 1
		Professor p1 = new Professor(2020123, "Joao da Silva");
		Discente d1 = new Discente(2024123, "Mariana Alves", 7, 6.7, p1);
		Artigo a1 = new Artigo(34, "Analise de Solo", "resultados da analise do solo em uma roça abandonada", d1);
		Apresentacao ap1 = new Apresentacao(1, "Sala 1", "15h", a1);

		// apresentacao 2
		Professor p2 = new Professor(2014123, "Maria Chagas");
		Discente d2 = new Discente(202210939, "Kaleb vieira", 3, 8.7, p2);
		Artigo a2 = new Artigo(39, "Inteligencia Artificial", "como a IA tem impactado o meio ambiente", d2);
		Apresentacao ap2 = new Apresentacao(2, "Sala 45", "19h", a2);

		// print apresentacao 1
		System.out.println(d1.toString());
		System.out.println(p1.toString());
		System.out.println(a1.toString());
		System.out.println(ap1.toString());

		System.out.println("\n");
		// print apresentacao 2
		System.out.println(d2.toString());
		System.out.println(p2.toString());
		System.out.println(a2.toString());
		System.out.println(ap2.toString());

	}
}
