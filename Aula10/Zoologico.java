package Aula10;

public class Zoologico {
	public static void main(String[] args) {

		Animal a1 = new Gato();
		a1.falar();
		a1.mover();
		
		System.out.println();
		
		Ave a2 = new Galinha();
		a2.falar();
		a2.mover();
		a2.bicar();
		
		System.out.println();
		
		Ave a3 = new Pelicano();
		a3.falar();
		a3.mover();
	}
}
