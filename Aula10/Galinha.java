package Aula10;

public class Galinha extends Ave {

	@Override
	public void bicar() {
		System.out.println("Você foi bicado!");
	}

	@Override
	public void mover() {
		System.out.println("A galinha atravessou a rua");
	}

	@Override
	public void falar() {
		System.out.println("Cocoricó");
	}
	
}
