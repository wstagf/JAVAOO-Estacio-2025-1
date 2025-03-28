package modelos;

public class Cliente {
    public String nome;
    public String contato;
    private Pedido p;

    public Cliente(String nome, String contato){

        this.nome = nome;
        this.contato = contato;
//        p.adicionarItens(item1);
//        p.adicionarItens(item2);
//        p.calcularTotal();
    }


    public void iniciarPedido(int numeroPedido){
        p = new Pedido();
        p.numeroPedidio = numeroPedido;
        p.status = "INICIADO";
        System.out.println(" O pedido se encontra " + p.status);

    }

    public void adicionarItem(MenuItem item) {
        System.out.println(" Vai ser adicionado o item " + item.nome + " com o valor " + item.preco);
        p.adicionarItens(item);
    }

    public void descobrirTotal() {
        System.out.println("Calcular o total");
        p.calcularTotal();
    }



    public void cancelarPedido(){
        p.status = "CANCELADO";
        System.out.println(" O pedido se encontra " + p.status);
    }
}
