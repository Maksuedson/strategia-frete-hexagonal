package org.example;

import org.example.domain.Pedido;
import org.example.domain.service.FreteService;
import org.example.infra.strattegy.CorreiosFreteStrategy;
import org.example.infra.strattegy.FedExFreteStrategy;
import org.example.infra.strattegy.MercadoLivreFreteStrategy;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("123", 1000); // pedido de R$ 1000

        FreteService freteCorreios = new FreteService(new CorreiosFreteStrategy());
        FreteService freteMercadoLivre = new FreteService(new MercadoLivreFreteStrategy());
        FreteService freteFedEx = new FreteService(new FedExFreteStrategy());

        System.out.println("Frete Correios: " + freteCorreios.calcular(pedido));
        System.out.println("Frete Mercado Livre: " + freteMercadoLivre.calcular(pedido));
        System.out.println("Frete FedEx: " + freteFedEx.calcular(pedido));
    }
}
