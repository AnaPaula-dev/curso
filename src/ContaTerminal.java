import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       try{

       System.out.println("Por favor digite o número da conta! ");
       int numeroConta = scanner.nextInt();
       scanner.nextLine();

       System.out.println("Por favor informe sua agênncia: ");
       String agencia = scanner.nextLine();
        
       System.out.println("Por favor informe se nome: ");
       String nomeCliente = scanner.nextLine();

       System.out.println("Por favor informe seu saldo: ");
       double saldo = scanner.nextDouble();

        System.out.println("Olá¡ " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agênncia é " + agencia +", conta " + numeroConta + " e seu saldo " + saldo +  " já está disponível para saque");


       
       } catch (InputMismatchException e){
        System.err.println("os campos com exeção de nome precisão ser numeros!");
       } finally{
        scanner.close();
       }
    }
}