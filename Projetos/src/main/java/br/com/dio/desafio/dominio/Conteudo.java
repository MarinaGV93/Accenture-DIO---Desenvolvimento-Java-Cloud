//Classe pai de Curso e Mentoria

package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //Constante
    protected static final double XP_PADRAO = 10d;

    //Atributos em comum de Curso e Mentoria
    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
