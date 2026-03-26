package jogo;

import java.util.*;

public class Inventario {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item i) {
        itens.add(i);
    }

    public void listarItens() {
        for (Item i : itens) {
            System.out.println(i.getNome());
        }
    }

    public void itensEquipados() {
        for (Item i : itens) {
            if (i.isEquipavel()) {
                System.out.println(i.getNome());
            }
        }
    }
}