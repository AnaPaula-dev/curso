package Estudo.Banco;

public class Main {
public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    cc.depositar(100);

    Conta poupanca = new ContaPoupanca();

    cc.transferir(50, poupanca);
    poupanca.depositar(100);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
}
}
