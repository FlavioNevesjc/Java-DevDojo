package academy.devdojo.maratona.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não é digito
        // \s = Espaços em Branco
        // \S = Todos os caracteres que não são espaços
        // \w = Todos os caracteres a-Z e digitos, _
        // \W = Todos os caracteres especiais
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // () o(v|c) o - Procurando ovo ou oco
        // | ou
        // $ até o final da linha
        // 1.3 caracter coringa = 123 133 1@3 1A3 etc....
        
        String regex = "0[xX][0-9a-fA-F]+(\\s|$)"; // Nesta busca estou colocando 2 \\ para aceitar somente \d
        String texto = "12 0x 0X 0xFFAD 0x12G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n");
        }
    }
}
