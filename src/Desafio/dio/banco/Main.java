package Desafio.dio.banco;
public class Main {

    public static void main(String[] args) {
        Cliente Rafael = new Cliente();
        Rafael.setNome("Rafael");
        Rafael.setCPF("05596542103");
        Rafael.setDataAbertura("10/06/2022");


        Conta cc = new ContaCorrente(Rafael);
        Conta poupanca = new ContaPoupança(Rafael);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}