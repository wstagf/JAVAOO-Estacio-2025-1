package ex02;

public class Biblioteca {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 863);
        Livro livro2 = new Livro("1984", "George Orwell", -10); // Número de páginas inválido

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Páginas: " + livro1.getNumeroPaginas());

        livro1.setNumeroPaginas(900);
        System.out.println("Novo número de páginas: " + livro1.getNumeroPaginas());
    }

}
