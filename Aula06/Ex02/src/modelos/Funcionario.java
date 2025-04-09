package modelos;

import modelos.Pedido;

public class Funcionario {

    public int matricula;
    public String nome;

    public void trabalhar(Pedido p) {

        System.out.println(
                " Estou fingindo que trablaho " +p.numeroPedidio
        );
    }
}
