package uber;

import java.util.*;

public class Passageiro {
    private String nome;
    private List<Corrida> corridas = new ArrayList<>();

    public Passageiro(String nome) {
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
}