package uber;

public class Corrida {
    private String origem;
    private String destino;
    private double valor;
    private Pagamento pagamento;

    public Corrida(String origem, String destino, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.pagamento = new Pagamento(valor); 
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}