package academy.devdojo.maratona.javacore.Hheranca.test;

import academy.devdojo.maratona.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratona.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setEndereco("Rua 10");
        endereco.setCep("02345-678");
        Pessoa pessoa = new Pessoa("Flávio");
        pessoa.setCpf("12345566");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("###################");
        Funcionario funcionario = new Funcionario("Frederico");
        funcionario.setCpf("1233333333");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();

    }
}
