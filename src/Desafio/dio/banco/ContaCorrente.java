package Desafio.dio.banco;
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Dados Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}

