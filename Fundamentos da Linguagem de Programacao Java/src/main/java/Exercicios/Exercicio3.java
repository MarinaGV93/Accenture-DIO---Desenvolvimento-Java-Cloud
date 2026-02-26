/*
Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
Fórmula: área = base X altura
 */

package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe a base de um retângulo:");
        var base = scanner.nextInt();
        System.out.println("Informe a altura desse retângulo:");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.printf("A área desse retângulo é de %s", area);
    }
}
