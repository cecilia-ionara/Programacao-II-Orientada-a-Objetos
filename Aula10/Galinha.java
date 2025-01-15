package Aula10;

public class Galinha extends Ave {

	@Override
	public void bicar() {
		System.out.println("Galinha bicando ...");
	}

	@Override
	public void mover() {
		System.out.println("Galinha correndo ...");
	}

	@Override
	public void falar() {
		System.out.println("Cocoricó ...");
	}
	
}
