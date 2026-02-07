package org.example.domain.service;

import org.example.application.FreteCalculatorPort;
import org.example.domain.Pedido;

public class FreteService {

    private final FreteCalculatorPort freteCalculator;

    public FreteService(FreteCalculatorPort freteCalculator) {
        this.freteCalculator = freteCalculator;
    }

    public double calcular(Pedido pedido) {
        return freteCalculator.calcularFrete(pedido);
    }
}
