package academy.devdojo.maratona.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Flávio Neves";
        nome.concat(" e Regiane");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Flávio Neves");
        sb.append(" e Regiane").append(" Paiva");
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
