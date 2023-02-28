import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Aprendendo Java");
        curso1.setCargaHoraria(4);
        curso1.calculaXp();

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Aprendendo JavaScript");
        curso2.setCargaHoraria(4);
        curso2.calculaXp();

        Mentoria mentoria1 =new Mentoria();
        mentoria1.setTitulo("mentoriaJava");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria JS ");
        mentoria2.setDescricao("Mentoria de JS ");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        */
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java developer");
        bootcamp1.setDescricao("desenvolvimento com java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(mentoria2);

        Dev devVictor = new Dev();
        devVictor.setNome("victor");
        devVictor.increverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Victor"+ devVictor.getConteudoInscrito());
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("Conteudos inscritos "+ devVictor.getConteudoInscrito());
        System.out.println("Conteudos concluidos "+ devVictor.getConteudoConcluido());
        System.out.println("Total de XP " + devVictor.calcularTotalXp());

        System.out.println("-------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.increverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Maria"+ devMaria.getConteudoInscrito());
        devMaria.progredir();
        System.out.println("Conteudos inscritos "+ devMaria.getConteudoInscrito());
        System.out.println("Conteudos concluidos "+ devMaria.getConteudoConcluido());
        System.out.println("Total de XP " + devMaria.calcularTotalXp());

    }
}