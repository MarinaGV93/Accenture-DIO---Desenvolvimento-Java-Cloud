/*
Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 */

package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        var scanner  = new Scanner(System.in);

        System.out.println("Escreva um número de 1 à 9:");
        var num = scanner.nextInt();

        for (var i = 1; i <= 10; i++){
            var tab = (num * i);
            System.out.printf("%s X %s = %s\n", num, i, tab);
        }
    }
}
