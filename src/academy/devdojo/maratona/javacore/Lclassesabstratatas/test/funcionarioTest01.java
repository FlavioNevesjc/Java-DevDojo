package academy.devdojo.maratona.javacore.Lclassesabstratatas.test;

import academy.devdojo.maratona.javacore.Lclassesabstratatas.dominio.Desenvolvedor;
import academy.devdojo.maratona.javacore.Lclassesabstratatas.dominio.Gerente;

public class funcionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nani",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Flávio",12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprimi();
        desenvolvedor.imprimi();

    }
}
