package model;


public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;

    // Construtor
    public Livro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    // Método para emprestar o livro
    public void emprestar() {

    }

    // Método para devolver o livro
    public void devolver() {

    }

    // Método para exibir informações do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
    }
}
