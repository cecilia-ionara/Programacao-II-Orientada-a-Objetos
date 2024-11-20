package Tarefa3;

public class TestaPais {
	public static void main(String[] args) {

		Pais brasil = new Pais("BRA", "Brasil", 213300000.00, 8515767.00);
		Pais argentina = new Pais("ARG", "Argentina", 4620000.00, 2780400.00);
		Pais uruguai = new Pais("URU", "Uruguai", 3600000.00, 176215.00);

		brasil.adicionarFronteira(argentina);
		brasil.adicionarFronteira(uruguai);
		argentina.adicionarFronteira(brasil);
		argentina.adicionarFronteira(uruguai);

		// igualdade semântica
		Pais brasil2 = new Pais("BRA", "Brasil", 213300000.00, 8515767.00);
		System.out.println("Brasil e Brasil2 são o mesmo país? " + brasil.eMesmoPais(brasil2));
		Pais mexico = new Pais("MEX", "México", 129800000.00, 1964375.00);
		System.out.println("Brasil e México são o mesmo país? " + brasil.eMesmoPais(mexico));

		// fronteiras
		System.out.println("\nBrasil faz fronteira com Argentina? " + brasil.eLimitrofe(argentina));
		System.out.println("Brasil faz fronteira com Uruguai? " + brasil.eLimitrofe(uruguai));
		System.out.println("Argentina faz fronteira com Uruguai? " + argentina.eLimitrofe(uruguai));

		// densidade populacional
		System.out.println("\nDensidade populacional do Brasil: " + brasil.densidadePopulacional());
		System.out.println("Densidade populacional do Uruguai: " + uruguai.densidadePopulacional());
		System.out.println("Densidade populacional da Argentina: " + argentina.densidadePopulacional());

		// Vizinhos comuns
		System.out.println("\nVizinhos comuns entre Brasil e Argentina: " + brasil.vizinhosComuns(argentina));

		// toString
		System.out.println("\n");
		System.out.println(brasil.toString());
	}
}
