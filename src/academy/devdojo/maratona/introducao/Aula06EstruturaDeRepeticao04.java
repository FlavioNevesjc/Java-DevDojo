package academy.devdojo.maratona.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 70000d;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela <1000) {
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ "+valorParcela);
        }
    }
}