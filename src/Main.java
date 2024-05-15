import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dev jonas = new Dev();
        jonas.setNome("Jonas");

        Conteudo java = new Curso("Java","Curso sobre java",10);
        Conteudo mentoriaJava = new Mentoria("java","Mentoria sobre java");
    
        Conteudo collections = new Curso("Collections","Conhecendo collections",8);
        Conteudo mentoriaCollections = new Mentoria("Collections","Mentoria sobre collections");

        Bootcamp bootcampJava = new Bootcamp();

        bootcampJava.setNome("Bootcamp Java");
        bootcampJava.setDescricao("Bootcamp de Java");
        bootcampJava.setConteudos(java);
        bootcampJava.setConteudos(mentoriaJava);
        bootcampJava.setConteudos(collections);
        bootcampJava.setConteudos(mentoriaCollections);

        jonas.inscreverBootcamp(bootcampJava);
        System.out.println(jonas.getConteudosInscritos());
        jonas.progredir();
        bootcampJava.setDevsInscritos(jonas);
        System.out.println(bootcampJava.getDevsInscritos());

    }
}
