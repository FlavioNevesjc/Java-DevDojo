package academy.devdojo.maratona.javacore.Ycolecoes.test;

import academy.devdojo.maratona.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("aaaa11", "Iphone");
        Smartphone s2 = new Smartphone("bbbb11", "Xiaomi");
        Smartphone s3 = new Smartphone("cccc11", "Motorola");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("cccc11", "Morotora");
        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
