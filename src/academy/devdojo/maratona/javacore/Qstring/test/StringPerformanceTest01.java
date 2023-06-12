package academy.devdojo.maratona.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(3000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (fim = inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(3000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Builder "+ (fim = inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(3000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Buffer "+ (fim = inicio) + " ms");
    }

    private static void concatString (int tamanho){
        String texto = "";
        for (int i = 0; i< tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder (int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i< tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer (int tamanho){
        StringBuffer sB = new StringBuffer(tamanho);
        for (int i = 0; i< tamanho; i++) {
            sB.append(i);
        }
    }
}
