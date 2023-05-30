package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExer01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("João");
        funcionario01.setIdade(23);
        funcionario01.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario01.imprimir();
    }
}
