import modelos.Cliente;
import modelos.MenuItem;
import modelos.Pedido;

public class Main {
    public static void main(String[] args) {

        System.out.println("Carregando nosso Programa");

        MenuItem item1 = new MenuItem();

        item1.nome = "Mouse Pad";
        item1.preco = 9.90;

        item1.exibirDetalhes();

        MenuItem item2;
        item2 = new MenuItem();

        item2.nome = "Mouse gamer";
        item2.preco = 990;

        item2.exibirDetalhes();


        Cliente felipe = new
                Cliente(
                "Felipe",
                "90909090");

        felipe.iniciarPedido(12);

        felipe.adicionarItem(item1);
        felipe.adicionarItem(item2);
        felipe.adicionarItem(item1);
        felipe.adicionarItem(item2);

        felipe.descobrirTotal();

        felipe.cancelarPedido();





    }
}