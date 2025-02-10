package Aula13;

public class Estagiario extends Pessoa implements UsuarioSistema {
	
	private Double valorBolsa;
	
	public Estagiario(String nome, Double valorBolsa) {
		super(nome);
		this.valorBolsa = valorBolsa;
	}

	@Override
	public Boolean login(String user, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(Double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

	@Override
	public String toString() {
		return "Estagiario [valorBolsa=" + valorBolsa + ", toString()=" + super.toString() + "]";
	}

}
