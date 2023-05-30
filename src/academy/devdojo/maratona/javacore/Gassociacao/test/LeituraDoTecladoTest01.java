package academy.devdojo.maratona.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite seu nome abaixo: ");
        String nome = entrada.nextLine();
        System.out.printf("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("Digite M ou F para seu sexo: ");
        char sexo = entrada.next().charAt(0);
        System.out.println("\n\nNome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo);
    }
}
