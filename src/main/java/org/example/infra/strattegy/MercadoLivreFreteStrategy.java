package org.example.infra.strattegy;

import org.example.application.FreteCalculatorPort;
import org.example.domain.Pedido;

public class MercadoLivreFreteStrategy implements FreteCalculatorPort {

    private final double ALIQUOTA = 0.07; // 7% do valor do pedido

    @Override
    public double calcularFrete(Pedido pedido) {
        return pedido.getValor() * ALIQUOTA;
    }
}
