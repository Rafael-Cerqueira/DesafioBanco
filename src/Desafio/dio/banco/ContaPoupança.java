package Desafio.dio.banco;

public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Dados Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
