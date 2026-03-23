/*
Você foi contratado como consultor de tecnologia da informação para a empresa fictícia TechVision, que está modernizando seus processos internos. O time de gestão deseja simular o funcionamento de uma API simples para consulta de status de projetos, mas sem utilizar servidores reais. Sua missão é criar um programa que simule o endpoint de consulta: ao receber o nome de um projeto, o sistema deve retornar o status correspondente. Os dados de status estão pré-definidos e não mudam durante a execução. Caso o projeto consultado não exista, o sistema deve retornar a mensagem "Projeto nao encontrado". Essa simulação ajudará a equipe a entender o fluxo de requisições e respostas de uma API real, além de servir como base para futuras integrações.

Implemente um programa que leia uma string representando o nome do projeto e retorne o status associado. Os projetos e seus status são: "Apollo" - "Em andamento", "Orion" - "Concluido", "Zeus" - "Pendente", "Hermes" - "Cancelado". Para qualquer outro nome, retorne "Projeto nao encontrado". Não utilize bibliotecas externas ou estruturas avançadas; apenas condicionais simples e leitura de entrada padrão.

Entrada
Uma única string representando o nome do projeto a ser consultado.

Saída
Uma única string indicando o status do projeto ou a mensagem de erro, conforme especificado.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projeto = scanner.nextLine();

        System.out.println(switch (projeto) {
            case "Apollo" -> "Em andamento";
            case "Orion" -> "Concluido";
            case "Hermes" -> "Cancelado";
            default -> "Projeto nao encontrado";
        });

        // TODO: Imprima o status correto do projeto consultado, conforme a tabela do enunciado.
        // Dica: Use condicionais para comparar o nome do projeto e definir a resposta.
    }
}