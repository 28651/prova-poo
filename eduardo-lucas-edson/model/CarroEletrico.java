package model;

public class CarroEletrico extends Carro implements Recarregavel {

    private static final double TAXA_BATERIA_POR_DIA = 15.00;
    private static final double CUSTO_KWH = 0.80;

    private double consumoDiario;

    public CarroEletrico(String placa, String modelo,
                         double valorDiaria, double consumoDiario) {
        super(placa, modelo, valorDiaria);
        this.consumoDiario = consumoDiario;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = super.calcularAluguel(dias);
        return total + (TAXA_BATERIA_POR_DIA * dias);
    }

    @Override
    public double calcularCustoRecarga(int dias) {
        return dias * consumoDiario * CUSTO_KWH;
    }
}
