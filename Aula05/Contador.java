//(1) Zerar o contador (void); 
//(2) Incrementar o contador (void); 
//e (3) Retornar o valor do contador (Integer)
package Aula05;

public class Contador {
	private Integer valor;
	
	public Contador() {
		this.valor = 0;
	}
	
	public void zerar() {
		this.valor = 0;
	}
	
	public void incrementar() {
		this.valor += 1;
	}
	
	public void decrementar() {
		this.valor -= 1;
	}
	
	public Integer getContador(){
		return this.valor;
	}
}
