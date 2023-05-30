package academy.devdojo.maratona.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de funcionario");
    }


    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1 ");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2 ");
    }

        public Funcionario(String nome) {
            super(nome);
            System.out.println("Dentro do construtor de Funcionario");

    }
    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de "+this.salario);
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

}
