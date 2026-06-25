package uber;

import java.util.*;

public class Motorista {
    private String nome;
    private List<Corrida> corridas = new ArrayList<>();

    public Motorista(String nome) {
        this.nome = nome;
    }

    public void adicionarCorrida(Corrida c) {
        corridas.add(c);
    }

    public void listarCorridas() {
        for (Corrida c : corridas) {
            System.out.println(c.getOrigem() + " -> " + c.getDestino());
        }
    }

    public void mostrarPagamentos() {
        for (Corrida c : corridas) {
            System.out.println("R$ " + c.getPagamento().getValor());
        }
    }
}
