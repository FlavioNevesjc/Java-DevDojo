package academy.devdojo.maratona.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Flávio");
        nomes.add("Regiane");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Onofre");
        nomes2.add("Albina");

        nomes.addAll(nomes2);


        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("*******************");
        nomes.add("Anthony");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
