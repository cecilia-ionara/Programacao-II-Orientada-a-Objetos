package Aula03;

public class Porta {
	
	public Boolean aberta;
	public Double dimensaoX, dimensaoY, dimensaoZ;
	public Cor corPorta;
	
	public Porta(Double dimX, Double dimY, Double dimZ) {
		this.corPorta = Cor.BRANCA;
		this.aberta = false;
		this.dimensaoX = dimX;
		this.dimensaoY = dimY;
		this.dimensaoZ = dimZ;
	}
	
	public void fechar() {
		this.aberta = false;
	}
	
	public void abrir() {
		this.aberta = true;
	}
	
	public void pintar(Cor novaCor) {
		this.corPorta = novaCor;
	}
	
	public String toString() {
		if(this.aberta)
			return "Porta aberta e da cor "+this.corPorta;
		else return "Porta fechada e da cor "+this.corPorta;
	}
	
}