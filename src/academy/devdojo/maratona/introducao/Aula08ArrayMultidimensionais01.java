package academy.devdojo.maratona.introducao;

public class Aula08ArrayMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        for (int[] arrBase: dias) {
            for (int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
