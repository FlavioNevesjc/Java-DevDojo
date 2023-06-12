package academy.devdojo.maratona.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Flávio"; //String constant pool
        String nome2 = "Flávio";
        nome = nome.concat(" Neves");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Flávio");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
