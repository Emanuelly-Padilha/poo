
package jogoXadrez;

public class Peca {
    String cor;
    int linha;
    int coluna;

    public Peca(String cor, int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
    }

    public boolean validarMovimento(int linhaDestino, int colunaDestino) {

        return false;
    }
}
