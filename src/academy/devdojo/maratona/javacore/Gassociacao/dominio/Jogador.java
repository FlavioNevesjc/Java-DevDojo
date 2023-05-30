package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprimi (){
        System.out.println("Jogador: "+this.nome);
        if (time !=null) {
            System.out.println("Time: "+time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
