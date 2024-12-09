package respostas;

public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Mary", 1990, "marycarvalho76@gmail.com");
        Pessoa p2 = new Pessoa("João", 1985, "joaosilva12@gmail.com");
        Pessoa p3 = new Pessoa("Carlos", 2000, "carlos23@gmail.com");

        p1.setNome("João Alves");
        p2.setEmail("mary.silva@email.com");
        p3.setAnoNascimento(1995);  
        
        Pessoa p4 = new Pessoa("Isabel", 2050, "isabel123@gmail.com");
        
        System.out.println(p1.retornaDadosPessoa());
        System.out.println();

        System.out.println(p2.retornaDadosPessoa());
        System.out.println();

        System.out.println(p3.retornaDadosPessoa());
        System.out.println();

        System.out.println(p4.retornaDadosPessoa());
    }
}
