package model;

public class Carro extends Veiculo {

    private static final double TAXA_SEGURO = 0.10;

    public Carro(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = getValorDiaria() * dias;
        return total + (total * TAXA_SEGURO);
    }
}
