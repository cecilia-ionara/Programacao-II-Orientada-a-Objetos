//questao 6
package atividades;

public class Data {
	public int dia;
    public int mes;
    public int ano;
   
    public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
    
//questao 7
	public String formatarData() {
        return dia + "/" + mes + "/" + ano;
	}

}
