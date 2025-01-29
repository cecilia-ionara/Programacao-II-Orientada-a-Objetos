package Aula12;

import java.util.ArrayList;
import java.util.List;

public class Time {
	public String nomeTime;
	public List<Atleta> atletas;
	
	public Time(String nomeTime) {
		this.nomeTime = nomeTime;
		this.atletas = new ArrayList<Atleta>();
	}
	
	public void adicionaAtleta(Atleta a) {
		this.atletas.add(a);
	}

	@Override
	public String toString() {
		return "nomeTime=" + nomeTime + ", atletas=" + atletas;
	}
	
	
}
