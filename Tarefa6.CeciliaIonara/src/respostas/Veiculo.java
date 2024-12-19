package respostas;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected Double velocidade;
	
	public Veiculo(String marca, String modelo, Double velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar() {
		this.velocidade += 1.0;
	}
		
}
