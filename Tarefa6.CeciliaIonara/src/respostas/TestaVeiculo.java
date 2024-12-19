package respostas;

public class TestaVeiculo {
	public static void main(String[] args) {
		Carro c1 = new Carro("Ford", "Fiesta", 1200.00, "ABC1234", true);
		Carro c2 = new Carro("Chevrolet", "Onix", 1500.00, "XYZ5678", false);
		Carro c3 = new Carro("Volkswagen", "Polo", 1400.00, "DEF9087", true);

		Bicicleta b1 = new Bicicleta("Caloi", "Elite", 50.00, 8, 12);
		Bicicleta b2 = new Bicicleta("Sense", "Impact", 30.00, 7, 15);
		Bicicleta b3 = new Bicicleta("Monark", "Barra Forte", 25.00, 10, 10);
		
		c1.acelerar();
		c1.acelerar();
		
		b1.acelerar();
		
		c1.desligar();
		c2.ligar();
		c3.desligar();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());

	}
}
