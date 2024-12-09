package respostas;

public class TestaContaBancaria {
	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria(25.6, "Mary");
		ContaBancaria c2 = new ContaBancaria(0.0, "Cecilia");
		ContaBancaria c3 = new ContaBancaria(3550.6, "Emerson");

		c1.sacar(10.0);
		c2.depositar(950.00);
		c1.depositar(800.00);
		c3.sacar(1000.0);
		c1.sacar(50.0);
		c2.depositar(-100.0);
		c3.sacar(-2000.0);
		c1.sacar(500.0);

		System.out.println();
		System.out.println(c1.exibirDados());
		System.out.println();

		System.out.println(c2.exibirDados());
		System.out.println();

		System.out.println(c3.exibirDados());
		System.out.println();
	}
}
