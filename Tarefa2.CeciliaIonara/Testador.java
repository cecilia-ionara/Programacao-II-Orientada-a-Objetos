package atividades;

public class Testador {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Isadora", 22);
        p1.fazAniversario();
        System.out.println("Nome: " + p1.nome + ", Idade: " + p1.idade);

        Porta porta1 = new Porta(true, "Roxa", 2.9, 2.0, 0.10); 
        Porta porta2 = new Porta(false, "Azul", 6.5, 3.8, 0.15); 
        Porta porta3 = new Porta(true, "Amarela", 4.0, 6.0, 0.25); 

        
        Casa c1 = new Casa("Verde", porta1, porta2, porta3, p1);
        System.out.println("Cor da casa: " + c1.cor);

        c1.porta1.abre();
        c1.porta2.fecha();
        c1.porta3.abre();
        
		c1.porta1.pinta("Branca");
		c1.porta2.pinta("Verde");
		c1.porta3.pinta("Vermelha");

        System.out.println("Portas abertas: " + c1.qtdPortasEstaoAbertas());
        
        Pessoa p2 = new Pessoa("Gabriel", 23);
        c1.alteraProprietario(p2);
        System.out.println("Novo proprietario da casa: " + c1.proprietario.nome );
    }
}

