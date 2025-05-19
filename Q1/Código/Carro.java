package Questão1;

public class Carro {
    private String modelo;
    private Pessoa motoristaAtual;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMotoristaAtual(Pessoa motorista) {
        this.motoristaAtual = motorista;
    }

    public Pessoa getMotoristaAtual() {
        return motoristaAtual;
    }

    public void dirigir() {
        if (motoristaAtual != null) {
            System.out.println(motoristaAtual.getNome() + " está dirigindo o carro " + modelo);
        } else {
            System.out.println("Nenhum motorista atual para o carro " + modelo);
        }
    }
}
