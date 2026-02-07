package org.example.infra.strattegy;


import org.example.application.FreteCalculatorPort;
import org.example.domain.Pedido;

public class FedExFreteStrategy implements FreteCalculatorPort {

    private final double ALIQUOTA = 0.10; // 10% do valor do pedido

    @Override
    public double calcularFrete(Pedido pedido) {
        return pedido.getValor() * ALIQUOTA;
    }
}
