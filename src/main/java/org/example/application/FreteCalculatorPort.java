package org.example.application;


import org.example.domain.Pedido;

public interface FreteCalculatorPort {
    double calcularFrete(Pedido pedido);
}
