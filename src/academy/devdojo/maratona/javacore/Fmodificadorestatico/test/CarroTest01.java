package academy.devdojo.maratona.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratona.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Meriva",180);
        Carro c2 = new Carro("F40", 300);
        Carro c3 = new Carro("Mclaren", 350);
        c1.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
