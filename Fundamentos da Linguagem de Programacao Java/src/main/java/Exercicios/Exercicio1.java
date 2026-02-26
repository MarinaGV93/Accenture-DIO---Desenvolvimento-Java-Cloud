/*
Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */

package Exercicios;

import java.time.OffsetDateTime;
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome?");
        String nome = scanner.next();
        System.out.println("Qual seu ano de nascimento?");
        var idade = scanner.nextInt();

        //Pega o ano atual
        var ano = OffsetDateTime.now().getYear();

        var anos = ano - idade;
        System.out.printf("Olá %s você tem %s anos.", nome, anos);
    }
}
