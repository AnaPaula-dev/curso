package Estudo.Banco;

public class ContaCorrente extends Conta{


private static int SEQUENCIAL = 2;

public ContaCorrente(){
    super.agencia = AGENCIA_PADRAO;
    super.numero = SEQUENCIAL++;
}
public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
 super.InfosComuns();   
}
}