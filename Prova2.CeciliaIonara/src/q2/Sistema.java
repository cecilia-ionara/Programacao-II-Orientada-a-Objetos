package q2;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Quantas mídias você deseja cadastrar?");
		int quantidade = leitor.nextInt();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Informe o titulo da mídia: ");
			String titulo = leitor.next();

			System.out.println("Informe o ano de lançamento da mídia: ");
			Integer anoLancamento = leitor.nextInt();

			System.out.println("Informe o gênero: COMEDIA, DRAMA, TERROR: ");
			Genero genero = Genero.valueOf(leitor.next());

			System.out.println("A midia é filme ou serie?");
			String opcao = leitor.next();
			if (opcao.equals("Filme")) {
				System.out.println("Informe a duração em minutos:");
				Integer duracao = leitor.nextInt();

				Filme f1 = new Filme(titulo, anoLancamento, genero, duracao);
				System.out.println(f1.toString());

			} else if (opcao.equals("Serie")) {
				System.out.println("Informe a quantidade de temporadas: ");
				Integer temporada = leitor.nextInt();

				System.out.println("Informe o titulo do episodio: ");
				String tituloEp = leitor.next();

				System.out.println("Informe a duração do episódio em minutos:");
				Integer duracaoEp = leitor.nextInt();
				
				Serie s1 = new Serie(titulo, anoLancamento, genero, temporada);
				
				s1.adicionarEp(tituloEp,duracaoEp);
				
				System.out.println(s1.toString());
			}
		}
	}
}
