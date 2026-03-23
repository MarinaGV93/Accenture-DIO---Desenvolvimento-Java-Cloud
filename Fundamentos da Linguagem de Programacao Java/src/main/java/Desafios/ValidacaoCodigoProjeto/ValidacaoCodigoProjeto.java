/*
Você foi contratado como consultor de gestão em tecnologia da informação para a empresa VisionTech. Seu primeiro desafio é ajudar a equipe a organizar o cadastro de projetos internos. Cada projeto é identificado por um código no formato "departamento-numero", como "infra-101". O gerente deseja um sistema simples, orientado a objetos, que valide se o código do projeto está correto e, caso esteja, retorne o nome do departamento em letras maiúsculas. Se o código estiver incorreto, o sistema deve retornar "INVALIDO". O código é considerado válido apenas se o nome do departamento for composto por letras minúsculas (sem números ou símbolos), seguido de um hífen e um número inteiro positivo (sem zeros à esquerda). Sua tarefa é implementar essa validação para garantir a padronização dos registros.

Implemente uma solução orientada a objetos que leia um código de projeto e verifique se ele segue o padrão especificado. Se for válido, imprima o nome do departamento em letras maiúsculas. Caso contrário, imprima "INVALIDO". Não utilize bibliotecas externas.

Entrada
Uma única string representando o código do projeto, no formato "departamento-numero".

Saída
Imprima o nome do departamento em letras maiúsculas se o código for válido, ou "INVALIDO" caso contrário.
 */

/*

import java.util.Scanner;

package Desafios.Validação_De_Código_De_Projeto_Para_Gestão_De_TI;

class Projeto {
    private final String codigo;

    public Projeto(String codigo) {
        this.codigo = codigo;
    }

    public String validar() {
        // TODO: Verifique se o código está no formato correto e retorne o departamento em maiúsculas ou "INVALIDO"
        final String invalido = "INVALIDO";
        String[] partes = codigo != null && codigo.contains("-") ? codigo.split("-", 3) : new String[0];
        return partes.length == 2 && partes[0].matches("[a-z]+") && partes[1].matches("[1-9][0-9]*")
                ? partes[0].toUpperCase()
                : invalido;
    }
}

public class Validação_De_Código_De_Projeto_Para_Gestão_De_TI {
    Scanner scanner = new Scanner(System.in);
    String codigo = scanner.nextLine();

    Projeto projeto = new Projeto(codigo);
        System.out.println(projeto.validar());
}
 */
