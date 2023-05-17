package academy.devdojo.maratona.introducao;

import java.net.SocketOption;

/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome     = "Flávio";
        String endereco = "Av Fulano";
        double salario  = 2000.28;
        String data     = "14/05/2023";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+"," +" confirmo que recebi o salario de "+salario+", na data "+data);
    }
}
