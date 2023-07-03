package academy.devdojo.maratona.javacore.Ycolecoes.test;

import academy.devdojo.maratona.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1222d","Iphone");
        Smartphone s2 = new Smartphone("1222d","Iphone");
        System.out.println(s1.equals(s2));
    }
}
