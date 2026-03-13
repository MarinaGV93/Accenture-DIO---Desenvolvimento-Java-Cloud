package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;

    //Usa set para dizer que é unico

    //A ordem de inscricao importa (LinkedHashSet)
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {

        //Adiciona tudo dentro do conteudoInscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());

        //Adiciona o dev no bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){

        //Pega o primeiro conteudo
        //Optional = para resolver o retorno null
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        //Se tiver conteudo
        if (conteudo.isPresent()){
            //Adiciona o conteudo no set de concluidos
            this.conteudosConcluidos.add(conteudo.get());

            //Remove o conteudo no set
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        //Pega cada conteudo dentro do set de concluidos, pega o XP de cada conteudo e soma
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //Incluir porque esta usando o LinkedHashSet

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
