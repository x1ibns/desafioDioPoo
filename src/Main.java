import dominio.Curso;
import dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 =new Mentoria();
        mentoria1.setTitulo("mentoriaJava");
        mentoria1.setDescricao("Mentoria de Java");

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria JS ");
        mentoria2.setDescricao("Mentoria de JS ");

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}