import br.com.clark.desafio.dominio.Bootcamp;
import br.com.clark.desafio.dominio.Curso;
import br.com.clark.desafio.dominio.Dev;
import br.com.clark.desafio.dominio.Mentoria;

import java.time.LocalDate;

/**
 * @author Gabri
 */

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso python");
        curso2.setDescricao("Descrição do curso de python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devClark = new Dev();
        devClark.setNome("Clark");
        devClark.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Clark:");
        devClark.getConteudosInscritos().forEach(conteudo -> {
            System.out.println("--------------------------------");
            System.out.println(conteudo);
        });
        devClark.progredir();
        devClark.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos inscritos Clark:");
        devClark.getConteudosInscritos().forEach(conteudo -> {
            System.out.println("--------------------------------");
            System.out.println(conteudo);
        });
        System.out.println("===================================================================");
        System.out.println("Conteúdos Concluidos Clark:");
        devClark.getGetconteudosConcluidos().forEach(conteudo -> {
            System.out.println("--------------------------------");
            System.out.println(conteudo);
        });
        System.out.println("XP: " + devClark.calcularTotalXp());

        System.out.println("===================================================================");

        Dev devPaloma = new Dev();
        devPaloma.setNome("Paloma");
        devPaloma.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Paloma:");
        devPaloma.getConteudosInscritos().forEach(conteudo -> {
            System.out.println("--------------------------------");
            System.out.println(conteudo);
        });
        devPaloma.progredir();
        devPaloma.progredir();
        devPaloma.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos inscritos Paloma:");
        devPaloma.getConteudosInscritos().forEach(conteudo -> {
            System.out.println("--------------------------------");
            System.out.println(conteudo);
        });
        System.out.println("===================================================================");
        System.out.println("Conteúdos Concluidos Paloma:");
        devPaloma.getGetconteudosConcluidos().forEach(conteudo -> {
            System.out.println("--------------------------------");
            System.out.println(conteudo);
        });
        System.out.println("XP: " + devPaloma.calcularTotalXp());


        System.out.println("================");

        System.out.println(devClark.isBootcampFinish(bootcamp));
        System.out.println(devPaloma.isBootcampFinish(bootcamp));


    }
}
