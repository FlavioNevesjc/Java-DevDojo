package academy.devdojo.maratona.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de dados!!!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de dados");
    }
}
