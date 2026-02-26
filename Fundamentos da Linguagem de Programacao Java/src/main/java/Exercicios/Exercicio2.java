/*
Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.
Fórmula: área = lado X lado.
 */

package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado de um quadrado:");
        var ladoQuadrado = scanner.nextInt();
        var area = ladoQuadrado * ladoQuadrado;
        System.out.printf("A área desse quadrado é de %s", area);
    }
}
