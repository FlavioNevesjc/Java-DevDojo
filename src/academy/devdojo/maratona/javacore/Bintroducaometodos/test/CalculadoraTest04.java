package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int nu1 = 1;
        int nu2 = 2;

        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(nu1, nu2);
        System.out.printf("Nn1: "+nu1);
        System.out.printf("Nu2: "+nu2);

    }
}
