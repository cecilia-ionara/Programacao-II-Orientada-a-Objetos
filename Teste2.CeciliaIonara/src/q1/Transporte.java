package q1;

public abstract class Transporte {
	private Integer capacidade;

	public Transporte(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "capacidade=" + capacidade;
	}	
	
}
