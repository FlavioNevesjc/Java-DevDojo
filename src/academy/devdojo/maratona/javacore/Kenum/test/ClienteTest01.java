package academy.devdojo.maratona.javacore.Kenum.test;

import academy.devdojo.maratona.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.Debito);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.Credito);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.Debito.calcularDesconto(100));
        System.out.println(TipoPagamento.Credito.calcularDesconto(100));

    }
}
