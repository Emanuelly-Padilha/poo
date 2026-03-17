package DAO;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOList implements ProdutoDAO {

    private List<Produto> produtos = new ArrayList<>();

    public void inserir(Produto p) {
        produtos.add(p);
    }

    public List<Produto> listar() {
        return produtos;
    }

    public Produto buscarPorId(int codigo) {
        for (Produto p : produtos) {
            if (p.getId() == codigo) {
                return p;
            }
        }
        return null;
    }

    public void remover(int codigo) {

        Produto remover = null;

        for (Produto p : produtos) {
            if (p.getId() == codigo) {
                remover = p;
                break;
            }
        }

        if (remover != null) {
            produtos.remove(remover);
        }
    }

}