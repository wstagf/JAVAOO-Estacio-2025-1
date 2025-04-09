import modelos.Cliente;
import modelos.Funcionario;
import modelos.MenuItem;
import modelos.Pedido;

public class Main {
    public static void main(String[] args) {

        Funcionario antonio = new Funcionario();

        antonio.nome = "Antonio";
        antonio.matricula = 123456;

        Pedido p = new Pedido();

        p.numeroPedidio = 1010;
        antonio.trabalhar(p);

    }
}