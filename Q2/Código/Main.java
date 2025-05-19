package Questão2;

public class Main {
    public static void main(String[] args) {
        Instrutor andrya = new Instrutor("Andrya Almeida", "Mestre em Computação", "andryazinha@gmail.com", 10);
        Instrutor wemili = new Instrutor("Wemili Silva", "Doutor em IA", "wemilipereira@gmail.com", 15);

        Curso javaBasico = new Curso("Java Básico", 40, "Iniciante", "Aprenda os fundamentos de Java.");
        Curso iaAvancada = new Curso("IA Avançada", 60, "Avançado", "Técnicas modernas em Inteligência Artificial.");

        javaBasico.adicionarInstrutor(andrya);
        iaAvancada.adicionarInstrutor(wemili);
        iaAvancada.adicionarInstrutor(andrya);

        javaBasico.exibirDetalhes();
        System.out.println();
        iaAvancada.exibirDetalhes();
    }
}

