//questao 1
package atividades;

public class Casa {
	public String cor;
	public Porta porta1, porta2, porta3;
	public Pessoa proprietario;

	public Casa(String cor, Porta porta1, Porta porta2, Porta porta3, Pessoa proprietario) {
		this.cor = cor;
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;
		this.proprietario = proprietario;
	}

	void pinta(String novaCor) {
        cor = novaCor;
	}       
               
	int qtdPortasEstaoAbertas() {
        int cont = 0;
        if (porta1.estaAberta()) cont++;
        if (porta2.estaAberta()) cont++;
        if (porta3.estaAberta()) cont++;
        return cont;
    }
        
     void alteraProprietario(Pessoa novoProprietario) {
            proprietario = novoProprietario;
    }
}
