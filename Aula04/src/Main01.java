import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salario: ");

        double salarioAutal = leitor.nextDouble();
        double fator = 25.0/100.0;
        double aumento = salarioAutal * fator;
        double novoSalario =salarioAutal + aumento;

        System.out.println("O novo salario sera: " + novoSalario);
    }
}