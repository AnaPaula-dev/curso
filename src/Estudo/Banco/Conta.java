package Estudo.Banco;

public abstract class Conta implements Pconta {

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    @Override
    public void depositar(double valor) {
           saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    protected int getAgencia() {
        return agencia;
    }
    protected int getNumero() {
        return numero;
    }
    protected double getSaldo() {
        return saldo;
    }
   
    protected void InfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
