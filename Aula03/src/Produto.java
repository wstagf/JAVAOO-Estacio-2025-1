public class Produto {
    String nome;
    double preco;
    int quantidade;

    void comprar(int quantidade) {
        this.quantidade += quantidade;
    }

    void vender(int quantidade) {
            this.quantidade -= quantidade;
    }
}