package DAO;

public class Produto {

    private int id;
    private String descrição;
    private double valor;

    public Produto(int id, String descricao, double valor) {
        this.id = id;
        this.descrição = descricao;
        this.valor = valor;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
