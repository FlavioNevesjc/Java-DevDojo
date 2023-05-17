package academy.devdojo.maratona.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        int [] idades2 = {1,2,3,4,5};
        idades[0] = 21;
        idades[1] = 30;
        idades[2] = 21;
        for (int i=0; i< idades.length; i++){
            System.out.println(idades[i]);
        }
        for (int num: idades2){
            System.out.println(num);
        }
    }
}
