package DAO.generics;

import DAO.Cliente;
import DAO.Produto;

public class Main {
    public static void main(String[] args) {

        // Produto
        GenericDAOList<Produto> produtoDAO = new GenericDAOList<>();

        produtoDAO.inserir(new Produto(1, "Notebook", 3500.0));
        produtoDAO.inserir(new Produto(2, "Mouse", 80.0));
        produtoDAO.inserir(new Produto(3, "Teclado", 150.0));

        for (Produto p : produtoDAO.listar()) {
            System.out.println(
                    p.getId() + " - " +
                            p.getDescrição() + " - " +
                            p.getValor());
        }

        // Cliente
        GenericDAOList<Cliente> clienteDAO = new GenericDAOList<>();
        clienteDAO.inserir(new Cliente(1, "Luke", "luke@gmail.com"));
        clienteDAO.inserir(new Cliente(2, "Darth", "darth@gmail.com"));
        clienteDAO.inserir(new Cliente(3, "Leia", "leia@gmail.com"));

        for (Cliente c : clienteDAO.listar()) {
            System.out.println(
                    c.getId() + " - " +
                            c.getNome() + " - " +
                            c.getEmail());
        }
    }
}
