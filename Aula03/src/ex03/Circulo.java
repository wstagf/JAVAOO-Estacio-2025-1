package ex03;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio); // Usando o setter para validação
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Raio inválido. Deve ser um valor positivo.");
        }
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}