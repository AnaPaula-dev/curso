package Estudo.Conta;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       try{

       System.out.println("Por favor digite o n�mero da conta! ");
       int numeroConta = scanner.nextInt();
       scanner.nextLine();

       System.out.println("Por favor informe sua ag�ncia: ");
       String agencia = scanner.nextLine();
        
       System.out.println("Por favor informe se nome: ");
       String nomeCliente = scanner.nextLine();

       System.out.println("Por favor informe seu saldo: ");
       double saldo = scanner.nextDouble();

        System.out.println("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�nncia � " + agencia +", conta " + numeroConta + " e seu saldo " + saldo +  " j� est� dispon�vel para saque");


       
       } catch (InputMismatchException e){
        System.err.println("os campos com exe��o de nome precis�o ser numeros!");
       } finally{
        scanner.close();
       }
    }
}