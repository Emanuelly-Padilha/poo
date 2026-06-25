package revisão;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalDate;

public class Biblioteca {

    public static void main(String[] args) {

        StatusLivro status = StatusLivro.DISPONIVEL;

        System.out.println(status);
        ArrayList<Livro> livros = new ArrayList<>();
        Livro livro1 = new Livro("Harry Potter", "J. K. Rowling", 1997);
        Livro livro2 = new Livro("Rejeita grávida do mafioso romano", "Aline Padúa", 2026);

        livros.add(livro1);
        livros.add(livro2);
        System.out.println("Lista original:");
        for (Livro livro : livros) {
            System.out.println(livro);

        }
        Iterator<Livro> it = livros.iterator();
        while (it.hasNext()) {
            Livro livro = it.next();
            if (livro.ano() < 2015) {
                it.remove();
            }
        }
        System.out.println("\nApós remover:");
        for (Livro livro : livros) {
            System.out.println(livro);

        }
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite o ano do livro: ");
            int ano = sc.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Digite apenas números!");

        }
        LocalDate hoje = LocalDate.now();

        int idade = hoje.getYear() - livro1.ano();

        System.out.println("Data atual: " + hoje);
        System.out.println("O livro foi publicado há " + idade + " anos.");
        Bibliotecario b = new Bibliotecario();
        b.apresentar();
        BibliotecaGenerica<Livro> biblioteca = new BibliotecaGenerica<>();

        biblioteca.adicionar(livro1);
        biblioteca.adicionar(livro2);

        biblioteca.listar();
    }
}