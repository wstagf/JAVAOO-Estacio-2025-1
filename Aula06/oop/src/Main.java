import model.Bibliotecario;
import model.Livro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-3-16-148410-0");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "978-0-7475-3269-9");

        // Criando um bibliotecário
        Bibliotecario bibliotecario = new Bibliotecario("Carlos", 101);

        // Adicionando livros
        bibliotecario.adicionarLivro(livro1);
        bibliotecario.adicionarLivro(livro2);

        // Listando livros
        bibliotecario.listarLivros();

        // Emprestando um livro
        livro1.emprestar();

        // Tentando emprestar o mesmo livro novamente
        livro1.emprestar();

        // Devolvendo o livro
        livro1.devolver();

        // Removendo um livro
        bibliotecario.removerLivro(livro2);

        // Listando os livros restantes
        bibliotecario.listarLivros();
    }
}







