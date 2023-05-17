package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio01 {
    public static void main(String[] args) {
        Carro Fox    = new Carro();
        Carro Meriva = new Carro();


        Fox.nome   = "Fox";
        Fox.modelo = "Confortline";
        Fox.ano    = 2020;

        Meriva.nome   = "Meriva";
        Meriva.modelo = "Maxx";
        Meriva.ano    = 2012;

        System.out.println("Carro: "+Fox.nome+" Modelo: "+ Fox.modelo+" Ano: "+Fox.ano);
        System.out.println("Carro: "+Meriva.nome+" Modelo: "+ Meriva.modelo+" Ano: "+Meriva.ano);
    }
}
