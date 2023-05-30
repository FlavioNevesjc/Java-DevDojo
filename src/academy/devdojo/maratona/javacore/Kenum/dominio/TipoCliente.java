package academy.devdojo.maratona.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA (1, "Pessoa Fisica"),
    PESSOA_JURIDICA (2, "Pessoa Juridica");

    private final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }
}

