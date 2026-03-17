package DAO;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ProdutoDAO dao = new ProdutoDAOList();

        //não vai funcionar porque não tem banco 
        //ProdutoDAO dao = new ProdutoDAOJDBC();

          dao.inserir(new Produto(1, "Notebook", 3500.0));
        dao.inserir(new Produto(2, "Mouse", 80.00));
        dao.inserir(new Produto(3, "Teclado", 150.00));

        int opcao;

        do {

            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Remover");

            opcao = ler.nextInt();

            switch (opcao) {

                // inserir
                case 1:

                    System.out.println("Id:");
                    int idInserir = ler.nextInt();
                    ler.nextLine();

                    System.out.println("Descricao:");
                    String descricao = ler.nextLine();

                    System.out.println("Valor:");
                    double valor = ler.nextDouble();

                    dao.inserir(new Produto(idInserir, descricao, valor));
                    break;

                // listar
                case 2:

                    List<Produto> lista = dao.listar();

                    for (Produto p : lista) {
                       System.out.println(
                            p.getId() + " - " +
                            p.getDescrição() + " - " +
                            p.getValor()
                        );
                    }

                    break;

                // buscar
                case 3:

                    System.out.println("Id:");
                    int idBuscar = ler.nextInt();

                    Produto p = dao.buscarPorId(idBuscar);

                    if (p != null) {
                        System.out.println(
                            p.getId() + " - " +
                            p.getDescrição() + " - " +
                            p.getValor()
                        );
                    } else {
                        System.out.println("Nao encontrado");
                    }

                    break;

                // remover
                case 4:

                    System.out.println("Id:");
                    int remover = ler.nextInt();

                    dao.remover(remover);
                    break;
            }

        } while (opcao != 0);

        ler.close();
    }
}