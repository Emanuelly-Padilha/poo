package DAO.object;

import java.util.List;

import DAO.Produto;

public class ObjectDAOList implements ObjectDAO {

    List<Object> objects;

    public ObjectDAOList() {
        this.objects = new java.util.ArrayList<>();
    }

    @Override
    public void inserir(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public List<Object> listar() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'listar'");
        return objects;
    }

    // exemplo
    @Override
    public Object buscarPorId(int id) {
        for (Object o : objects) {
            if (o instanceof Produto) {
                Produto p = (Produto) o;
                if (p.getId() == id) {
                    return p;
                }
            }
        }

        return null;
    }

    @Override
    public void remover(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

}
