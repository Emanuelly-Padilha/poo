package hospital;


public class Medico {
    private String nome;
    private String espeialidade;

    public Medico(String nome, String espeialidade) {
        this.nome = nome;
        this.espeialidade = espeialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspeialidade() {
        return espeialidade;
    }
}
