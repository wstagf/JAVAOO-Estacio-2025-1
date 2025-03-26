package model;


public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean emprestado;

    // Construtor
    public Livro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.emprestado = false; // Por padrão, o livro não está emprestado
    }

    // Método para emprestar o livro
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está disponível.");
        }
    }

    // Método para exibir informações do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }
}
