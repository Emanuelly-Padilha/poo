package jogoXadrez;

public class Bispo extends Peca {
    public Bispo(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    @Override
    public boolean validarMovimento(int linhaDestino, int colunaDestino) {
        return Math.abs(linhaDestino - this.linha) == Math.abs(colunaDestino - this.coluna);

    }

}
