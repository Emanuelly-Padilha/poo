package jogo;

public class Personagem {
    private String nome;
    private Inventario inventario;

    public Personagem(String nome) {
        this.nome = nome;
        this.inventario = new Inventario();
    }

    public Inventario getInventario() {
        return inventario;
    }

    public String getNome() {
        return nome;
    }
}
