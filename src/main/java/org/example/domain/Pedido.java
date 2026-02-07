package org.example.domain;

public class Pedido {
    private String id;
    private double valor; // valor do pedido

    public Pedido(String id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }
}
