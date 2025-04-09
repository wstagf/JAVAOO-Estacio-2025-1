package model;

public class ContaBancaria {
    private double saldo;


    public void depositar(double valor) {
        boolean dinheiroDeVerdade = true;
        if(dinheiroDeVerdade) {
            this.saldo = this.saldo + valor;
        }

    }

    public void saque(double valor) {
       if(valor <= this.saldo) {
           this.saldo = this.saldo - valor;
       } else {
           System.out.println(" Voce nao possuio tanto dinheiro assim");
       }
    }

    public  void getSaldo() {
        System.out.println("Minha conta possui " + this.saldo);
    }
}
