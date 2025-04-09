import model.Quadrado;

public class Main {
    public static void main(String[] args) {
        Quadrado lote = new Quadrado();
        lote.largura = 12;
        lote.altura = 30;

        lote.calcularArea();

        Quadrado loteDoJaciel = new Quadrado();
        loteDoJaciel.largura = 10;
        loteDoJaciel.altura = 25;

        loteDoJaciel.calcularArea();
        System.out.println("Hello, World!");
    }
}