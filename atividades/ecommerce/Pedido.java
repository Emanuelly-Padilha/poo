package ecommerce;


public class Pedido {
    private List<Produto> produtos = new ArrayList<>();
    private Cliente cliente;
    private NotaFiscal nota;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.nota = new NotaFiscal(); // composição
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}