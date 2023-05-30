package academy.devdojo.maratona.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de pessoas");
    }


    {
        System.out.println("Dentro do bloco de inicialização de pessoas 1 ");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoas 2 ");
    }
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome: " +this.nome);
        System.out.println("CPF: " +this.cpf);
        System.out.println( this.endereco.getEndereco()+" "+this.endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}