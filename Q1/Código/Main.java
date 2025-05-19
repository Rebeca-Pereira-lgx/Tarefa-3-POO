package Questão1;

public class Main {
    public static void main(String[] args) {
        Pessoa rebeca = new Pessoa("Rebeca");
        Pessoa railton = new Pessoa("Railton");

        Carro carro1 = new Carro("Ônix");
        Carro carro2 = new Carro("Kwid");

        rebeca.usarCarro(carro1);
        carro1.dirigir();

        railton.usarCarro(carro2);
        carro2.dirigir();

        rebeca.usarCarro(carro2);
        carro2.dirigir();

        System.out.println("\nCarros usados por Rebeca:");
        for (Carro c : rebeca.getCarrosUtilizados()) {
            System.out.println("- " + c.getModelo());
        }

        System.out.println("\nMotorista atual do carro2: " + carro2.getMotoristaAtual().getNome());
    }
}
