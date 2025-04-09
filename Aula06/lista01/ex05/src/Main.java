import model.ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        c.depositar(100);

        c.saque(55);

        c.getSaldo();
    }
}