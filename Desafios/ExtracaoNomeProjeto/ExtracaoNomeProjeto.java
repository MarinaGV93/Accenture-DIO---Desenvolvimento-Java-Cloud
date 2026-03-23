/*
Você foi contratado como consultor de gestão em tecnologia da informação para a empresa VisionTech. Seu primeiro desafio é ajudar a equipe a organizar o cadastro de projetos internos. Cada projeto é identificado por um código no formato "Departamento-Nome", onde "Departamento" é uma palavra sem espaços e "Nome" é o nome do projeto, também sem espaços. Para garantir a padronização, a diretoria pediu um sistema orientado a objetos que extraia apenas o nome do projeto a partir do código fornecido. Sua tarefa é implementar uma solução que leia o código completo e retorne apenas o nome do projeto, ignorando o departamento. O sistema deve ser robusto para lidar com códigos que não seguem o padrão, retornando "INVALIDO" nesses casos. Não utilize bibliotecas externas.

Implemente uma classe que represente o projeto e um mét odo que extraia o nome do projeto do código informado. O mét odo deve validar se o código contém exatamente um hífen separando as duas partes e se ambas as partes não estão vazias. Caso contrário, retorne "INVALIDO".

Entrada
Uma única string representando o código do projeto no formato "Departamento-Nome".

Saída
Imprima apenas o nome do projeto, exatamente como aparece após o hífen, ou "INVALIDO" caso o código não siga o padrão especificado.
 */

/*

import java.util.Scanner;

package Desafios.Extração_Segura_Do_Nome_Do_Projeto_Em_ódigos_De_Cadastro;

class Projeto {
    private final String codigo;

    public Projeto(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProjeto() {
        final String invalido = "INVALIDO";
        String[] partes = codigo != null && codigo.contains("-") ? codigo.split("-", 3) : new String[0];
        return partes.length == 2 && !partes[0].isEmpty() && !partes[1].isEmpty() ? partes[1] : invalido;
    }
}

public class Extração_Segura_Do_Nome_Do_Projeto_Em_Códigos_De_Cadastro {
    Scanner sc = new Scanner(System.in);
    String codigo = sc.nextLine();

    Projeto projeto = new Projeto(codigo);

        System.out.println(projeto.getNomeProjeto());
}
 */
