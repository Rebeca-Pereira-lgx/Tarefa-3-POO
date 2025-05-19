package Questão1;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Carro> carrosUtilizados;

    public Pessoa(String nome) {
        this.nome = nome;
        this.carrosUtilizados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void usarCarro(Carro carro) {
        carro.setMotoristaAtual(this);
        carrosUtilizados.add(carro);
        System.out.println(nome + " está usando o carro " + carro.getModelo());
    }

    public List<Carro> getCarrosUtilizados() {
        return carrosUtilizados;
    }
}