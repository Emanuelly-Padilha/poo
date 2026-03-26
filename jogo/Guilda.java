package jogo;

import java.util.*;

public class Guilda {
    private String nome;
    private List<Personagem> membros = new ArrayList<>();

    public Guilda(String nome) {
        this.nome = nome;
    }

    public void adicionarMembro(Personagem p) {
        membros.add(p);
    }

    public void listarMembros() {
        for (Personagem p : membros) {
            System.out.println(p.getNome());
        }
    }
}