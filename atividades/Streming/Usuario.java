package Streming;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    String nome;
    List<Perfil> perfis = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void adicionarPerfil(Perfil perfil) {
        perfis.add(perfil);
    }

    public void mostrarPerfis() {
        for (Perfil p : perfis) {
            System.out.println(p.nome);
        }
    }
}