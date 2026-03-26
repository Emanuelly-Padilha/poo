package Streming;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Conteudo {

    String diretor;
    List<Ator> atores = new ArrayList<>();

    public Filme(String titulo, String diretor) {
        super(titulo);
        this.diretor = diretor;
    }

    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    public void mostrarAtores() {
        for (Ator a : atores) {
            System.out.println(a.nome);
        }
    }

    
}