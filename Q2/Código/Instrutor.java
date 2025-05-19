package Questão2;

public class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int anosExperiencia;

    public Instrutor(String nome, String formacao, String email, int anosExperiencia) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.anosExperiencia = anosExperiencia;
    }

    public void exibirInformacoes() {
        System.out.println("Instrutor: " + nome);
        System.out.println("Formação: " + formacao);
        System.out.println("E-mail: " + email);
        System.out.println("Anos de experiência: " + anosExperiencia);
        System.out.println("--------------------------------");
    }

    public String getNome() {
        return nome;
    }
}
