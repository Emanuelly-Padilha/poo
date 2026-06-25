package jogoXadrez;

public class Cavalo extends Peca {
    public Cavalo(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    @Override
    public boolean validarMovimento(int linhaDestino, int colunaDestino) {
        int diffLinha = Math.abs(linhaDestino - this.linha);
        int diffColuna = Math.abs(colunaDestino - this.coluna);

        if ((diffLinha == 2 && diffColuna == 1) || (diffLinha == 1 && diffColuna == 2)) {
            return true;
        }
        return false;
    }
}
