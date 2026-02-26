/*
Escreva um código que recebe o nome e a idade de 2 pessoas e imprima a diferença entre elas
 */

package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scanner =  new Scanner(System.in);

        System.out.println("Informe o primeiro nome");
        var nome1 = scanner.next();
        System.out.printf("Informe sua idade %s\n", nome1);
        var idade1 = scanner.nextInt();

        System.out.println("Informe o segundo nome");
        var nome2= scanner.next();
        System.out.printf("Informe sua idade %s\n", nome2);
        var idade2 = scanner.nextInt();

        var diferenca = idade1 - idade2;

        System.out.printf("A diferença de idades é de %s", diferenca);
    }
}
