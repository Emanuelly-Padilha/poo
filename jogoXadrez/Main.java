package jogoXadrez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cavalo cavalo = new Cavalo("branco", 1, 0);
        Bispo bispo = new Bispo("preto", 0, 2);

        System.out.println("O Cavalo se move em L: duas casas em uma direção e uma na outra.");
        System.out.println("O Bispo se move na diagonal: o número de linhas e colunas deve ser igual.");

        System.out.println("Digite a linha destino para o Cavalo:");
        int linhaDestinoCavalo = entrada.nextInt();

        System.out.println("Digite a coluna destino para o Cavalo:");
        int colunaDestinoCavalo = entrada.nextInt();

        System.out.println("Digite a linha destino para o Bispo:");
        int linhaDestinoBispo = entrada.nextInt();

        System.out.println("Digite a coluna destino para o Bispo:");
        int colunaDestinoBispo = entrada.nextInt();

        boolean movimentoCavaloValido = cavalo.validarMovimento(linhaDestinoCavalo, colunaDestinoCavalo);

        boolean movimentoBispoValido = bispo.validarMovimento(linhaDestinoBispo, colunaDestinoBispo);

        System.out.println("Cavalo: movimento válido? " + movimentoCavaloValido);
        System.out.println("Bispo: movimento válido? " + movimentoBispoValido);

    }
}
