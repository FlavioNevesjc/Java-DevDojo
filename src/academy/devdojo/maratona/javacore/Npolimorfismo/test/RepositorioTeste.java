package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.RepositoriobancoDeDados;

public class RepositorioTeste{
    public static void main(String[] args) {
        Repositorio repositoriobancoDeDados = new RepositorioArquivo();
        repositoriobancoDeDados.salvar();
    }
}
