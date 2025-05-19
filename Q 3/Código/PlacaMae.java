package Questão3;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numeroSlots;
    private String tipoMemoria;

    public PlacaMae(String fabricante, String chipset, int numeroSlots, String tipoMemoria) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroSlots = numeroSlots;
        this.tipoMemoria = tipoMemoria;
    }

    public void exibirInformacoes() {
        System.out.println("Placa-mãe:");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Chipset: " + chipset);
        System.out.println("Número de slots: " + numeroSlots);
        System.out.println("Tipo de memória: " + tipoMemoria);
    }

    public void atualizarDados(String fabricante, String chipset, int numeroSlots, String tipoMemoria) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroSlots = numeroSlots;
        this.tipoMemoria = tipoMemoria;
    }
}
