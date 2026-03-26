package Streming;

import java.util.ArrayList;
import java.util.List;

public class Perfil {

    String nome;
    List<Conteudo> assistidos = new ArrayList<>();

    public Perfil(String nome) {
        this.nome = nome;
    }

    public void assistir(Conteudo conteudo) {
        assistidos.add(conteudo);
    }
    public void mostrarAssistidos() {
    for (Conteudo c : assistidos) {
        System.out.println(c.titulo);
    }
}
}