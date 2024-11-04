package exemplos;

public class TestadorDeGatos {
	public static void main(String[] args) {
		Gato g1 = new Gato();
		g1.nome = "Sushi";
		g1.qtdComidaDisponivel = 3;
		g1.sono = true;
		
		System.out.println("Nome: " + g1.nome);
	}
}
