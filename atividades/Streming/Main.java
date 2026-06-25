package Streming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario user = new Usuario("Emanuelly");
        Perfil perfil = new Perfil("Pessoal");

        user.adicionarPerfil(perfil);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n1 - Assistir Filme");
            System.out.println("2 - Assistir Série");
            System.out.println("3 - Ver assistidos");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do filme:");
                    String nomeFilme = sc.nextLine();

                    Filme filme = new Filme(nomeFilme, "Diretor X");
                    perfil.assistir(filme);
                    break;

                case 2:
                    System.out.println("Digite o nome da série:");
                    String nomeSerie = sc.nextLine();

                    Serie serie = new Serie(nomeSerie, 1);
                    perfil.assistir(serie);
                    break;

                case 3:
                    System.out.println("\nConteúdos assistidos:");
                    perfil.mostrarAssistidos();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        
    }
}