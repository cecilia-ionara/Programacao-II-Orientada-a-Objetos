package respostas;

import java.util.ArrayList;

public class TestePokemon {
	public static void main(String[] args) {
		ArrayList<Ataque> ataque_kubyto = new ArrayList<Ataque>();
		ArrayList<Fraqueza> fraqueza_kubyto = new ArrayList<Fraqueza>();
		
		Ataque a1 = new Ataque(1, "Choque", 89, 90);
		Ataque a2 = new Ataque(2, "Rajada de trovao", 100, 95);
		Ataque a3 = new Ataque(3, "Descarga elétrica", 200, 100);
		
		Fraqueza f1 = new Fraqueza(1, "Água");
		Fraqueza f2 = new Fraqueza(2, "Gelo");
		Fraqueza f3 = new Fraqueza(3, "Psycho");
		
		PokemonEletrico pe1 = new PokemonEletrico(1, "Kubyto", 1.9, 30.2);
		
		ataque_kubyto.add(a1);
		ataque_kubyto.add(a2);
		ataque_kubyto.add(a3);
		
		fraqueza_kubyto.add(f1);
		fraqueza_kubyto.add(f2);
		fraqueza_kubyto.add(f3);
		
		System.out.println(pe1.toString());
		System.out.println(ataque_kubyto.toString());
		System.out.println(fraqueza_kubyto.toString());
	}
}
