package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome  = "Luffy";
        estudante.idade = 20;
        estudante.sexo  = 'M';

        System.out.println(estudante.nome);

    }
}
