package academy.devdojo.maratona.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        int  count=0;
        while (count<10){
            count++;
            System.out.println(count);
        }

        do {
            System.out.println("Dentro do do-while: "+ ++count);
        } while (count < 20);

        for (int i=0; i<10;i++) {
            System.out.println("For "+i);
        }
    }
}
