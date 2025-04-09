package model;

public class Pessoa {

    public  String nome;
    public int idade;


    public void apresentar() {
        System.out.println(" Meu nome 'e " + this.nome +", tenho "
                + this.idade+" anos");
    }
}
