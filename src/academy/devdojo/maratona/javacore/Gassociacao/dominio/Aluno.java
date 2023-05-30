package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Aluno {
    private String Aluno;
    private int idade;
    private Seminario seminario;

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String aluno) {
        Aluno = aluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
