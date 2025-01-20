package Aula11;

public abstract class Computador {
	protected String marca;
	protected Integer memoriaRAM;
	protected String placaGrafica;
	protected Boolean ligado = false;
	
	public void ligar() {
		this.ligado = true;
		System.out.println("Computador ligado");
	} 
	
	public void desligar() {
		this.ligado = false;
		System.out.println("Computador desligado");
	}

	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", memoriaRAM=" + memoriaRAM + ", placaGrafica=" + placaGrafica
				+ ", ligado=" + ligado + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(Integer memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public String getPlacaGrafica() {
		return placaGrafica;
	}

	public void setPlacaGrafica(String placaGrafica) {
		this.placaGrafica = placaGrafica;
	}

	public Boolean getLigado() {
		return ligado;
	}
	
}
