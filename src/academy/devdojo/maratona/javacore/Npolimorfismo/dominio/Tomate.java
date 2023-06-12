package academy.devdojo.maratona.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    private String DataValidade;
    public static final double IMPOSTO_POR_CENTRO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTRO;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }

    public String getDataValidade() {
        return DataValidade;
    }
}
