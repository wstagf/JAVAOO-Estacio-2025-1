package ex03;

public class Area {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(-2); // Raio inválido

        System.out.println("Raio: " + circulo1.getRaio());
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Circunferência: " + circulo1.calcularCircunferencia());

        circulo1.setRaio(7);
        System.out.println("Novo raio: " + circulo1.getRaio());
        System.out.println("Nova área: " + circulo1.calcularArea());
        System.out.println("Nova circunferência: " + circulo1.calcularCircunferencia());
    }

}
