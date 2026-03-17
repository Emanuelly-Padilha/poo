package DAO.object;

import java.util.List;
import java.util.Scanner;

import DAO.Produto;


//Esse é só um exemplo, ou seja, não vai rodar
public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // não vai funcionar porque não tem banco
        // ObjectDAO dao = new ObjectDAOJDBC();

        ObjectDAO dao = new ObjectDAOList();

        dao.inserir(new Produto(1, "Computador", 1000.0));
        dao.inserir(new Produto(2, "Mouse", 80.0));
        dao.inserir(new Produto(3, "Teclado", 150.0));

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
                    int id = ler.nextInt();
                    ler.nextLine();

                    System.out.println("Descricao:");
                    String descricao = ler.nextLine();

                    System.out.println("Valor:");
                    double valor = ler.nextDouble();

                    dao.inserir(new Produto(id, descricao, valor));
                    break;

                // listar
                case 2:

                    List<Object> lista = dao.listar();

                    for (Object o : lista) {

                        if (o instanceof Produto) {
                            Produto pListar = (Produto) o;

                            System.out.println(
                                    pListar.getId() + " - " +
                                            pListar.getDescrição() + " - " +
                                            pListar.getValor());
                        }
                    }

                    break;

                // buscar id
                case 3:

                    System.out.println("Id:");
                    int buscar = ler.nextInt();

                    Object objBuscar = dao.buscarPorId(buscar);

                    if (objBuscar instanceof Produto) {
                        Produto p = (Produto) objBuscar;

                        System.out.println(
                                p.getId() + " - " +
                                        p.getDescrição() + " - " +
                                        p.getValor());

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