package Aula03;

public class Casa {

	public Pessoa proprietario;
	
	public Cor corCasa;
	
	public Porta porta1;
	
	public Porta porta2;
	
	public Porta porta3;

	public Casa(Pessoa proprietarioCasa) {
		this.proprietario = proprietarioCasa;
		this.corCasa = Cor.BRANCA;
		this.porta1 = new Porta(0.3,2.0,0.2);
		this.porta2 = new Porta(0.3,2.3,0.6);
		this.porta3 = new Porta(0.3,2.0,0.2);
	}
	
	public Casa(Pessoa proprietarioCasa, Cor corDaCasa) {
		this.proprietario = proprietarioCasa;
		this.corCasa = corDaCasa;
		this.porta1 = new Porta(0.3,2.0,0.2);
		this.porta2 = new Porta(0.3,2.3,0.6);
		this.porta3 = new Porta(0.3,2.0,0.2);
	}
	
	public void pintarCasa(Cor novaCorDaCasa) {
		this.corCasa = novaCorDaCasa;
		this.porta1.pintar(novaCorDaCasa);
		this.porta2.pintar(novaCorDaCasa);
		this.porta3.pintar(novaCorDaCasa);
	}
	
	public Integer qtdPortasEstaoAbertas() {
		Integer i = 0;
		if (this.porta1.aberta)
			i++;
		if (this.porta2.aberta)
			i++;
		if (this.porta3.aberta)
			i++;
		return i;
	}
	
	public void alterarProprietario (Pessoa novoProprietario) {
		this.proprietario = novoProprietario;
	}
	
	public String toString() {
		return "Casa: "+ this.proprietario + "\n"
				+ "Cor da casa: " + this.corCasa + "\n"
				+ "Porta 1: " + this.porta1 + "\n"
				+ "Porta 2: " + this.porta2 + "\n"
				+ "Porta 3: " + this.porta3;
	}
}
