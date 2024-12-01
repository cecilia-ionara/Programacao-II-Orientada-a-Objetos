package questao3;

public class TesteCirculo {
		public static void main(String[] args) {
			Ponto p1 = new Ponto(10.0);
			Circulo c1 = new Circulo(2.0, p1);
			
			//infla e desinfla
			c1.inflar(10.0); // 12
			c1.desinflar(1.0); // 11

			System.out.println(c1.toString());
			System.out.println(p1.toString());

			System.out.println("\n");
			
			//move ponto
			Ponto p2 = new Ponto(20.0); 
			Circulo c2 = new Circulo(5.0, p2);
			
			p2.moveCirculo(70.0);

			System.out.println(c2.toString());
			System.out.println(p2.toString());

		}
}
