package ecommerce;

import java.util.*;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarPedido(Pedido p) {
        pedidos.add(p);
    }

    public void listarPedidos() {
        for (Pedido p : pedidos) {
            System.out.println("Pedido com " + p.getProdutos().size() + " produtos");
        }
    }

    public void mostrarProdutos() {
        for (Pedido p : pedidos) {
            for (Produto prod : p.getProdutos()) {
                System.out.println(prod.getNome());
            }
        }
    }
}