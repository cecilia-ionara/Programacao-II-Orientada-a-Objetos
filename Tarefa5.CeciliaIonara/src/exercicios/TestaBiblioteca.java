package exercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class TestaBiblioteca {
	public static void main(String[] args) {
		Usuario h = new Usuario(121212, "Hugo Kuribayashi");
		
		List<String> listaAutores = new ArrayList<String>();
		listaAutores.add("Fulano");
		listaAutores.add("Ciclano");
		listaAutores.add("Beltrano");
		Livro l1 = new Livro("Programando com Python",
								listaAutores,			
								2024,
								Genero.FICCAO_CIENTIFICA);
		
		Exemplar ex1 = new Exemplar("a515");
		Exemplar ex2 = new Exemplar("a516");
		Exemplar ex3 = new Exemplar("a517");
		Exemplar ex4 = new Exemplar("a518");
		
		//Date dataDeHoje = new Date();
		List<Exemplar> lista = List.of(ex1, ex2);
		Emprestimo e1 = new Emprestimo(new Date(), new Date(), h, lista);
		
		h.getHistoricoEmprestimos().add(e1);
		h.getNome();
		h.getHistoricoEmprestimos();
	}
}
