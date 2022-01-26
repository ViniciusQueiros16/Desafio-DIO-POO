package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargahoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devVinny = new Dev();
        devVinny.setNome("Vinicius");
        devVinny.inscreverCursos(bootCamp);
        System.out.println("Conteudos inscritos Vinny"+ devVinny.getConteudosInscritos());
        devVinny.progredir();
        devVinny.progredir();
        System.out.println("Conteudos inscritos Vinny"+ devVinny.getConteudosInscritos());
        System.out.println("Conteudos concluidos Vinny"+ devVinny.getConteudosConcluidos());
        System.out.println("XP: "+devVinny.calcularTotalXP());
        System.out.println("--------------------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverCursos(bootCamp);
        System.out.println("Conteudos inscritos João"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos João"+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos João"+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXP());
    }
}
