package app;

import model.Carro;
import model.CarroEletrico;
import model.Moto;
import model.Recarregavel;
import model.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("ABC1234", "Onix", 150.00);
        Moto motoQuatroDias = new Moto("DEF5678", "Honda CG", 80.00);
        Moto motoCincoDias = new Moto("GHI9012", "Yamaha", 80.00);
        CarroEletrico eletrico = new CarroEletrico(
                "JKL3456", "Tesla Model 3", 200.00, 10.00
        );

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro);
        veiculos.add(motoQuatroDias);
        veiculos.add(motoCincoDias);
        veiculos.add(eletrico);

        int[] diasAluguel = {3, 4, 5, 3};

        System.out.println("=== ALUGUEL DOS VEICULOS ===");

        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculo = veiculos.get(i);
            veiculo.imprimirResumo();
            System.out.printf("Aluguel: R$ %.2f%n",
                    veiculo.calcularAluguel(diasAluguel[i]));
            System.out.println("--------------------");
        }

        List<Recarregavel> recarregaveis = new ArrayList<>();
        recarregaveis.add(eletrico);

        System.out.println("\n=== CUSTO DE RECARGA ===");

        for (Recarregavel recarregavel : recarregaveis) {
            System.out.printf("Recarga: R$ %.2f%n",
                    recarregavel.calcularCustoRecarga(3));
        }
    }
}
