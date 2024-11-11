//questao 1
package atividades;

public class Porta {
	
	public Boolean aberta;
	public Double dimensaoX, dimensaoY, dimensaoZ;
	public String cor;

		
		public Porta(Boolean aberta, String cor, Double dimensaoX, Double dimensaoY, Double dimensaoZ) {
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}

		public void abre() {
	        aberta = true;
	    }

	   public void fecha() {
	        aberta = false;
	    }

	   public void pinta(String novaCor) {
	        cor = novaCor;
	    }

	   public boolean estaAberta() {
	        return aberta;
	}
}
