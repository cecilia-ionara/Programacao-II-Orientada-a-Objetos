package atividade;

public class Universidade {
	public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        Docente d = new Docente();
        d.setNome("Josué Xavier");
        d.setSalario(19700.0);
        d.setTitulo(Titulacao.MESTRADO);
        sistema.adicionarPessoa(d);

        TecnicoAdministrativo t = new TecnicoAdministrativo();
        t.setNome("Mary Nascimento");
        t.setSalario(79000.0);
        t.setTitulo(Titulacao.ESPECIALIZACAO);
        sistema.adicionarPessoa(t);
     
        Aluno a1 = new Aluno();
        a1.setNome("Gabriel Carlos");
        a1.setCrg(5.0);
        a1.setId(1);
        a1.setUsername("gabriel carlos");
        a1.setMatricula(20244458);
        a1.setDataNascimento(java.time.LocalDate.of(2000, 2, 9));
        sistema.adicionarPessoa(a1);
        
        Aluno a2 = new Aluno();
        a2.setNome("Breno Wendel");
        a2.setCrg(3.0);
        a2.setId(2);
        a2.setUsername("breno");
        a2.setMatricula(2023004);
        a2.setDataNascimento(java.time.LocalDate.of(2002, 2, 3));
        sistema.adicionarPessoa(a2);

        Aluno a3 = new Aluno();
        a3.setNome("Cecíia Ionara");
        a3.setCrg(7.0);
        a3.setId(3);
        a3.setUsername("ceciliaionara");
        a3.setMatricula(2024935884);
        a3.setDataNascimento(java.time.LocalDate.of(2005, 12, 4));
        sistema.adicionarPessoa(a3);
        
        System.out.println(a1.toString());
        System.out.println(a1.toString());
        
        System.out.println(d.toString());
        System.out.println(t.toString());

        System.out.println("Média de Idade: " + sistema.calcularMediaIdade());
        System.out.println("Total de Incentivo de qualificação: " + sistema.calcularTotalIncentivoQualificacao());
	}
}
