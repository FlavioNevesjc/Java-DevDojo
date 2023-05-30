package academy.devdojo.maratona.javacore.Kenum.dominio;

public enum TipoPagamento{
    Debito{
        @Override
        public double calcularDesconto(double valor) {
            return (valor - (valor * 0.1));
        }
    }

    , Credito{
        @Override
        public double calcularDesconto(double valor) {
            return (valor - (valor * 0.05));
        }
    };

    public abstract double  calcularDesconto(double valor);
}
