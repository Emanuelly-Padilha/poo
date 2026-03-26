package uber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Passageiro p = new Passageiro("Ana");
        Motorista m = new Motorista("Carlos");

        int op;
        do {
            System.out.println("\n1 - Criar corrida");
            System.out.println("2 - Corridas motorista");
            System.out.println("3 - Corridas passageiro");
            System.out.println("4 - Ver pagamento");
            System.out.println("0 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Origem: ");
                    String origem = sc.nextLine();

                    System.out.print("Destino: ");
                    String destino = sc.nextLine();

                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();

                    Corrida c = new Corrida(origem, destino, valor);

                    m.adicionarCorrida(c);
                    p.adicionarCorrida(c);

                    System.out.println("Corrida criada!");
                    break;

                case 2:
                    m.listarCorridas();
                    break;

                case 3:
                    p.listarCorridas();
                    break;

                case 4:
                    m.mostrarPagamentos();
                    break;
            }
        } while (op != 0);
    }
}
