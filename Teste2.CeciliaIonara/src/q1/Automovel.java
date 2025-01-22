package q1;

public class Automovel extends Terrestre {
	private Integer numeroPortas;

	public Automovel(Integer capacidade, Integer numeroRodas, String cor, String placa, Integer numeroPortas) {
		super(capacidade, numeroRodas, cor, placa);
		this.numeroPortas = numeroPortas;
	}

	public Integer getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(Integer numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	@Override
	public String toString() {
		return "numeroPortas=" + numeroPortas + ", " + super.toString();
	}
	
}
