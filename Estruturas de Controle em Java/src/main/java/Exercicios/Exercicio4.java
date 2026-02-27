/*
Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
 */

package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        var num = scanner.nextInt();

        while (true){
            System.out.println("Informe o número para verificação:");
            var verificacao = scanner.nextInt();

            if (verificacao < num) {
                System.out.printf("Informe um número maior que %s\n", num);
                continue;
            }

            var resultado  = verificacao % num;

            System.out.printf("%s %% %s = %s\n", verificacao, num, resultado);
            if (resultado != 0) break;
        }
    }
}
