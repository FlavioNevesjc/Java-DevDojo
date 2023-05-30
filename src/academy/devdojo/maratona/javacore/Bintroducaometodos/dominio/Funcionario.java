package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salarios;

    public void imprimir() {
        System.out.println(this.nome+ " tem a idade "+this.idade+" com o salarios abaixo:");
        for (double i: salarios) {
            System.out.println("R$ : "+i);
        }
        this.mediaSalario();
    }

    public void mediaSalario() {
        double totalSalario = 0;
        for (double i: this.salarios) {
            totalSalario += i;
        }
        totalSalario /= salarios.length;
        System.out.println("A media dos "+ salarios.length +" salarios é: "+totalSalario);;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
