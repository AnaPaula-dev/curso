package Desafios.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
                int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            if (parametroDois<parametroUm) {
                System.out.println(exception.getMessage());
            }
            terminal.close();
			//imprimir a mensagem: O segundo parametro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm � MAIOR que parametroDois e lancar a exceção
		if (parametroDois<parametroUm){
            throw new ParametrosInvalidosException();
        }
				//realizar o for para imprimir os n�meros com base na variavel contagem
                int  contagem = parametroDois - parametroUm;;
        for(int i = 1; i <= contagem; i++){
          
            System.out.println("Imprimindo o n�mero "+ i );
        }
	}
}
