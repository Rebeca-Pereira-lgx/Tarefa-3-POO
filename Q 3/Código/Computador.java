package Questão3;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private PlacaMae placaMae; // Composição

    public Computador(String marca, String modelo, String processador, int memoriaRAM,
                      String fabricantePlaca, String chipset, int numeroSlots, String tipoMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        // A placa-mãe é criada junto com o computador
        this.placaMae = new PlacaMae(fabricantePlaca, chipset, numeroSlots, tipoMemoria);
    }

    public void exibirDetalhes() {
        System.out.println("Computador:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + "GB");
        placaMae.exibirInformacoes();
        System.out.println("--------------------------------");
    }

    public void atualizarPlacaMae(String fabricante, String chipset, int numeroSlots, String tipoMemoria) {
        placaMae.atualizarDados(fabricante, chipset, numeroSlots, tipoMemoria);
    }
}

