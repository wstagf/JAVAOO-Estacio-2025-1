package modelos;
import java.util.ArrayList;


public class Pedido {
    public int numeroPedidio;
    public String status;
    public ArrayList<MenuItem> lista = new ArrayList<MenuItem>();


    public void adicionarItens(MenuItem item){
        lista.add(item);
    }

    public void calcularTotal(){
        double valorTotal = 0;
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(" Adicionado o item "  + (i+1) + " no pedido");
            valorTotal = valorTotal + lista.get(i).preco;
        }
        System.out.println("O valor total do pedido 'e " + valorTotal);
    }
}


