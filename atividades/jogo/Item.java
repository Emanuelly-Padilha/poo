package jogo;

public class Item {
    private String nome;
    private boolean equipavel;

    public Item(String nome, boolean equipavel) {
        this.nome = nome;
        this.equipavel = equipavel;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEquipavel() {
        return equipavel;
    }
}
