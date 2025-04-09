package model;

public class Funcionario {
    public String nome;
    public double salario;


    public void aumentarSalario(double perct){
        salario = salario + (salario * perct );
    }


    public void seAmostrar() {
        System.out.println("Meu nome 'e "+this.nome+", ganho " + this.salario);
    }
}
