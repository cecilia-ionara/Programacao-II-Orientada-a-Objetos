package respostas;

public class Carro extends Veiculo{ 
	protected String placa;
	protected Boolean ligado;
	
	public Carro(String marca, String modelo, Double velocidade, String placa, Boolean ligado) {
		super(marca, modelo, velocidade);
		this.placa = placa;
		this.ligado = ligado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Boolean getLigado() {
		return ligado;
	} 
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", ligado=" + ligado + ", marca=" + marca + ", modelo=" + modelo
				+ ", velocidade=" + velocidade + "]";
	}
	
}

