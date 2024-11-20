package Tarefa3;

public class Ponto {
	public Double x;
	public Double y;
	
	public Ponto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public Double calcularDistancia(Ponto outroPonto){
		
		return Math.sqrt(Math.pow(this.x - outroPonto.x,2) + Math.pow(outroPonto.y - this.y ,2));
		
	}
}
