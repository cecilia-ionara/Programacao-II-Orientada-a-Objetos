package respostas;

public class Pessoa {
    private String nome;
    private Integer anoNascimento;
    private String email; 
    private Integer idade; 

    public Pessoa(String nome, Integer anoNascimento, String email) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
    }

    private Boolean validaAno() {
        return 2024 >= this.anoNascimento && 1923 <= this.anoNascimento;
    }

    private void calculaIdade() {
        this.idade = 2024 - this.anoNascimento; 
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String retornaDadosPessoa() {
        if (validaAno()) {
            calculaIdade();
            return "Nome: " + this.nome +
                   "\nIdade: " + this.idade + 
                   "\nEmail: " + this.email;
        } else {
            return "Ano de nascimento inválido!";
        }
    }
}
