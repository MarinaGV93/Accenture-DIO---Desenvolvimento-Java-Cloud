import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Instanciar o objeto
        Curso curso1 = new Curso();

        //Atribuir valores
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do curso de js");
        curso2.setCargaHoraria(9);

        //Criar um curso a partir da classe Conteudo (classe pai)
        //Tudo que tem em conteudo tem em curso, mas nem tudo que tem em curso tem em conteudo
        // Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria de Java");

        //Data atual
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição do bootcamp Java");
        // bootcamp.setConteudos(Set.of(curso1, curso2, mentoria));
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarina = new Dev();
        devMarina.setNome("Marina");

        //Inscrever
        devMarina.inscreverBootcamp(bootcamp);

        //O que esta inscrito
        System.out.println("\nConteúdos inscritos de " + devMarina.getNome() + " : " + devMarina.getConteudosInscritos());

        //Concluir
        devMarina.progredir();
        devMarina.progredir();
        devMarina.progredir();

        System.out.println("-");

        //O que esta concluido
        System.out.println("\nConteúdos concluidos de " + devMarina.getNome() + " : " + devMarina.getConteudosConcluidos());

        //XP
        System.out.println("\nXp de " + devMarina.getNome() + " : " + devMarina.calcularTotalXp());

        System.out.println("--------------------------------------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos de " + devLucas.getNome() + " : " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos concluidos de " + devLucas.getNome() + " : " + devLucas.getConteudosConcluidos());
        System.out.println("\nXp de " + devLucas.getNome() + " : " + devLucas.calcularTotalXp());
    }
}
