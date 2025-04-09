package model;

public class Produto {
    private double preco;
    private String nome;
    private double desconto;

    public Produto(String nomeX, double precoX, double descontoX){
        this.nome = nomeX;
        this.preco = precoX;
        this.desconto = descontoX;
    }


    public double calcularPrecoFinal() {
        double precoFinal = preco - (preco * desconto);
        return precoFinal;
    }
}
