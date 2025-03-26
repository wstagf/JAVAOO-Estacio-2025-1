package model;
import java.util.ArrayList;

public class Bibliotecario {
    private String nome;
    private int idFuncionario;
    private ArrayList<Livro> livros; // Lista de livros gerenciados pelo bibliotecário

    // Construtor
    public Bibliotecario(String nome, int idFuncionario) {
        this.nome = nome;
        this.idFuncionario = idFuncionario;
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro \"" + livro + "\" adicionado à biblioteca.");
    }

    // Método para remover um livro da biblioteca
    public void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro \"" + livro + "\" removido da biblioteca.");
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }

    // Método para listar todos os livros
    public void listarLivros() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println("-------------------");
        }
    }
}
