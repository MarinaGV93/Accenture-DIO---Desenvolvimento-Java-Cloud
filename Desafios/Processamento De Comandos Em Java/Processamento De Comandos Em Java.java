/*
Você é um consultor de gestão em tecnologia da informação contratado por uma empresa que deseja simular o funcionamento de uma API interna para treinar sua equipe. O objetivo é criar um sistema simples que receba comandos de consulta e retorne respostas padronizadas, como se estivesse interagindo com um serviço real. Cada comando recebido representa uma requisição à API, e sua tarefa é processar o comando e retornar a resposta apropriada, conforme as regras de negócio estabelecidas pela empresa. O sistema deve ser robusto para lidar tanto com comandos válidos quanto inválidos, fornecendo mensagens claras para cada situação. Sua solução será utilizada como base para treinar desenvolvedores iniciantes sobre o funcionamento básico de APIs e tratamento de respostas.

Implemente um programa que leia uma string representando um comando de consulta. Se o comando for "GET_STATUS", retorne "API OK". Se o comando for "GET_VERSION", retorne "v1.0.0". Se o comando for "RESTART", retorne "RESTARTING". Para qualquer outro comando, retorne "INVALID COMMAND". Não utilize bibliotecas externas. O programa deve processar apenas um comando por execução.

Entrada
Uma única linha contendo uma string representando o comando de consulta enviado à API.

Saída
Uma única linha contendo a resposta da API simulada, de acordo com as regras especificadas.
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando = scanner.nextLine();

        System.out.println(switch (comando) {
            case "GET_STATUS" -> "API OK";
            case "GET_VERSION" -> "v1.0.0";
            case "RESTART" -> "RESTARTING";
            default -> "INVALID COMMAND";
        });
    }
}