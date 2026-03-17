package DAO.generics;

import java.util.List;

import java.util.ArrayList;

public class GenericDAOList<T> implements GenericDAO<T> {

    private List<T> lista;

    public GenericDAOList() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void inserir(T object) {
        lista.add(object);
    }

    @Override
    public List<T> listar() {
        return lista;
    }

    @Override
    public T buscarPorId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public void remover(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

}
