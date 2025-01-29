package Aula12;

public class Teste {

	public static void main(String[] args) {
		Universidade u1 = new Universidade("Unifesspa");

		u1.adicionaDepartamento("Administração");
		u1.adicionaDepartamento("Financeiro");
		u1.adicionaDepartamento("Informática");
		
		System.out.println(u1.toString());
		
		System.out.println();
		System.out.println();
		
		Categoria c1 = new Categoria(1, "Cosmetico");
		Produto p1 = new Produto(1, "Perfume de rosas", 29.99, c1);
		Produto p2 = new Produto(2, "Hidratante WePink", 100.99,c1);
		Produto p3 = new Produto(3, "Loção desodorante", 11.00, c1);
		
		c1.adicionaProduto(p1);
		c1.adicionaProduto(p2);
		c1.adicionaProduto(p3);
		
		System.out.println(c1.toString());
		
		System.out.println();
		System.out.println();
		
		Atleta a1 = new Atleta("Gabriel Carlos", 33, "Zagueiro");
		Atleta a2 = new Atleta("Josué Xavier", 20, "Goleiro");

		Time t1 = new Time("Os baitolas");
		
		t1.adicionaAtleta(a1);
		t1.adicionaAtleta(a2);
		
		System.out.println(t1.toString());
	}

}
