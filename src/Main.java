import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso spring");
        curso2.setDescricao("descrição");
        curso2.setCargaHoraria(20);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());


        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Philips Fullstack Developer");
        bootcamp.setDescricao("Descrição Bootcamp Philips");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus Dias");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());


        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calculaTotalXp());


        System.out.println("-----------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João Silva");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());


        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calculaTotalXp());

    }
}
