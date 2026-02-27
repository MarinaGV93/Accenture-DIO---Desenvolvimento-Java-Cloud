/*
Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
 */

package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Escreva um número:");
        var num1 = scanner.nextInt();

        System.out.println("Escreva outro número maior que o primeiro:");
        var num2 = scanner.nextInt();

        System.out.println("Escolha par (1) ou ímpar (2)");
        var escolha = scanner.nextInt();

        for (var i = num2; i >= num1; i--){
            if (escolha == 1 && i % 2 == 0){
                System.out.println(i);
            } else if (escolha == 2 && i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
