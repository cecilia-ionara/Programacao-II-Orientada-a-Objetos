package q1;

public abstract class Terrestre extends Transporte {
	
	private Integer numeroRodas;
	private String cor;
	private String placa;
	
	public Terrestre(Integer capacidade, Integer numeroRodas, String cor, String placa) {
		super(capacidade);
		this.numeroRodas = numeroRodas;
		this.cor = cor;
		this.placa = placa;
	}

	public Integer getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(Integer numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "numeroRodas=" + numeroRodas + ", cor=" + cor + ", placa=" + placa + ", "
				+ super.toString();
	}

}
