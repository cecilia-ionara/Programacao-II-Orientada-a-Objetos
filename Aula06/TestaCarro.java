package Aula06;

public class TestaCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro("Classic");
		System.out.println(c1.getModelo());
		
		Carro c2 = new Carro("Hb20");
		c2.setModelo("Kicks");
		System.out.println(c2.getModelo());
		
		Carro c3 = new Carro("Celta");
		System.out.println(c3.getModelo());
		
		Carro c4 = new Carro("Hilux");
		
		System.out.println(Carro.getContador());
	}

}
