package ex01;

public class Banco {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de R$ 1000
        ContaBancaria conta = new ContaBancaria("12345-6", 1000.0);

        // Exibindo saldo inicial
        System.out.println("Saldo inicial da conta " + conta.getNumeroConta() + ": R$ " + conta.getSaldo());

        // Realizando operações
        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(2000); // Tentativa de saque maior que o saldo disponível

        // Tentando modificar o saldo diretamente (Não é possível devido ao encapsulamento)
        // conta.saldo = 5000;  // Isso geraria um erro de compilação, pois saldo é privado

        // Exibindo saldo final
        System.out.println("Saldo final da conta " + conta.getNumeroConta() + ": R$ " + conta.getSaldo());
    }
}