import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*polimorfismo
        Conteudo conteudo = new Curso();*/

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRada = new Dev();
        devRada.setNome("Radamés");
        devRada.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Radamés" + devRada.getConteudosInscritos());
        devRada.progredir();
        devRada.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Radamés" + devRada.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Radamés" + devRada.getConteudosConcluidos());
        System.out.println("XP: "+devRada.calcularTotalXp());

        System.out.println("-----------------");

        Dev devRamon = new Dev();
        devRamon.setNome("Ramon");
        devRamon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ramon" + devRamon.getConteudosInscritos());
        devRamon.progredir();
        devRamon.progredir();
        devRamon.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ramon" + devRamon.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ramon" + devRamon.getConteudosConcluidos());
        System.out.println("XP: "+devRamon.calcularTotalXp());

    }
}
