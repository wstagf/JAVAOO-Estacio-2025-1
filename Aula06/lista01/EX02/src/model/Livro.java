package model;

public class Livro {
    public String titulo;
    public String autor;

    public void detalhes() {
        System.out.println("Esse livro se chama " + this.titulo +
                " e foi escrito por " + this.autor);
    }
}
