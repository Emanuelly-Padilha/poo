package revisão;

import java.util.ArrayList;

public class BibliotecaGenerica<T> {

    private ArrayList<T> itens = new ArrayList<>();

    public void adicionar(T objeto) {
        itens.add(objeto);
    }

    public void listar() {
        for (T item : itens) {
            System.out.println(item);
        }
    }
}