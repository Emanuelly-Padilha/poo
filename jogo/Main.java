package jogo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Personagem p = new Personagem("Guerreiro");
        Guilda g = new Guilda("Lendarios");
        g.adicionarMembro(p);

        Item espada = new Item("Espada", true);
        Item poção = new Item("Poção", false);

        p.getInventario().adicionarItem(espada);
        p.getInventario().adicionarItem(poção);

        int op;
        do {
            System.out.println("\n1 - Ver inventário");
            System.out.println("2 - Ver guilda");
            System.out.println("3 - Ver itens equipados");
            System.out.println("0 - Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    p.getInventario().listarItens();
                    break;
                case 2:
                    g.listarMembros();
                    break;
                case 3:
                    p.getInventario().itensEquipados();
                    break;
            }
        } while (op != 0);
    }
}