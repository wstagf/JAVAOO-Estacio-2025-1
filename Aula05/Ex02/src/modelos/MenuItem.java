package modelos;

public class MenuItem {
    public String nome;
    public double preco;

    public void exibirDetalhes() {
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("Produto: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("-----------");
        System.out.println("-----------");
    }
}
