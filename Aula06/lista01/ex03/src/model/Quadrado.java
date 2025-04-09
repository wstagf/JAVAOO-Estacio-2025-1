package model;

public class Quadrado {
    public double largura;
    public  double altura;

    public  void calcularArea() {
        double total = this.altura * this.largura;
        System.out.println(
                "A aread do quadrado de "
                        +  this.largura
                        + " por "
                        + this.altura
                        + " 'e "
                        + total
                );
    }
}
