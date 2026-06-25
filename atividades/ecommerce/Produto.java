package ecommerce;

public class Produto {
    private String nome;
    private Fornecedor fornecedor;

    public Produto(String nome, Fornecedor fornecedor) {
        this.nome = nome;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
}