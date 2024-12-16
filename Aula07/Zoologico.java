package Aula07;

public class Zoologico {
	private static Double totalPesoAnimais = 0.0;
	
	public static void pesarAnimal(Animal a) {
		Zoologico.totalPesoAnimais += a.getPeso();
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal(1.2, 9.2);
		a1.corre();
		Animal a2 = new Animal(5.2,2.0);
		a2.corre();
		Ave av1 = new Ave(0.9, 1.2);
		av1.corre();
		
		Zoologico.pesarAnimal(a1);
		Zoologico.pesarAnimal(a2);
		Zoologico.pesarAnimal(av1);
		
		av1.voa();
		System.out.println(Zoologico.totalPesoAnimais);
		
		av1.imprimirDadosAve();
	}
}
