package Questão3;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(
                "Dell", "Inspiron 15", "Intel Core i7", 16,
                "ASUS", "B550", 4, "DDR4"
        );

        pc.exibirDetalhes();
        
        pc.atualizarPlacaMae("Gigabyte", "Z690", 6, "DDR5");

        System.out.println("\nApós atualização da placa-mãe:");
        pc.exibirDetalhes();
    }
}
