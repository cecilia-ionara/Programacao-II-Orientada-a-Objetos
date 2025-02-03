package exercicios;

public class Universidade {
	 public static void main(String[] args) {
		Discente d1 = new Discente("Josué Xavier", 202405);
		Discente d2 = new Discente("Gabriel Carlos", 202407);
		Discente d3 = new Discente("Alice Silva", 202409);
		Discente d4 = new Discente("Mary Nascimento", 2024010);
		
		Professor p1 = new Professor("Hugo Kuribayashi", "IA");
		
		Professor o1 = new Orientador("Léia de Sousa", "Algoritmo", "Lógica de Programação");
		
		Turma t1 = new Turma(p1);
		t1.adicionarDiscente(d1);
		t1.adicionarDiscente(d2);
		t1.adicionarDiscente(d3);
		t1.adicionarDiscente(d4);
		
		System.out.println("Lista de discentes: "+ t1.getDiscentes());
		System.out.println(o1.toString());
		
		System.out.println();
		
		System.out.println(p1.toString());
		System.out.println(t1.toString());
	 }
}
