public class ProdutoCorreto {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoCorreto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    void comprar(int quantidade) {
        this.quantidade += quantidade;
    }

    void vender(int quantidade) {
            this.quantidade -= quantidade;
    }
}