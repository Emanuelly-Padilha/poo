package ecommerce;
import java.util.*;
public class Main {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Emanu");

        Fornecedor f1 = new Fornecedor("Fornecedor A");
        Produto p1 = new Produto("Notebook", f1);
        Produto p2 = new Produto("Mouse", f1);

        int op;
        do {
            System.out.println("\n1 - Fazer pedido");
            System.out.println("2 - Ver pedidos");
            System.out.println("3 - Ver produtos do pedido");
            System.out.println("4 - Ver fornecedor");
            System.out.println("0 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    Pedido pedido = new Pedido(cliente);

                    pedido.adicionarProduto(p1);
                    pedido.adicionarProduto(p2);

                    cliente.adicionarPedido(pedido);
                    System.out.println("Pedido criado!");
                    break;

                case 2:
                    cliente.listarPedidos();
                    break;

                case 3:
                    cliente.mostrarProdutos();
                    break;

                case 4:
                    System.out.println(p1.getFornecedor().getNome());
                    break;
            }
        } while (op != 0);
    }
}

