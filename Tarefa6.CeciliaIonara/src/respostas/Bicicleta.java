package respostas;

public class Bicicleta extends Veiculo {
	private Integer tamanhoAro;
	private Integer tamanhoQuadro;
	
	public Bicicleta(String marca, String modelo, Double velocidade, Integer tamanhoAro, Integer tamanhoQuadro) {
		super(marca, modelo, velocidade);
		this.tamanhoAro = tamanhoAro;
		this.tamanhoQuadro = tamanhoQuadro;
	}

	public Integer getTamanhoAro() {
		return tamanhoAro;
	}

	public void setTamanhoAro(Integer tamanhoAro) {
		this.tamanhoAro = tamanhoAro;
	}

	public Integer getTamanhoQuadro() {
		return tamanhoQuadro;
	}

	public void setTamanhoQuadro(Integer tamanhoQuadro) {
		this.tamanhoQuadro = tamanhoQuadro;
	}

	@Override
	public String toString() {
		return "Bicicleta [tamanho do aro=" + tamanhoAro + ", tamanho do quadro=" + tamanhoQuadro + ", marca=" + marca
				+ ", modelo=" + modelo + ", velocidade=" + velocidade + "]";
	}
	
}
