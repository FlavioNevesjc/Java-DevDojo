package academy.devdojo.maratona.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratona.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratona.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Fulano de tal");
        System.out.println((carro.COMPRADOR));
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
